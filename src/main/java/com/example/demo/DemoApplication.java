package com.example.demo;

import com.example.demo.dao.StudentRepo;
import com.example.demo.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DemoApplication implements ApplicationRunner {

	@Autowired
	StudentRepo repoSt;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		repoSt.save(new Student("Ana", "One"));
		repoSt.save(new Student("Bob", "Two"));
		repoSt.save(new Student("Charlie", "One"));
		repoSt.save(new Student("David", "Three"));

	}
}
