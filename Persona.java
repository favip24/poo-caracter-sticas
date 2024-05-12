public class Persona {
// Clases: Actúa como plantilla para la creación de objetos, definen las propiedades(atributos) y comportamientos(métodos) propios de un objeto específico.

// Atributos: Definen el estado(características) de un objeto, permite darle forma a esta "persona".
    String nombre;
    String apellido;
    int edad;
    float altura;
    Carrera carrera;

// Métodos: Son acciones(comportamientos) específicos de un objeto.
    public String darNombreCompleto() {
        return nombre + " " + apellido;
    // Nos va a devoler un string(texto) "nombre + apellido + texto"
    }

    public String enviarSaludo(String saludado) {
        return "Hola! ¿Cómo andas " + saludado + "?";   
    // A quién vamos a saludar
    }
}
