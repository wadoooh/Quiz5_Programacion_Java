import java.util.ArrayList;
import java.util.List;
public class Principal {
    /**
     * El metodo Main
     * Explicación: Este método es el punto es el inicio de la aplicación al ejecutarla y se utiliza para crear una instancia de la clase Biblioteca,
     * registrar libros y mostrar cosas registradas sobre este las cuales pueden ser el Titulo, el autor y el numero de paginas dependiendo el libro que sea.
     * Complejidad temporal: O(1) - Tiempo constante.
     */

        public static void main(String[] args) {
            Biblioteca bibliotecaKonradLorenz = new Biblioteca();

            Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 496);
            Libro libro2 = new Libro("El código Da Vinci", "Dan Brown", 656);
            Libro libro3 = new Libro("1984", "George Orwell", 326);
            Libro libro4 = new Libro("El Hobbit", "J.R.R. Tolkien", 310);
            Libro libro5 = new Libro("La Odisea", "Homero", 448);


         /**
         *Explicacion: Aqui se Registran los 5 libros en la biblioteca
         * Complejidad temporal: O(1) - Tiempo constante.
         */

            bibliotecaKonradLorenz.registrarLibro(libroA);
            bibliotecaKonradLorenz.registrarLibro(libroB);
            bibliotecaKonradLorenz.registrarLibro(libroC);
            bibliotecaKonradLorenz.registrarLibro(libroD);
            bibliotecaKonradLorenz.registrarLibro(libroE);

           /**
           *Explicacion: Muestra la informacion de cada uno de los libros registrados disponibles en la bibloteca
           * Complejidad temporal: O(1) - Tiempo constante.
           */

            System.out.println("Se ha encontrado el libro en la biblioteca, estos son sus datos:");
            List<Libro> librosDisponibles = bibliotecaKonradLorenz.mostrarLibrosDisponibles();
            for (Libro libro : librosDisponibles) {
                System.out.println("Título: " + libro.getTitulo());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Número de Páginas: " + libro.getNumeroPaginas());
                System.out.println("----------------------");
            }
        }
}
