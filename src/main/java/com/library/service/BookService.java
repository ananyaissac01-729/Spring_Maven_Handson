package com.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.repository.BookRepository;

@Service
public class BookService {

    private BookRepository bookRepository;

    // Constructor injection
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookService bean created via constructor injection.");
    }

    // Setter injection (kept for the exercise, though constructor already sets it)
    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
        System.out.println("BookRepository injected into BookService via setter.");
    }

    public void getBookDetails() {
        System.out.println("Fetching book details from BookService...");
        System.out.println(bookRepository.findBookById(1));
    }
}