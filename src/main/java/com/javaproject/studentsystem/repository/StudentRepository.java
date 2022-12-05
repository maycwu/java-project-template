package com.javaproject.studentsystem.repository;

import com.javaproject.studentsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//inside the angle brackets <> we input the student model and its primary key
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
