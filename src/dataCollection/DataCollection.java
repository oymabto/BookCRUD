package dataCollection;

import model.Book;
import model.BookComparator;

import java.util.ArrayList;
import java.util.Collections;

public class DataCollection {
    private static ArrayList<Book> bookArrayList;

    public DataCollection() {
        this.bookArrayList = new ArrayList<Book>();
    }

    public ArrayList<Book> getBookArrayList() {
        return bookArrayList;
    }

    public void setBookArrayList(ArrayList<Book> bookArrayList) {
        this.bookArrayList = bookArrayList;
    }

    public void findBook(String firstName, String lastName) {
        System.out.println("\n\n\nThe list of books written by " + firstName + " " + lastName + " is: \n");
        for (int i = 0; i < bookArrayList.size(); i++) {
            for (int k = 0; k < bookArrayList.get(i).getAuthors().size(); k++)
                if (bookArrayList.get(i).getAuthors().get(k).getLastName().equalsIgnoreCase(lastName) && bookArrayList.get(i).getAuthors().get(k).getFirstName().equalsIgnoreCase(firstName)) {
                    System.out.println(DataCollection.bookArrayList.get(i));
                }
        }
    }

    public void addNewBook(String name) {
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

    public void sortBooksBasedOnTheFirstPublishedYear() {
        Collections.sort(bookArrayList);
        System.out.println("\n\n\nThe Sorted list of books based on first published year: \n");
        for (Book book : bookArrayList) {
            System.out.println(book);
        }
    }

    public void sortBooksBasedOnTheBookName() {
        Collections.sort(bookArrayList, new BookComparator());
        System.out.println("\n\n\nThe Sorted list of books based on name: \n");
        for (Book book : bookArrayList) {
            System.out.println(book);
        }
    }

    public void addBookUsingObjectEquals(Book book) {
        boolean isNew = true;
        for (Book existingBook : bookArrayList) {
            if (book.equals(existingBook)) {
                System.out.print("\n\n\nThe book '" + book.getName() + "' is already exist in the list of books.");
                isNew = false;
            }
        }
        if (isNew) {
            bookArrayList.add(book);
        }
        System.out.println(" The New DataCollection ArrayList:\n");
        for (int j = 0; j < bookArrayList.size(); j++) {
            System.out.println(DataCollection.bookArrayList.get(j));
        }
    }
}

