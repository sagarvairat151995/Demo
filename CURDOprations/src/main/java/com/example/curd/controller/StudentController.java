package com.example.curd.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.curd.entity.Student;
import com.example.curd.serviceimpl.StudentServiceImpl;

@RestController
@RequestMapping("/Student")
public class StudentController {

	@Autowired
	public StudentServiceImpl studentServiceImpl;

	@PostMapping("/add")
	public ResponseEntity<Student> addStudent(@RequestBody Student student) {

		Student std1 = studentServiceImpl.addStudent(student);

		return ResponseEntity.ok().body(std1);

	}

}
