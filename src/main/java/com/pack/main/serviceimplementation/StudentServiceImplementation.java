package com.pack.main.serviceimplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack.main.dao.StudentRepository;
import com.pack.main.model.Student;
import com.pack.main.serviceinterface.Studentinterface;
//import com.pack.main.test.Response;

@Service
public class StudentServiceImplementation implements Studentinterface{
    @Autowired
    private StudentRepository studentRepo;
	@Override
	public Student saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);
	}
    

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return studentRepo.save(student);//same save method is used to save new student and update student
	
	}

	@Override
	public List<Student> findAllStudents() {
		// it returns a list so casting is needed
		return (List<Student>) studentRepo.findAll();
	
	}

	@Override
	public void deleteStudent(int id) {
		//to delete student
		studentRepo.deleteById(id);
		
	}


	


	
}