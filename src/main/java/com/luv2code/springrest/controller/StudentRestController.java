package com.luv2code.springrest.controller;

import com.luv2code.springrest.entity.Student;
import com.luv2code.springrest.rest.StudentNotFoundException;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack Tran
 */
@RestController
@RequestMapping("/api")
public class StudentRestController {

    private List<Student> theStudents;

    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();

        theStudents.add(new Student("Jack", "Tran"));
        theStudents.add(new Student("Vincent", "Tran"));
        theStudents.add(new Student("Anh", "Pam"));
    }

    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }

    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        if((studentId >= theStudents.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student ID not found- " + studentId);
        }
        return theStudents.get(studentId);
    }
}

