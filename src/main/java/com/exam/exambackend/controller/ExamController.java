package com.exam.exambackend.controller;

import com.exam.exambackend.model.Question;
import com.exam.exambackend.repository.QuestionRepository;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class ExamController {
    private final QuestionRepository questionRepository;

    public ExamController(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @PostMapping("/submit")
    public Map<String, Object> submitExam(@RequestBody Map<String, Integer> answers) {
        List<Question> questions = questionRepository.findAll();
        int score = 0;

        for (Question q : questions) {
            if (answers.containsKey(q.getId()) && answers.get(q.getId()) == q.getCorrectIndex()) {
                score++;
            }
        }

        return Map.of("score", score, "total", questions.size());
    }
}

