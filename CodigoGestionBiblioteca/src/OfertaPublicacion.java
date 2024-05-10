public class OfertaPublicacion {
    // Atributos
    private String publicacion;

    // Relaciones
    private Estado estado;

    public OfertaPublicacion() {
        this.estado = Estado.DISPONIBLE; // Establecer el estado inicial como ACTIVO
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    //metodos
    public void reservarPublicacion(Publicacion publicacion) {

    }
    public void cancelarReservacion() {

    }
    public void obtenerInformacion(Publicacion publicacion) {

    }
}
