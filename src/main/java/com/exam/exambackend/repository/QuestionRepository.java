package com.exam.exambackend.repository;

import com.exam.exambackend.model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface QuestionRepository extends MongoRepository<Question, String> {
    // Method to find questions by category
    List<Question> findByCategory(String category);
}