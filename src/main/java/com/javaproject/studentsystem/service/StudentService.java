package com.javaproject.studentsystem.service;

import com.javaproject.studentsystem.model.Student;

import java.util.List;

//an interface contains abstract methods whose implementation is left to the classes using it.
public interface StudentService {
    //only methods in the interface

    public Student saveStudent(Student student);

    //array of Student objects
    public List<Student> getAllStudents();

}
