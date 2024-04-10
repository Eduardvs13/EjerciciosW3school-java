public class App {
    public static void main(String[] args) throws Exception {
        Persona person1 = new Persona();
        Persona person2 = new Persona();
        person1.setNombre("Eduard");
        person2.setNombre("Moises");
        person1.setEdad(18);
        person2.setEdad(9);
        System.out.println("\n\nNombre: " + person1.getNombre() + "   Edad: " + person1.getEdad());
        System.out.println("\nNombre: " + person2.getNombre() + "   Edad: " + person2.getEdad());
    }
}
