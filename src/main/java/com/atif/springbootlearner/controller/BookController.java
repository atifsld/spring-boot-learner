package com.atif.springbootlearner.controller;

import com.atif.springbootlearner.entity.Book;
import com.atif.springbootlearner.service.BookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return bookService.getAllBooks();
    }

    @GetMapping("/{id}")
    public Book getBook(@PathVariable("id") Integer id) {
        return bookService.getBookById(id);
    }

    @PostMapping
    private Book saveBook(@RequestBody Book book) {
        bookService.saveOrUpdate(book);
        return book;
    }

    @PutMapping
    private Book updateBook(@RequestBody Book book) {
        bookService.saveOrUpdate(book);
        return book;
    }

    @DeleteMapping("/{id}")
    private void deleteBook(@PathVariable("id") Integer id) {
        bookService.deleteById(id);
    }

    @DeleteMapping
    private void deleteAllBooks() {
        bookService.deleteAll();
    }
}
