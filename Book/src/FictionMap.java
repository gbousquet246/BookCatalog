/**
 *
 *Creates a Hash map to store Fiction book objects with author names as keys
 *
 * @author Garrett Bousquet
 * @version 12/7/2020
 */
import java.util.HashMap;
import java.util.Set;
public class FictionMap {
   private static HashMap<String, Fiction> fictionBooks = new HashMap <>();

    /**
     * removes a book from the hashmap
     * @param name
     */
    public static void removeBook(String name){
        fictionBooks.remove(name);
    }

    /**
     * Adds a book to the hashmap
     *
     * @param name
     * @param b
     */
    public static void addBook(String name, Fiction b){
        fictionBooks.put(name, b);
    }

    /**
     * finds a book in the hash map
     * @param name
     */
    public static void findBook(String name){

        Object book = fictionBooks.get(name);

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
        Set<String> fictionSet = fictionBooks.keySet();
        for(String name : fictionSet){
            System.out.println(fictionBooks.get(name));
            System.out.println();
        }
    }
}
