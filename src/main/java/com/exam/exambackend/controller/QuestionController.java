package com.exam.exambackend.controller;

import com.exam.exambackend.model.Question;
import com.exam.exambackend.repository.QuestionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {
    private final QuestionRepository questionRepository;

    public QuestionController(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @GetMapping
    public List<Question> getAllQuestions() {
        return questionRepository.findAll();
    }
}
