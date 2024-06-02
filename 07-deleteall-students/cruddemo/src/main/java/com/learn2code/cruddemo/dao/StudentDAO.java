package com.learn2code.cruddemo.dao;

import com.learn2code.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {

    void save(Student theStudent);

    Student findById(Integer id);

    List<Student> findAll();

    List<Student> findByLastName(String theLastName);

    void update(Student theStudent);

    void deleted(Integer id);

    int deleteAll();

}
