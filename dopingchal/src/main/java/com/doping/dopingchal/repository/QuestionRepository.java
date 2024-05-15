package com.doping.dopingchal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.doping.dopingchal.model.*;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {
}