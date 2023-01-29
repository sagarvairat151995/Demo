package com.example.curd.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.curd.entity.Student;
import com.example.curd.repository.StudentRepository;
import com.example.curd.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	public StudentRepository studentRepository;

	@Override
	public Student addStudent(Student student) {

		Student std1 = studentRepository.save(student);

		return std1;
	}

}
