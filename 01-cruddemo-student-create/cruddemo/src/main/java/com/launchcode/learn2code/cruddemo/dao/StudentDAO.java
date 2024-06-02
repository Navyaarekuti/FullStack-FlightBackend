package com.launchcode.learn2code.cruddemo.dao;

import com.launchcode.learn2code.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student theStudent);
    Student findById(Integer id);

    List<Student> findAll();
}
