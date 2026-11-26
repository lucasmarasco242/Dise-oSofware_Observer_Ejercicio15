public class Main {
    public static void main(String[] args) {
        SensorLuzSolar sensorFachada = new SensorLuzSolar("Fachada Sur");

        ObservadorLuz persianas = new PersianasMotorizadas("Persianas Sala");
        ObservadorLuz luces = new LucesInteriores("Luces Sala");

        sensorFachada.suscribir(persianas);
        sensorFachada.suscribir(luces);

        sensorFachada.actualizarLuminosidad(250);
        sensorFachada.actualizarLuminosidad(850);
    }
}