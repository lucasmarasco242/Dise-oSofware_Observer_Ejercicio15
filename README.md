Ejercicio 15 - Automatización de Persianas según Sensor de Luz Solar

Explicación del programa

En este ejercicio se implementó el patrón de diseño Observer para coordinar persianas motorizadas y luces interiores según los cambios de luminosidad de un sensor solar, sin utilizar librerías externas ni imports.
El programa cuenta con:
- Una interfaz ObservadorLuz con el método alCambiarLuminosidad(String sensorId, int lux).
- Dos clases actuadoras observadoras (PersianasMotorizadas y LucesInteriores) que ajustan su estado según la intensidad lumínica.
- Una clase SensorLuzSolar que gestiona los observadores y notifica al variar la luminosidad.

Luego, dentro del método main, se crea un sensor solar, se suscriben las persianas y las luces, y se actualizan los niveles de luminosidad.

Lógica utilizada

La lógica del programa consiste en:
- Definir una interfaz común ObservadorLuz para desacoplar SensorLuzSolar de los actuadores concretos.
- Permitir que cada actuador decida su respuesta mecánica o eléctrica según el nivel en lux recibido.
- Facilitar el agregado de nuevos dispositivos sin modificar SensorLuzSolar.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
[Persianas Sala] Luz moderada/baja (250 lux en Fachada Sur). Abriendo persianas.
[Luces Sala] Poca luz natural (250 lux en Fachada Sur). Subiendo luces al 80%.
[Persianas Sala] Luz alta (850 lux en Fachada Sur). Cerrando persianas.
[Luces Sala] Luz solar intensa (850 lux en Fachada Sur). Atenuando luces al 20%.

Captura de pantalla

<img width="761" height="210" alt="image" src="https://github.com/user-attachments/assets/3aab0482-5c4b-44d1-85e8-2c13b6fa3d14" />
