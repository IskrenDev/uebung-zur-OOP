package org.example.library.book;

import org.example.library.User;

import java.util.Objects;

public class Book implements Borrowable {
    private static int totalBooks = 0;
    private String title;
    private String autor;
    private String isbn;
    private boolean isBorrowed = false;

    public Book(String titel, String autor, String isbn) {
        this.title = titel;
        this.autor = autor;
        this.isbn = isbn;
        totalBooks++;
    }

    public static int getTotalBooks() {
        return totalBooks;
    }

    public static void setTotalBooks(int totalBooks) {
        Book.totalBooks = totalBooks;
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

    @Override
    public void borrow(User user) {
        user.addBookToBooksArray("title1");
    }

    @Override
    public void returnBook() {

    }

    @Override
    public boolean isBorrowed() {
        return false;
    }
}
