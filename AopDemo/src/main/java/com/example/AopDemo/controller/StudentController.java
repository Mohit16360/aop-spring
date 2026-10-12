package com.example.AopDemo.controller;
import com.example.AopDemo.dto.Student;
import com.example.AopDemo.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    public StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @PostMapping
    public ResponseEntity<String> createStudent(@RequestBody Student student) {

        studentService.createStudent(student);

        return ResponseEntity.ok("Done");

    }
}
