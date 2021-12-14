package com.example.springajaxblog.controller;

import com.example.springajaxblog.model.ClassRoom;
import com.example.springajaxblog.model.Student;
import com.example.springajaxblog.service.classRoom.IClassService;
import com.example.springajaxblog.service.student.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
public class StudentRestController {
    @Autowired
    private IStudentService studentService;
    @Autowired
    private IClassService classService;

    @GetMapping("")
    public ModelAndView showAll() {
        ModelAndView modelAndView = new ModelAndView("views/list");
        modelAndView.addObject("students", studentService.findAll());
        return modelAndView;
    }


    @ModelAttribute("classRoom")
    public Iterable<ClassRoom> classRoomList() {
        return classService.findAll();
    }

    @GetMapping("/success")
    public ResponseEntity<List<Student>> successHandle() {
        List<Student> students = (List<Student>) studentService.findAll();
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Student> addNewStudent(@RequestBody Student student) {
        return new ResponseEntity<>(studentService.save(student), HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable Long id) {
        studentService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);

    }

    @PutMapping("/{id}")
    public ResponseEntity<Student> update(@PathVariable Long id) {
        Student student = studentService.findById(id).get();
        studentService.save(student);
        return new ResponseEntity<>(student, HttpStatus.OK);
    }


}
