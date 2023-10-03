/**
 * Clase Libro
 */
public class Libro {
    /**
     * Atributos
     */
    private String titulo;
    private String autor;
    private int numeroPaginas;

    /****************************************************************************************************/
    /******************************************** CONSTRUCTOR *******************************************/
    /****************************************************************************************************/

    /**
     * Método constructor para inicializar los atributos de la clase Libro
     * 
     * @param titulo Titulo del libro
     * @param autor Autor del libro
     * @param numeroPaginas Número de páginas del libro
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    /**
     * Método que agrega el titulo del libro
     * 
     * @param titulo Titulo del libro
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Método que agrega el autor del libro
     * 
     * @param autor Autor del libro
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * Método que agrega el número de páginas del libro
     * 
     * @param numeroPaginas Número de páginas del libro
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Método para obtener el titulo del libro
     * 
     * @return Retorna el titulo del libro
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getTitulo() {
        return this.titulo;
    }

    /**
     * Método para obtener el autor del libro
     * 
     * @return Retorna el autor del libro
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String getAutor() {
        return this.autor;
    }
 
    /**
     * Método para obtener el número de páginas del libro
     * 
     * @return Retorna el número de páginas del libro
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public int getNumeroPaginas() {
        return this.numeroPaginas;
    }
}
