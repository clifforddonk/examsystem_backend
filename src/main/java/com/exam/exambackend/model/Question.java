package com.exam.exambackend.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@Document(collection = "questions")
public class Question {
    @Id
    private String id;
    private String question;
    private List<String> options;
    private int correctIndex;
    private String category; // New field for category
}