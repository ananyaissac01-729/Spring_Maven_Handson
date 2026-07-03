package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private BookRepository bookRepository;

    public BookService() {
        System.out.println("BookService bean created.");
    }

    // Setter method for Dependency Injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookRepository injected into BookService.");
    }

    public void getBookDetails() {
        System.out.println("Fetching book details from BookService...");
        System.out.println(bookRepository.findBookById(1));
    }
}