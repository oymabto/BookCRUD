import dataCollection.DataCollection;
import model.Author;
import model.Book;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class App {
    private DataCollection dataCollection = new DataCollection();

    public App() {
        createModelObjects();
        dataCollection.findBook("J.R.R.", "Tolkien");
        dataCollection.addNewBook("Le Pettit Prince");
        dataCollection.sortBooksBasedOnTheFirstPublishedYear();
        dataCollection.sortBooksBasedOnTheBookName();
        dataCollection.addBookUsingObjectEquals(new Book("Le Pettit Prince"));
    }

    public void createModelObjects() {

        Author jrrTolkien = new Author("J.R.R.", "Tolkien", 123);
        Author antonieDeSaintExupery = new Author("Antonie", "de Saint-Exupery", 456);
        Author jkRowling = new Author("J.K", "Rowling", 785);
        Author johnAbbott = new Author("John", "Abbott", 829);

        Book theLordOfTheRings = new Book("The Lord of the Rings", "English", 1954, 150, "fantasy");
        theLordOfTheRings.addAuthor(jrrTolkien);

        Book lePettitPrince = new Book("Le Pettit Prince", "French", 1943, 140, "novel");
        lePettitPrince.addAuthor(antonieDeSaintExupery);

        Book harryPotterAndPhilosopherStone = new Book("Harry Potter and Philosopher’s Stone", "English", 1997, 120, "fantasy");
        harryPotterAndPhilosopherStone.addAuthor(jkRowling);

        Book theHobbit = new Book("The Hobbit", "English", 1937, 103, "fantasy");
        theHobbit.addAuthor(jrrTolkien);
        theHobbit.addAuthor(johnAbbott);

        dataCollection.getBookArrayList().add(theLordOfTheRings);
        dataCollection.getBookArrayList().add(lePettitPrince);
        dataCollection.getBookArrayList().add(harryPotterAndPhilosopherStone);
        dataCollection.getBookArrayList().add(theHobbit);

        System.out.printf("\n%20s%50s%43s%22s%32s%13s\n", "Book name", "Author", "languages", "First published", "Approximate sales (million)", "Genre");
        System.out.printf("%22s%52s%42s%20s%31s%16s", "--------------", "--------------", "--------------", "----------------", "---------------------------", "---------\n");
        for (Book book : dataCollection.getBookArrayList()) {
            System.out.println(book);
        }
    }
}
