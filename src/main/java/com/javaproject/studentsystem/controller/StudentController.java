package com.javaproject.studentsystem.controller;

import com.javaproject.studentsystem.model.Student;
import com.javaproject.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    //StudentController is dependent of studentService, hence we use @Autowired
    //we do not need to create an studentService instance, Spring does that for us with dependency injection
    //it helps to autowire the bean without creating an object using the "new" keyword
    @Autowired
    private StudentService studentService;

    @PostMapping("/add")
    public String add(@RequestBody Student student){
        studentService.saveStudent(student);
        return "New student " + student.getName() +  " is added";
    }

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

}
