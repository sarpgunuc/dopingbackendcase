package com.doping.dopingchal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doping.dopingchal.model.Question;
import com.doping.dopingchal.repository.QuestionRepository;


@Service
public class QuestionService {
    @Autowired   // To access question repository
    private QuestionRepository questionRepository;

    
    // Saving new question
    public Question saveQuestion(Question question) {
        
        return questionRepository.save(question);
    }

    // finding question by test id 
    public List<Question> findQuestionsByTestId(Long testId) {
    	return questionRepository.findByTestId(testId);
    }
}
