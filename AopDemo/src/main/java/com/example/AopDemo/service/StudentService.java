package com.example.AopDemo.service;

import com.example.AopDemo.dto.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public void createStudent(Student student) {
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getMessage());
        System.out.println(student.getRollNo());
    }
}
