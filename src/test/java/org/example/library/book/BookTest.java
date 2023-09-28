package org.example.library.book;

import org.example.library.User;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getTotalBooks_when2InstancesOfBook_haveBeenCreated_thenReturn2() {
        //GIVEN
        Book book1 = new Book("title1", "author1", "isbn1");
        Book book2 = new Book("title1", "author1", "isbn1");

        //WHEN
        int actual = Book.getTotalBooks();
        int expect = 2;

        //THEN
        assertEquals(expect, actual);
    }

    @Test
    void getTotalBooks_when2InstancesOfNovel_haveBeenCreated_thenReturn2() {
        //GIVEN
        Novel book1 = new Novel("title1", "author1", "isbn1", "genre1");
        Book book2 = new Novel("title1", "author1", "isbn1", "genre1");

        //WHEN
        int actual = Book.getTotalBooks();
        int expect = 2;

        //THEN
        assertEquals(expect, actual);
    }

    @Test
    void borrow_whenBorrowMethodIsExecutedOnInstanceOfBook_thenThisInstanceIsIncludedInUsersArrayBorrowedBooks() {
        //GIVEN
        Book book1 = new Book("title1", "author1", "isbn1");
        Book book2 = new Book("title1", "author1", "isbn1");
        User user = new User("Test", "User");
        book1.borrow(user);
        book2.borrow(user);

        //WHEN
        String[] actual = user.getBorrowedBooks();
        //THEN
        String[] expect = {"title1", "title2", null, null, null};
        assertTrue(Arrays.equals(actual, expect));
    }
}