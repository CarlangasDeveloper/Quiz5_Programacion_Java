import java.util.LinkedList;    //Se importa la biblioteca linkedlist para concatenar los datos en una lista

/**
 * Clase Biblioteca
 */
public class Biblioteca {
    /**
     * Atributos
     */
    public LinkedList<Libro> librosDisponibles = new LinkedList<>();    //Lista de libros disponibles

    /**
     * Método que permite registrar los libros
     * 
     * @param libro Libro con toda la información (Titulo, Autor, Número De Páginas)
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public void registrarLibro(Libro libro){
        librosDisponibles.add(libro);
    }

    /**
     * Método que permite buscar los libros agregados
     * 
     * @param titulo Titulo del libro
     * @return Retornar los libros buscados
     * 
     * Complejidad temporal: O(N) Tiempo lineal
     */
    public Libro buscarLibro(String titulo){
        for (int i = 0; i < librosDisponibles.size() ; i++){
            Libro libroBuscado = librosDisponibles.get(i);
            if(libroBuscado.getTitulo().equals(titulo)){
                return libroBuscado;
            }
        }
        return null;
    }

    /**
     * Método que permite mostrar los libros que hay disponibles en la biblioteca
     * 
     * @return Retorna los libros disponibles
     * 
     * Complejidad temporal: O(1) Tiempo constante
     */
    public LinkedList<Libro> mostraLibrosDisponibles(){
        return librosDisponibles;
    }
}