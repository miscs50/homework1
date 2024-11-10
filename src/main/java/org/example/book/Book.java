package org.example.book;

public class Book implements Displayable {
    private String name;
    private String author;
    private int publicationYear;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public void display() {
        System.out.printf("The book: %s, %s, %d %n=====%n%n", name, author, publicationYear);
    }
}
