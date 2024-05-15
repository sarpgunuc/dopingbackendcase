package com.doping.dopingchal.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doping.dopingchal.model.Test;
import com.doping.dopingchal.repository.TestRepository;

@Service
public class TestService {
    @Autowired
    private TestRepository testRepository;

    // saving test 
    public Test saveTest(Test test) {
        return testRepository.save(test);
    }

    // finding all test 
    public List<Test> findAllTests() {
        return testRepository.findAll();
    }

    // finding spesific tests 
    public Optional<Test> findTestById(Long id) {
        return testRepository.findById(id);
    }
}