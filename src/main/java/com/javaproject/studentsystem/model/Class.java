package com.javaproject.studentsystem.model;

import jakarta.persistence.Entity;

@Entity
public class Class {

    private String classId;
    private String name;
    private String description;
    private int studentId;

}
