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
    Inicializa la lista de libros que se encuentran disponibles con el Array
     * Complejidad temporal: O(1) - Tiempo constante.
    */
    public Biblioteca() {
        librosDisponibles = new ArrayList<>(); 
    }

   /**
    * Metodo para resgistrar los libros
    Aqui se registran cada uno de los 5 libros.
     * Complejidad temporal: O(1) - Tiempo constante.
    */
    public void registrarLibro(Libro libro) {
        librosDisponibles.add(libro); 
    }

    /**
    * Método para mostrar la información de los libros que pueden ser seleccionados (en este caso los 5 libros)
    * El método return lo que hace es volver a imprimir la lista de los libros disponibles.
    * Complejidad temporal: O(1) - Tiempo constante.
    */
  
    public List<Libro> mostrarLibrosDisponibles() {
        return librosDisponibles; // Devuelve la lista de libros disponibles
    }
}
