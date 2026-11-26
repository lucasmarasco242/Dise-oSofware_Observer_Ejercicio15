public class PersianasMotorizadas implements ObservadorLuz {
    private String nombre;

    public PersianasMotorizadas(String nombre) {
        this.nombre = nombre;
    }

    public void alCambiarLuminosidad(String sensorId, int lux) {
        if (lux >= 800) {
            System.out.println("[" + nombre + "] Luz alta (" + lux + " lux en " + sensorId + "). Cerrando persianas.");
        } else {
            System.out.println("[" + nombre + "] Luz moderada/baja (" + lux + " lux en " + sensorId + "). Abriendo persianas.");
        }
    }
}