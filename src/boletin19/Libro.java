
package boletin19;

public class Libro implements Comparable{
    private String titulo;
    private String autor;
    private String isbn;
    private float prezo;
    private int numeroUnidades;

    public Libro() {
    }

    public Libro(String titulo, String autor, String isbn, float prezo, int numeroUnidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.prezo = prezo;
        this.numeroUnidades = numeroUnidades;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    public void setNumeroUnidades(int numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }

    @Override
    public String toString() {
        return "titulo=" + titulo + ", autor=" + autor + ", isbn=" + isbn + ", prezo=" + prezo + ", numeroUnidades=" + numeroUnidades;
    }

    @Override
    public int compareTo(Object o) {
        Libro l = (Libro)o;
        if(this.titulo.compareToIgnoreCase(l.titulo)>0){
            return 1;   
        }if(this.titulo.compareToIgnoreCase(l.titulo)<0){
            return -1;
        }else{
            return 0;
        }
        
    }
    
    
    
}
