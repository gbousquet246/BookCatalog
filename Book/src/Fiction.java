/**
 * A subclass of Book
 * adds a genres
 *
 * @author Garrett Bousquet
 * @version 12/4/2020
 */
public class Fiction extends Book {
    private String genre;

    /**
     * Constructs a book object
     *
     * @param authorName  the authors name
     * @param title           book's title
     * @param genre the books genre
     */
    public Fiction(String authorName, String title, String genre) {
        super(authorName,  title);
        this.genre = genre;
    }
    /**
     * Returns books genre
     *
     * @return Returns books genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * sets the books genre
     *
     * @param genre the books genre
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * returns string representation of a book
     *
     * @return string representation of a book
     */
    public String toString(){
        String s = super.toString();
        s +="Genre: " + genre;
        return s;
    }
}
