public class App {
    public static void main(String[] args) throws Exception {
        Perro perro1 = new Perro("Max", "Pitbull");
        Perro perro2 = new Perro("Oldpar", "Shih Tzu");
        System.out.println("\n\nNombre: " + perro1.getNombre() + "   Raza: " + perro1.getRaza());
        System.out.println("\n\nNombre: " + perro2.getNombre() + "   Raza: " + perro2.getRaza());
        perro1.setNombre("Sparky");
        perro1.setRaza("Golden retriever");
        perro2.setNombre("Anna");
        perro2.setRaza("Poodle");
        System.out.println("\n\nNombre: " + perro1.getNombre() + "   Raza: " + perro1.getRaza());
        System.out.println("\n\nNombre: " + perro2.getNombre() + "   Raza: " + perro2.getRaza());
    }

}
