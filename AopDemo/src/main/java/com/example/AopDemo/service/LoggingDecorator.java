package com.example.AopDemo.service;

import com.example.AopDemo.dto.Student;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class LoggingDecorator implements StudentService{

    private StudentServiceImpl studentServiceImpl;

    public LoggingDecorator(StudentServiceImpl studentServiceImpl) {
        this.studentServiceImpl = studentServiceImpl;
    }

    @Override
    public void createStudent(Student student) {

        LoggingUtility.logstart("LoggingDecorator","createStudent");

        studentServiceImpl.createStudent(student);

        LoggingUtility.logend("LoggingDecorator","createStudent");



    }

}
