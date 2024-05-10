import java.util.Date;

public interface Historial {
    public boolean tienePublicaciones();
    public Date fechaPrestamo();
    public Date fechaDevolucion();
    public int publicacionesprestadas();
    public int publicacionesDevueltas();
    public int publicacionNoDevueltas();
}
