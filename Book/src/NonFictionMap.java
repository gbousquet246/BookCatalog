/**
 *
 *Creates a Hash map to store Non Fiction book objects with author names as keys
 *
 * @author Garrett Bousquet
 * @version 12/7/2020
 */
import java.util.HashMap;
import java.util.Set;

public class NonFictionMap {
    private static HashMap<String, NonFiction> nonFictionBooks = new HashMap <>();

    /**
     * removes a book from the hashmap
     * @param name
     */
    public static void removeBook(String name){ nonFictionBooks.remove(name); }

    /**
     * Adds a book to the hashmap
     *
     * @param name
     * @param b
     */
    public static void addBook(String name, NonFiction b){ nonFictionBooks.put(name, b); }

    /**
     * finds a book in the hash map
     * @param name
     */
    public static void findBook(String name){

        Object book = nonFictionBooks.get(name);

        if(book !=null) {
            System.out.println(book);
            System.out.println();
        }

        else {
            System.out.println("No Book with that title here.");
            System.out.println();
        }
    }


    /**
     * prints all books in the hashmap
     */
    public static void printBook(){
        Set<String> nonFictionSet = nonFictionBooks.keySet();
        for(String name : nonFictionSet){
            System.out.println(nonFictionBooks.get(name));
            System.out.println();
        }
    }
}
