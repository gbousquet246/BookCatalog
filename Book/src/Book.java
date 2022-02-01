/**
 * Superclass book creates a book with a title, author first name, last name, and year published
 *
 * @author Garrett Bousquet
 * @version 12/4/2020
 */

public class Book {
    private String authorName, title;



    /**
     * Constructs a book object
     *
     * @param authorName the authors name
     * @param title book's title
     *
     */
    public Book(String authorName, String title) {
        this.authorName = authorName;
        this.title = title;
    }

    /**
     * Returns authors  name
     *
     * @return authors  name
     */
    public String getAuthorName(){
        return authorName;
    }

    /**
     * Sets authors  name
     *
     * @param authorName the authors  name
     */
    public void setAuthorName(){
        this.authorName = authorName;
    }

    /**
     * Returns book's title
     *
     * @return book's title
     */
    public String getTitle(){
        return title;
    }

    /**
     * Sets book's title
     *
     * @param title the book's title
     */
    public void setTitle(){
        this.title = title;
    }

    /**
     * returns the count of how many of an individual book is on hand
     *
     * @return the count of how many of an individual book is on hand
     */
    public int getCount(){return count;}



    /**
     * returns string representation of a book
     *
     * @return string representation of a book
     */
    public String toString() {
        String s = getTitle() + "\n"
                + "by: " + getAuthorName() + "\n";


        return s;
    }

}
