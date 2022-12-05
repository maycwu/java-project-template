package com.javaproject.studentsystem.service;

import com.javaproject.studentsystem.model.Student;
import com.javaproject.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//implementation class contains all the "logic" and methods to use
@Service
public class StudentServiceImplementation implements StudentService {

    //The @Autowired annotation tells Spring that StudentServiceImplementation needs an object of type StudentRepository
    //In other words... StudentRepository is a dependency of StudentServiceImplementation
    @Autowired
    private StudentRepository studentRepository;

    //Override annotation indicates that the child class is overriding the method of its parent class
    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
