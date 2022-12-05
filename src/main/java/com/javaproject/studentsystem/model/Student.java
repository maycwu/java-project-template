package com.javaproject.studentsystem.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name ="students")
public class Student {
    //makes the primary key
    @Id
    //makes the Id auto increment
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String address;
    private String major;

    @OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Class> classes;

    //constructor
    public Student() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
