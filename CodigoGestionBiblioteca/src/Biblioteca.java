import java.util.ArrayList;
import java.util.List;

public class Biblioteca {

    // Relaciones
    private List<Usuario> usuarios;

    public Biblioteca() {
        this.usuarios = new ArrayList<>();
    }

    public void agregarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void eliminarUsuario(Usuario usuario) {
        usuarios.remove(usuario);
    }
}
