package org.example.library.book;

import java.util.Objects;

public class Book {
    private String title;
    private String autor;
    private String isbn;
    private boolean isBorrowed = false;

    public Book(String titel, String autor, String isbn) {
        this.title = titel;
        this.autor = autor;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String titel) {
        this.title = titel;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public boolean getBorrowedStatus() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return isBorrowed == book.isBorrowed && Objects.equals(title, book.title) && Objects.equals(autor, book.autor) && Objects.equals(isbn, book.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, autor, isbn, isBorrowed);
    }

    @Override
    public String toString() {
        return "Book{" +
                "titel='" + title + '\'' +
                ", autor='" + autor + '\'' +
                ", isbn='" + isbn + '\'' +
                ", isBorrowed=" + isBorrowed +
                '}';
    }
}
