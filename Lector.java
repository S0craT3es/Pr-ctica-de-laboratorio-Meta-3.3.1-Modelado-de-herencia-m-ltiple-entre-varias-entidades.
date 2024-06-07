public class Lector extends Usuario implements AccesoBiblioteca {
    private boolean membresia;

    public Lector(String nombre, int id, String email, boolean membresia) {
        super(nombre, id, email);
        this.membresia = membresia;
    }

    public boolean isMembresia() {
        return membresia;
    }

    public void setMembresia(boolean membresia) {
        this.membresia = membresia;
    }

    @Override
    public void registrar() {
        System.out.println("Registrando lector: " + getNombre());
    }

    @Override
    public void actualizarDatos() {
        System.out.println("Actualizando datos del lector: " + getNombre());
    }

    @Override
    public void accederRecurso() {
        System.out.println("Lector " + getNombre() + " accediendo a un recurso.");
    }

    @Override
    public void salirRecurso() {
        System.out.println("Lector " + getNombre() + " saliendo del recurso.");
    }
}
