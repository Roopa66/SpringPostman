package com.pack.main.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

//import javax.xml.ws.Response;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.pack.main.dao.StudentRepository;
import com.pack.main.model.Student;
import com.pack.main.serviceimplementation.StudentServiceImplementation;

@SpringBootTest
@RunWith(SpringRunner.class)

public class Test1Student {
	
	Student student;

	@InjectMocks
	private StudentServiceImplementation studentServiceImplementation;
	@Mock
	private StudentRepository studentRepository;
	
	
	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		 student =setUpTest1Student();
	}

	

	private Student setUpTest1Student() {
		Student student=new Student ();
		student.setId(2);
		student.setName("jaga");
		student.setAddress("chittoor");
		student.setRoll(666);
		return student;
		
	}
	@Test
	
	public void getTest1Student() {

		when(studentRepository.save(student)).thenReturn(student);

		Student serviceResponse = studentServiceImplementation.saveStudent(student);

		assertEquals(student,  serviceResponse);
	
	
	
	}	
}
