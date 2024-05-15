package com.doping.dopingchal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doping.dopingchal.model.TestResult;
import com.doping.dopingchal.repository.TestResultRepository;

@Service
public class TestResultService {
    @Autowired  // to access test repository
    private TestResultRepository testResultRepository;

    // saving test results
    public TestResult saveTestResult(TestResult testResult) {
        return testResultRepository.save(testResult);
    }

    // find students' test result by studentid
    public List<TestResult> findResultsByStudentId(Long studentId) {
        return testResultRepository.findByStudentId(studentId);
    }

    // find test result by testid
    public List<TestResult> findResultsByTestId(Long testId) {
        return testResultRepository.findByTestId(testId);
    }
}