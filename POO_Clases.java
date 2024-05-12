public class POO_Clases {
    public static void main(String[] args) throws Exception {
// Main: Nuestro método general donde se van a ejecutar todas las acciones propias de nuestra apliación

    Persona persona1 = new Persona();
// Persona(clase, instancia del objeto) persona1(objeto) = new Persona()(instancia de nueva persona).

        persona1.nombre = "Guada";
        persona1.apellido = "Cuper";
        persona1.edad = 22;
// Agregamos los Atributos

    Carrera carrera1 = new Carrera();
        carrera1.nombre = "Biotecnología";
        carrera1.duracion = 5;
        carrera1.enCurso = true;
// Instanciamos Carrera para sumarla y añadimos los atributos de esta

            System.out.println("Hola soy " + persona1.nombre + " " + persona1.apellido + ", tengo " + persona1.edad + " años.");
            System.out.println(persona1.darNombreCompleto() + " tiene " + persona1.edad + " años.");
            System.out.println(persona1.enviarSaludo("Favio Palermo"));
            System.out.println("Estoy cursando "  + carrera1.nombre + " que tiene una duración de " + carrera1.duracion + " años.");
// Hacemos una impresión en consola de lo que acabos de escribir en nuestro panel de trabajo

    Persona persona2 = new Persona();
    Carrera carrera2 = new Carrera();

        persona2.nombre = "Favio";
        persona2.apellido = "Palermo";
        persona2.edad = 24;
        carrera2.nombre = "Desarrollo de Software";
        carrera2.duracion = 3;
        carrera2.enCurso = true;

            System.out.println("Hola soy " + persona2.nombre + " " + persona2.apellido + ", tengo " + persona2.edad + " años.");
            System.out.println(persona2.darNombreCompleto() + " tiene " + persona2.edad + " años.");
            System.out.println(persona2.enviarSaludo("Guadalupe Cuper"));
            System.out.println("Estoy cursando "  + carrera2.nombre + " que tiene una duración de " + carrera2.duracion + " años.");
    }
}