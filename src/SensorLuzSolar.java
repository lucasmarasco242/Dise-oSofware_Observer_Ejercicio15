public class SensorLuzSolar {
    private String id;
    private int luminosidadLux;
    private ObservadorLuz[] observadores = new ObservadorLuz[10];
    private int cantidad = 0;

    public SensorLuzSolar(String id) {
        this.id = id;
        this.luminosidadLux = 0;
    }

    public void suscribir(ObservadorLuz observador) {
        if (observador == null || cantidad >= observadores.length) {
            return;
        }
        for (int i = 0; i < cantidad; i++) {
            if (observadores[i] == observador) {
                return;
            }
        }
        observadores[cantidad] = observador;
        cantidad++;
    }

    public void desuscribir(ObservadorLuz observador) {
        for (int i = 0; i < cantidad; i++) {
            if (observadores[i] == observador) {
                for (int j = i; j < cantidad - 1; j++) {
                    observadores[j] = observadores[j + 1];
                }
                observadores[cantidad - 1] = null;
                cantidad--;
                return;
            }
        }
    }

    public void actualizarLuminosidad(int nuevosLux) {
        if (nuevosLux < 0) {
            return;
        }
        this.luminosidadLux = nuevosLux;
        notificar();
    }

    public int getLuminosidadLux() {
        return luminosidadLux;
    }

    private void notificar() {
        for (int i = 0; i < cantidad; i++) {
            observadores[i].alCambiarLuminosidad(id, luminosidadLux);
        }
    }
}