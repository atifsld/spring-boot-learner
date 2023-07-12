package com.atif.springbootlearner.mockdata;

import com.atif.springbootlearner.entity.Book;
import com.atif.springbootlearner.service.BookService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseFiller implements CommandLineRunner {

    private final BookService bookService;

    public DatabaseFiller(BookService bookService) {
        this.bookService = bookService;
    }

    @Override
    public void run(String... args) throws Exception {
        bookService.saveOrUpdate(new Book(
                1,
                "Little Women",
                "Louisa May Alcott",
                1868
        ));

        bookService.saveOrUpdate(new Book(
                2,
                "Pride and Prejudice",
                "Jane Austen",
                1813
        ));

        bookService.saveOrUpdate(new Book(
                3,
                "To Kill a Mockingbird",
                "Harper Lee",
                1960
        ));

        bookService.saveOrUpdate(new Book(
                4,
                "1984",
                "George Orwell",
                1949
        ));

        bookService.saveOrUpdate(new Book(
                5,
                "Moby-Dick",
                "Herman Melville",
                1851
        ));

        bookService.saveOrUpdate(new Book(
                6,
                "The Great Gatsby",
                "F. Scott Fitzgerald",
                1925
        ));

        bookService.saveOrUpdate(new Book(
                7,
                "Jane Eyre",
                "Charlotte Bronte",
                1847
        ));

        bookService.saveOrUpdate(new Book(
                8,
                "The Catcher in the Rye",
                "J.D. Salinger",
                1951
        ));

        bookService.saveOrUpdate(new Book(
                9,
                "Wuthering Heights",
                "Emily Bronte",
                1847
        ));

        bookService.saveOrUpdate(new Book(
                10,
                "The Lord of the Rings",
                "J.R.R. Tolkien",
                1954
        ));

        bookService.saveOrUpdate(new Book(
                11,
                "Alice's Adventures in Wonderland",
                "Lewis Carroll",
                1865
        ));

        bookService.saveOrUpdate(new Book(
                12,
                "Brave New World",
                "Aldous Huxley",
                1932
        ));

        bookService.saveOrUpdate(new Book(
                13,
                "The Adventures of Huckleberry Finn",
                "Mark Twain",
                1884
        ));

        bookService.saveOrUpdate(new Book(
                14,
                "War and Peace",
                "Leo Tolstoy",
                1869
        ));


        bookService.saveOrUpdate(new Book(
                15,
                "Anna Karenina",
                "Leo Tolstoy",
                1877
        ));

        bookService.saveOrUpdate(new Book(
                16,
                "Don Quixote",
                "Miguel de Cervantes",
                1605
        ));

        bookService.saveOrUpdate(new Book(
                17,
                "Frankenstein",
                "Mary Shelley",
                1818
        ));

        bookService.saveOrUpdate(new Book(
                18,
                "The Picture of Dorian Gray",
                "Oscar Wilde",
                1890
        ));

        bookService.saveOrUpdate(new Book(
                19,
                "Crime and Punishment",
                "Fyodor Dostoevsky",
                1866
        ));

        bookService.saveOrUpdate(new Book(
                20,
                "The Scarlet Letter",
                "Nathaniel Hawthorne",
                1850
        ));

    }
}
