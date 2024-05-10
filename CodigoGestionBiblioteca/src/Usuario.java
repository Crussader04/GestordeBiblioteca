import java.util.Date;

public class Usuario extends Persona implements Historial {
    // atributos
    private String tarjetaBiblioteca;

    //metodos
    public String verEstadoCuenta(){
        return "Estado de cuenta";
    }

    @Override
    public boolean tienePublicaciones() {
        return false;
    }

    @Override
    public Date fechaPrestamo() {
        return null;
    }

    @Override
    public Date fechaDevolucion() {
        return null;
    }

    @Override
    public int publicacionesprestadas() {
        return 0;
    }

    @Override
    public int publicacionesDevueltas() {
        return 0;
    }

    @Override
    public int publicacionNoDevueltas() {
        return 0;
    }
}
