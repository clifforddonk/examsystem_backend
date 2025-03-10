package com.exam.exambackend.repository;

import com.exam.exambackend.model.Question;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface QuestionRepository extends MongoRepository<Question, String> {
}
