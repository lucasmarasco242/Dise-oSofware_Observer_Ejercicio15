public class LucesInteriores implements ObservadorLuz {
    private String nombre;

    public LucesInteriores(String nombre) {
        this.nombre = nombre;
    }

    public void alCambiarLuminosidad(String sensorId, int lux) {
        if (lux >= 800) {
            System.out.println("[" + nombre + "] Luz solar intensa (" + lux + " lux en " + sensorId + "). Atenuando luces al 20%.");
        } else {
            System.out.println("[" + nombre + "] Poca luz natural (" + lux + " lux en " + sensorId + "). Subiendo luces al 80%.");
        }
    }
}