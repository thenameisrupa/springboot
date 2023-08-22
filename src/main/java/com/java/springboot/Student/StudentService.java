package com.java.springboot.Student;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	public List<Student> getAllStudents() {
		List<Student> students=new ArrayList<>();
		studentRepository.findAll().forEach(students::add);
		return students;
	}
	public Student getStudent(String name) {
		return studentRepository.findByName(name);
	}
	public void deleteStudent(String percentage) {
		studentRepository.deleteByPercentage(percentage);
	}
	public void updateStudent( Student student) {
		studentRepository.save(student);	
	}
	public void addStudent(Student student) {
		studentRepository.save(student);
	}
}
