package com.example.spring.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.spring.demo.student.Student;
import com.example.spring.demo.student.StudentRepository;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
		return args -> {
			Student nikita = new Student("Nikita", "Drozd", "hell.lol.world@gmail.com", 20);
			studentRepository.save(nikita);
		};
	}
}
