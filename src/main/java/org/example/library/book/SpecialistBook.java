package org.example.library.book;

import java.util.Objects;

public class SpecialistBook extends Book {

    private String specialistField;

    private String difficultyLevel;

    public SpecialistBook(String titel, String autor, String isbn, String specialistField, String difficultyLevel) {
        super(titel, autor, isbn);
        this.specialistField = specialistField;
        this.difficultyLevel = difficultyLevel;
    }

    public String getSpecialistField() {
        return specialistField;
    }

    public void setSpecialistField(String specialistField) {
        this.specialistField = specialistField;
    }

    public String getDifficultyLevel() {
        return difficultyLevel;
    }

    public void setDifficultyLevel(String difficultyLevel) {
        this.difficultyLevel = difficultyLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SpecialistBook that = (SpecialistBook) o;
        return Objects.equals(specialistField, that.specialistField) && Objects.equals(difficultyLevel, that.difficultyLevel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), specialistField, difficultyLevel);
    }

    @Override
    public String toString() {
        return "SpecialistBook{" +
                "titel='" + super.getTitle() + '\'' +
                ", autor='" + super.getAutor() + '\'' +
                ", isbn='" + super.getIsbn() + '\'' +
                ", isBorrowed=" + super.getBorrowedStatus() +
                "specialistField='" + specialistField + '\'' +
                ", difficultyLevel='" + difficultyLevel + '\'' +
                '}';
    }
}
