package com.doping.dopingchal.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.doping.dopingchal.model.Student;
import com.doping.dopingchal.repository.StudentRepository;

@Service
public class StudentService {
    @Autowired       // to access Student Repository
    private StudentRepository studentRepository;
    
    
    // Saving Student to table 
    public Student saveStudent(Student student) {
       
        return studentRepository.save(student);
    }

    
    //Finding student by username
    public Optional<Student> findStudentByUsername(String username) {
   
        return studentRepository.findByUsername(username);
    }
}