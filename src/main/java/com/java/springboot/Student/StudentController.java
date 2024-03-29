package com.java.springboot.Student;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	
	@RequestMapping("/students/{name}")
	public Student getStudent(@PathVariable String name) {
		return studentService.getStudent(name);		
	}
	
	@RequestMapping(method = RequestMethod.POST,value ="/students")
	public void addStudent(@RequestBody Student student) {
		studentService.addStudent(student);		
	}
	@RequestMapping(method = RequestMethod.PUT,value ="/students")
	public void updateStudent(@RequestBody Student student) {
		studentService.updateStudent(student);
	}
	@RequestMapping(method = RequestMethod.DELETE,value="/students/{percentage}")
	public void deleteStudent(@PathVariable String percentage) {
	 studentService.deleteStudent(percentage);
	}

}

