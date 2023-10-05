import java.util.LinkedList;
public class Biblioteca {
    /**
     * Esta es la class Biblioteca
     * Explicación: Esta clase es la que se usa como la biblioteca que es la que nos ayuda a guardar los libros que ya hemos registrado. El ArrayList se usa para que se pueda guardar la informacion de los libros y 
     * ver que libros estan disponibles.
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    // Atributo
  private LinkedList<Libro> librosDisponibles = new LinkedList<>();

    /**
    * Constructor
    Inicializa la variable para registrar los libros
     * Complejidad temporal: O(1) - Tiempo constante.
    */
    public void registrarLibro(Libro Libro) {
        librosDisponibles.add(Libro);

   /**
    * Metodo para resgistrar los libros
    Aqui se registran cada uno de los 5 libros.
     * Complejidad temporal: O(1) - Tiempo constante.
    */
         public Libro buscarLibro(String titulo) {
        Libro libroEncontrado = null;
    }

    /**
    * Método para mostrar la información de los libros que pueden ser seleccionados (en este caso los 5 libros)
    * El método return lo que hace es volver a imprimir la lista de los libros disponibles.
    * Complejidad temporal: O(1) - Tiempo constante.
    */
  
    for (Libro libro : librosDisponibles) {
            if (libro.getTituloLibro().equalsIgnoreCase(titulo)) {
                libroEncontrado = libro;
                break;
            }
        }
        return libroEncontrado;
    }

 /**
    * Método para mostrar la información del libro seleccionado, si se encuentra dara la informacion sino saldra el mensaje null
    * El método return lo que hace es volver a imprimir la lista de los libros disponibles.
    * Complejidad temporal: O(1) - Tiempo constante.
    */
    // Método para mostrar los libros disponibles en la biblioteca
    public void mostrarLibrosDisponibles() {
        if (librosDisponibles.isEmpty()) {
            System.out.println("No hay libros disponibles en la biblioteca.");
        } else {
            System.out.println("Libros disponibles en la biblioteca:");
            System.out.println("----------------------");
            for (Libro libro : librosDisponibles) {
                System.out.println("Título: " + libro.getTituloLibro());
                System.out.println("Autor: " + libro.getAutor());
                System.out.println("Número de páginas: " + libro.getNumeroPaginas());
                System.out.println("----------------------");
            }
        }
    }
}
