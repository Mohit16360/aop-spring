package com.example.AopDemo.repository;
import com.example.AopDemo.dto.Student;
import org.springframework.stereotype.Repository;

@Repository
public class StudentRespository {

    public void save(Student student) {
        System.out.println("Student Saved");
    }
}
