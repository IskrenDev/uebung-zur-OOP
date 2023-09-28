package org.example.library.book;

import java.util.Objects;

public class Novel extends Book {
    private String genre;

    public Novel(String titel, String autor, String isbn, String genre) {
        super(titel, autor, isbn);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Novel novel = (Novel) o;
        return Objects.equals(genre, novel.genre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), genre);
    }
    @Override
    public String toString() {
        return "Novel{" +
                "titel='" + super.getTitle() + '\'' +
                ", autor='" + super.getAutor() + '\'' +
                ", isbn='" + super.getIsbn() + '\'' +
                ", isBorrowed=" + super.getBorrowedStatus() +
                "genre='" + genre + '\'' +
                '}';
    }
}
