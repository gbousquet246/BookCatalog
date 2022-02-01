/**
 * A subclass of Book
 * adds a genres
 *
 * @author Garrett Bousquet
 * @version 12/4/2020
 */

public class NonFiction extends Book {
    private String type;
    private int yearPublished;

    /**
     * Constructs a book object
     *
     * @param authorName  the authors name
     * @param title           book's title
     * @param yearPublished   the year the book was published
     * @param type what kind of book it is
     */
    public NonFiction(String authorName, String title, int yearPublished, String type) {
        super(authorName, title);
        this.type = type;
        this.yearPublished = yearPublished;

    }
    /**
     * Returns type what kind of book it is
     *
     * @return type what kind of book it is
     */
    public String gettype() {
        return type;
    }

    /**
     * sets what kind of book it is
     *
     * @param type what kind of book it is
     */
    public void settype(String genre) {
        this.type = type;
    }

    /**
     * Returns the year Published
     *
     * @return the year Published
     */
    public int getyearPublished(){
        return yearPublished;
    }

    /**
     * Sets the year Published
     *
     * @param yearPublished the year the book was published
     */
    public void setyearPublished(){
        this.yearPublished = yearPublished;
    }

    /**
     * returns string representation of a book
     *
     * @return string representation of a book
     */
    public String toString(){
        String s = super.toString();
        s += "\n" + "year published: " + getyearPublished()
                + "\n" + "type: " + type;
        return s;
    }
}
