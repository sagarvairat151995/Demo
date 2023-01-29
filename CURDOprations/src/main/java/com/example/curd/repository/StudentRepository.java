package com.example.curd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.curd.entity.Student;


@Repository
public interface StudentRepository extends CrudRepository <Student, Integer> {
	
	

}
