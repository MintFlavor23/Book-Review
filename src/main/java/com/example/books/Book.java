package com.example.books;
import java.util.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

@Document(collection = "books")
@Data
@AllArgsConstructor
@NoArgsConstructor //no constructor statement
public class Book {
    private ObjectId _id;
    private String isbn;
    private String title;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;
//    @DocumentReference
//    private List<String> reviewIds;
}
