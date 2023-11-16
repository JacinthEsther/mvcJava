package com.javajay.springmvc.repository;

import com.javajay.springmvc.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
