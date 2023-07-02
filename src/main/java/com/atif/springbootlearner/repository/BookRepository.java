package com.atif.springbootlearner.repository;

import com.atif.springbootlearner.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {
}
