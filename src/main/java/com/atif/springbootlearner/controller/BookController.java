package com.atif.springbootlearner.controller;

import com.atif.springbootlearner.entity.Book;
import com.atif.springbootlearner.repository.BookRepository;
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
}
