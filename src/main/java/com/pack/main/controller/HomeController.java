package com.pack.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pack.main.model.Student;
import com.pack.main.serviceimplementation.StudentServiceImplementation;



@RestController
                   //we are usingPostman to be operations for that we need to add cross origin annotation
@CrossOrigin
public class HomeController {
	                //to create bean of implementation class
	@Autowired
	StudentServiceImplementation studentServiceImplementation;
	              //to call save method or to save new student
	@PostMapping(value="saveStudent")
	
	public Student saveStudent(@RequestBody Student student) {
		         //lets try if it works
		System.out.println("Student save works properly!");
		studentServiceImplementation.saveStudent(student);
		return student;
		
	}
	//in this way new student registration is done
	
	
	//now lets find all students from db
	@GetMapping(value="getAllStudents")
	public List<Student> findAllStudent(){
		return studentServiceImplementation.findAllStudents();
	}
		
		
		//try to update
		
		@PutMapping(value="updateStudent")
	    public Student updateStudent(@RequestBody Student student) {
	        return studentServiceImplementation.updateStudent(student);
	}
		
		//try to delete
		@DeleteMapping("deleteStudent")
		public String deleteStudent(@RequestParam int id) {
		studentServiceImplementation.deleteStudent(id);
		return "Student Deleted";
			
		}
}
