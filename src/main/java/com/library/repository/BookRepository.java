package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {

    public BookRepository() {
        System.out.println("BookRepository bean created.");
    }

    public String findBookById(int id) {
        return "Book with ID " + id + " retrieved from repository.";
    }
}