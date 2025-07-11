package com.example.student;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    private Student student = new Student();

    @GetMapping
    public Student getStudent() {
        student.setName("Sachin");
        student.setAge(25);
        student.setCourse("DevOps");
        return student;
    }
 
    @PostMapping
    public String saveStudent(@RequestBody Student s) {
        this.student = s;
        return "Student saved successfully!";
    }
}