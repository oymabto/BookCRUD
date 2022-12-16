package model;

import java.util.ArrayList;

public class Book {
    private String name;
    private String language;
    private int firstPublished;
    private int approximateSalesInMillions;
    private String genre;
    public ArrayList<Author> authors = new ArrayList<Author>();

    public Book(String name) {
        this.name = name;
    }

    public Book(String name, String language, int firstPublished, int approximateSalesInMillions, String genre) {
        this.name = name;
        this.language = language;
        this.firstPublished = firstPublished;
        this.approximateSalesInMillions = approximateSalesInMillions;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public int getFirstPublished() {
        return firstPublished;
    }

    public void setFirstPublished(int firstPublished) {
        this.firstPublished = firstPublished;
    }

    public int getApproximateSalesInMillions() {
        return approximateSalesInMillions;
    }

    public void setApproximateSalesInMillions(int approximateSalesInMillions) {
        this.approximateSalesInMillions = approximateSalesInMillions;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<Author> getAuthors() {
        return authors;
    }

    public void addAuthor(ArrayList<Author> authors) {
        this.authors = authors;
    }

    public void addAuthor(Author author) {
        this.authors.add(author);
    }

    @Override
    public String toString() {
        return String.format("%-45s%-60s%-20s%-27d%-23d%-20s", this.name, this.authors, this.language, this.firstPublished, this.approximateSalesInMillions, this.genre);
    }
}
