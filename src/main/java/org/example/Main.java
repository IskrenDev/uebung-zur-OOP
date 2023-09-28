package org.example;

import org.example.library.User;
import org.example.library.book.Novel;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Aljoscha", "Nyang");
        User user2 = new User("Fabian", "Link");
        User user3 = new User("Iskren", "Radev");

        System.out.println(user1);

        Novel novel1 = new Novel("Der Steppenwolf", "Hermann Hesse", "978-3-596-90078-9", "Roman Philosophie");
        Novel novel2 = new Novel("Die Verwandlung", "Franz Kafka", "978-3-596-90400-8", "Novelle Existenzialismus");
        Novel novel3 = new Novel("Im Westen nichts Neues", "Erich Maria Remarque", "978-3-499-22755-5", "Kriegsroman");
        Novel novel4 = new Novel("Der Vorleser", "Bernhard Schlink", "978-3-442-31056-7", "Zeitgeschichtlicher Roman");
        Novel novel5 = new Novel("Das Parfum", "Patrick Süskind", "978-3-257-23028-4", "Historischer Roman, Kriminalroman");

        System.out.println(novel1);
    }
}