/**
 * Clase Principal
 */
public class Principal {

    /**
     * Método inicial que es ejecutado
     * 
     * @param args
     * 
     * Complejidad temporal: 0(1) Tiempo constante
     */
    public static void main(String[] args) {
        Biblioteca bibliotecaKonradLorenz = new Biblioteca();   //Objeto de la clase Biblioteca, llamada bibliotecaKonradLorenz

        Libro cienAnos = new Libro("Cien años de soledad", "Gabriel Garcia Marquez", 496 ); //Libro #1
        bibliotecaKonradLorenz.registrarLibro(cienAnos);    //Registrar libro #1 con el método registrarLibro() creado en la clase Biblioteca

        Libro codigoDaVinci = new Libro("El código Da Vinci", "Dan Brown", 656);    //Libro #2
        bibliotecaKonradLorenz.registrarLibro(codigoDaVinci);   //Registrar libro #2 con el método registrarLibro() creado en la clase Biblioteca

        Libro milNovecientos = new Libro("1984", "George Orwell", 326); //Libro #3
        bibliotecaKonradLorenz.registrarLibro(milNovecientos);  //Registrar libro #3 con el método registrarLibro() creado en la clase Biblioteca

        Libro hobbit = new Libro("El Hobbit", "J.R.R. Tolkien", 310);   //Libro #4 
        bibliotecaKonradLorenz.registrarLibro(hobbit);  //Registrar libro #4 con el método registrarLibro() creado en la clase Biblioteca

        Libro odisea = new Libro("La Odisea", "Homero", 448);   //Libro #5
        bibliotecaKonradLorenz.registrarLibro(odisea);  //Registrar libro #5 con el método registrarLibro() creado en la clase Biblioteca
    }
}