package com.example.books;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping("/api/v1/books")
    public ResponseEntity<List<Book>> getAllBooks(){
        return new ResponseEntity<List<Book>>(bookService.findAllBooks(), HttpStatus.OK);
    }

    @GetMapping("/{isbnId}")
    public ResponseEntity<Optional<Book>> getSingleBook(@PathVariable String isbnId){
        return new ResponseEntity<Optional<Book>>(bookService.singleBook(isbnId), HttpStatus.OK);
    }


}
