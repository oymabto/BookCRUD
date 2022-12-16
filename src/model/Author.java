package model;

public class Author extends Person {
    private int id;

    public Author(){
    }

    public Author(int id) {
        this.id = id;
    }

    public Author(String firstName, String lastName, int id) {
        super(firstName, lastName);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.getFirstName() + ", " + super.getLastName() + ", id = " + id + "  ";
    }
}
