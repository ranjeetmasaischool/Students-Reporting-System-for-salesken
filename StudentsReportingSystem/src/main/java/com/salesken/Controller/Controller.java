package com.salesken.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.salesken.Exception.StudentException;
import com.salesken.Model.Student;
import com.salesken.Service.StudentDao;

@RestController
public class Controller {
	
	@Autowired
	private StudentDao studentDao;
	
	@PostMapping("/student")
	public ResponseEntity<Student> addStudentWithMark(@RequestBody Student student) throws StudentException{
		
		return new ResponseEntity<>(studentDao.addStudentWithMarks(student) , HttpStatus.CREATED);
	}
	
	
}
