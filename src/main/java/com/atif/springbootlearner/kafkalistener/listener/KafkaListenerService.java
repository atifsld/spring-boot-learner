package com.atif.springbootlearner.kafkalistener.listener;

import com.atif.springbootlearner.entity.Book;
import com.atif.springbootlearner.service.BookService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaListenerService {

    private final BookService bookService;

    public KafkaListenerService(BookService bookService) {
        this.bookService = bookService;
    }

    @KafkaListener(topics = "test-topic", groupId = "group-id")
    public void listen(String message) throws JsonProcessingException {
        System.out.println("Event received: " + message);
        ObjectMapper objectMapper = new ObjectMapper();
        Book book = objectMapper.readValue(message, Book.class);
        bookService.saveOrUpdate(book);
    }

}
