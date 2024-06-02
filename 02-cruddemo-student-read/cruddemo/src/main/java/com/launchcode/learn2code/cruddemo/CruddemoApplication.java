package com.launchcode.learn2code.cruddemo;

import com.launchcode.learn2code.cruddemo.dao.StudentDAO;
import com.launchcode.learn2code.cruddemo.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.CommandLinePropertySource;

import java.sql.SQLOutput;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
	@Bean
	//public CommandLineRunner commandLineRunner(String[] args)
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
	{
		return runner->{
			readStudent(studentDAO);

			//createStudent(studentDAO);
			//createMultipleStudents(studentDAO);
			//System.out.println("Hello World!");
		};
	}

	private void readStudent(StudentDAO studentDAO) {
		//create a student object
		System.out.println("Creating ne student for reading the object");
		Student tempStudent1 = new Student("navya","sree","navya@learn2code@gmail.com");
		//save the student
		System.out.println("Saving the student:");
		studentDAO.save(tempStudent1);
		//display id of student
		int theID= tempStudent1.getId();
		System.out.println("Saved Student: GeneratedId:" +theID);

		//retrive student  based on id:primary key
		System.out.println("Retreiving student Id");
		Student myStudent=studentDAO.findById(theID);
		//display student
		System.out.println("Found the student:" + myStudent);

	}

	private void createMultipleStudents(StudentDAO studentDAO) {

		// create multiple students
		System.out.println("Creating 3 student objects ...");
		Student tempStudent1 = new Student("John", "Doe", "john@luv2code.com");
		Student tempStudent2 = new Student("Mary", "Public", "mary@luv2code.com");
		Student tempStudent3 = new Student("Bonita", "Applebum", "bonita@luv2code.com");

		// save the student objects
		System.out.println("Saving the students ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);
	}
	private void createStudent(StudentDAO studentDAO) {
		//create the student object
		System.out.println("Creating new Student:" );
		Student tempStudent = new Student("Paul","john","pauljohn@gmail.com");
		//save the student object
		System.out.println("Saving the object:" );
		studentDAO.save(tempStudent);
		//dispaly the saved content
		System.out.println("Saved Student.Generated id: "+tempStudent.getId());
	}

}
