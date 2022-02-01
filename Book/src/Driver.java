/**
 *Is the main method, contains a menu to add, remove, find, and print the books
 *
 * @author Garrett Bousquet
 * @version 12/11/2020
 */

import java.util.InputMismatchException;
import java.util.Scanner;
public class Driver {

    NonFictionMap nonMap = new NonFictionMap();
    FictionMap FMap = new FictionMap();

    /**
     * Takes the info to create a book object, then adds to the correct hashmap
     * @param in
     */

    public void addBook(Scanner in){

        System.out.println("Please enter the book's title:");
        String title = in.nextLine();

        System.out.println("Please enter the author's name:");
        String authorName = in.nextLine();

        System.out.println("Is the book fiction or nonfiction?");
        String answer = in.nextLine();

        while("fiction".equalsIgnoreCase(answer) == false && "nonfiction".equalsIgnoreCase(answer) == false){
            System.out.println("Please choose Fiction or Nonfiction");
            answer = in.nextLine();
        }


        if("fiction".equalsIgnoreCase(answer) == true){

            System.out.println("Please enter a genre:");
            String genre = in.nextLine();

            Fiction fictionBook = new Fiction(authorName, title, genre);

            FictionMap.addBook(title, fictionBook);
        }

        else if("nonfiction".equalsIgnoreCase(answer) == true){

            System.out.println("Please enter what type of book it is:");
            String type = in.nextLine();

            int yearPub;

            System.out.println("Please enter a publishing date");

             int yearPub = in.nextInt();


            NonFiction nonFictionBook = new NonFiction(authorName, title, yearPub, type);

            NonFictionMap.addBook(title, nonFictionBook);

            throw new InputMismatchException("Please enter a number next time");
        }


    }


    /**
     * menu to find a Book
     * @param in
     */
    public void findBook(Scanner in){

        System.out.println("Is the book fiction or nonfiction?");
        String answer = in.nextLine();


        if("fiction".equalsIgnoreCase(answer) == true){

            System.out.println("Please enter the Book's title:");
            String title = in.nextLine();

            FictionMap.findBook(title);
        }

        else{
            System.out.println("Please enter the Book's title:");
            String title = in.nextLine();

            NonFictionMap.findBook(title);
        }
    }

    /**
     * menu to remove a book
     * @param in
     */
    public void removeBook(Scanner in){
        System.out.println("Is the book fiction or nonfiction?");
        String answer = in.next();


        if("fiction".equalsIgnoreCase(answer) == true) {

            System.out.println("Please enter the Book's title:");
            String title = in.next();

            FictionMap.removeBook(title);
        }
        else{
            System.out.println("Please enter the Book's title:");
            String title = in.next();

            NonFictionMap.removeBook(title);
        }
    }

    /**
     * prints all boos in both maps
     */
    public void printAllBooks(){

        System.out.println("These are the Fiction books:");
        System.out.println();

        FictionMap.printBook();

        System.out.println("These are the Non-Fiction Books:");
        System.out.println();

        NonFictionMap.printBook();

    }

    /**
     * Main contains the menu to run the program
     * @param args
     */
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        Driver d = new Driver();
        boolean check = false;

        System.out.println("This is a Book catalog");

        do{
            System.out.println("Please Select an option:");
            System.out.println("Books in the catalog (F)ind, (A)dd, (R)emove, (P)rint, or (Q)uit");

            String choice = in.next();
            if (choice.equals("F") || choice.equals("f"))
            {
                d.findBook(new Scanner(System.in));
            }
            else if (choice.equals("A") || choice.equals("a"))
            {
                try{
                    d.addBook(new Scanner(System.in));
                }catch(InputMismatchException e){
                    System.out.println();
                    }

            }
            else if (choice.equals("D") || choice.equals("d"))
            {
                d.removeBook(new Scanner(System.in));
            }
            else if (choice.equals("P") || choice.equals("p"))
            {
                d.printAllBooks();
            }
            else if (choice.equals("Q") || choice.equals("q")){
                check = true;
            }
        }
        while(!check);

        System.out.println("Good Bye");
        in.close();
    }
}
