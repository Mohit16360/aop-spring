package com.example.AopDemo.service;

import com.example.AopDemo.dto.Student;
import com.example.AopDemo.repository.StudentRespository;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRespository studentRespository;

    public StudentServiceImpl(StudentRespository studentRespository) {
        this.studentRespository = studentRespository;
    }


    @Override
    public void createStudent(Student student) {
        studentRespository.save(student);
    }
}
