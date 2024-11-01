package com.example.books;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    public List<Book> findAllBooks() {
        return bookRepository.findAll();
    }

    public Optional<Book> singleBook(String isbn){
        return bookRepository.findBookByisbn(isbn);
    }
}
