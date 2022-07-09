package com.config;

import com.domain.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.UUID;

@Configuration
public class BeanConfig {

	@Bean
	public Student student() {
		Student student = new Student();
		student.setName(UUID.randomUUID().toString());
		return student;
	}

}
