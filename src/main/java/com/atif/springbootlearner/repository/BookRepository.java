package com.atif.springbootlearner.repository;

import com.atif.springbootlearner.entity.Book;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<Book, Integer> {
}
