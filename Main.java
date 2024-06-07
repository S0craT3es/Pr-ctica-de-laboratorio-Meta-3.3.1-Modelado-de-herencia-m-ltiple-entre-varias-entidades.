public class Main {
    public static void main(String[] args) {
        Lector lector = new Lector("Juan Perez", 123, "juan.perez@example.com", true);

        // Uso de atributos y métodos
        lector.registrar();
        lector.actualizarDatos();
        lector.accederRecurso();
        lector.salirRecurso();
    }
}