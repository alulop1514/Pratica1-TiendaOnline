import java.util.Scanner;

/**
 * Clase que representa un disco.
 */
public class Disco {

    /*
     * Atributos de la clase
     */
    private int codigo;
    private String titulo;
    private double precio;
    private int nEjemplares;

    public Disco(int codigo, String titulo, double precio, int nEjemplares) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.precio = precio;
        this.nEjemplares = nEjemplares;
    }
    public void leeDeTeclado() {
        Scanner scanner;

    }
    @Override
    public String toString() {
        return "Disco{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", nEjemplares=" + nEjemplares +
                '}';
    }
}
