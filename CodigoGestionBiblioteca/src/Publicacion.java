public class Publicacion {
    // atributos
    protected String autor;
    protected String fecha;
    protected String titulo;
    protected String editorial;
    protected String idioma;
    protected int codigoISBN;

    //relaciones
    private Bibliotecario bibliotecario;

    // métodos
    public void mostrarDatos() {
        System.out.println("Autor: " + autor);
        System.out.println("Fecha: " + fecha);
        System.out.println("Título: " + titulo);
        System.out.println("URL: " + editorial);
        System.out.println("Idioma: " + idioma);
        System.out.println("Código ISBN: " + codigoISBN);
    }
    public void mostrarEstado() {

    }
    public void mostrarTipoPublicacion() {

    }


}
