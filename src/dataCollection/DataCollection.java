package dataCollection;

import model.Author;
import model.Book;

import java.util.ArrayList;

public class DataCollection {
    private static ArrayList<Book> bookArrayList;

    public DataCollection() {
        this.bookArrayList = new ArrayList<Book>();
    }

    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }

    public static void setBookArrayList(ArrayList<Book> bookArrayList) {
        DataCollection.bookArrayList = bookArrayList;
    }

    public static void findBook(String firstName, String lastName) {
        System.out.println("\n\n\nThe list of books written by " + firstName + " " + lastName + " is: \n");
        for (int i = 0; i < bookArrayList.size(); i++) {
            for (int k = 0; k < bookArrayList.get(i).getAuthors().size(); k++)
                if (bookArrayList.get(i).getAuthors().get(k).getLastName().equals(lastName) && bookArrayList.get(i).getAuthors().get(k).getFirstName().equals(firstName)) {
                    System.out.println(DataCollection.bookArrayList.get(i));
                }
        }
    }

    public static void addNewBook(String name) {
        boolean isNew = true;
        for (Book book : bookArrayList) {
            if (book.getName().equals(name)) {
                System.out.print("\n\n\nThe book '" + name + "' is already exist in the list of books.");
                isNew = false;
            }
        }
        if (isNew) {
            bookArrayList.add(new Book(name));
        }
        System.out.println(" The New DataCollection ArrayList:\n");
        for (int j = 0; j < bookArrayList.size(); j++) {
            System.out.println(DataCollection.bookArrayList.get(j));
        }
    }
}

