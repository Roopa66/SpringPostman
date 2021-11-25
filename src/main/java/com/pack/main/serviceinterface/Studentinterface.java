package com.pack.main.serviceinterface;
import com.pack.main.model.Student;
import java.util.List;

public interface Studentinterface {
	//To save new student
	public Student saveStudent(Student student);
	
	//To update student
	public Student updateStudent(Student student);
	
	//ToTo Fetch all students from database
	
	public List<Student> findAllStudents();
	
	//To delete student
	public void deleteStudent(int id);
	
}

