public class Libro  {
    private String titulo;
    private String autor;
    private int numeroPaginas;

    /**
     * Constructor de 
     * Explicación: Crea un lugar en la clase libro con los atributos mencionados que son titulo, autor y numero de paginas
     * @param titulo Una cadena de caracteres que representa el título del libro.
     * @param autor  Una cadena de caracteres que representa el autor del libro.
     * @param numeroPaginas Un entero que representa el número de páginas del libro.
     * Complejidad temporal: O(1) - Tiempo constante.
     */

    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    /**
     * Método para obtener el título del libro
     * @return titulo que lo que hace es devolver el titulo de el libro seleccionado
     * Complejidad temporal: O(1) - Tiempo constante.
     */
    public String getTituloLibro() {
        return tituloLibro;
    }

    /**
     * Explicación: Este método devuelve el título del libro.
     * Explicación: Este método devuelve el autor del libro.
     * @return autor
     * Complejidad temporal: O(1) - Tiempo constante.
     */
   public void settituloLibro() {
            this.tituloLibro = tituloLibro;
    }
