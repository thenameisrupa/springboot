package com.java.springboot.Student;

import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class Student {

	@Id
	private Integer id;
	private String name;
	private Double percentage;
	
}
