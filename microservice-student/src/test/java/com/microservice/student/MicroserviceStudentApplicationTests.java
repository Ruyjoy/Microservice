package com.microservice.student;

import com.microservice.student.entities.Student;
import com.microservice.student.service.StudentServiceImpl;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MicroserviceStudentApplicationTests {

	@Test
	void contextLoads() {
	}



	@Test
	@DisplayName("Prueba de usuarios")
	void crearUsiario() {

		Student u = new Student();
		u.setName("Test");
		u.setLastName("Test");
		u.setEmail("@aa");
		u.setCourseId(1L);
		StudentServiceImpl ss = new StudentServiceImpl();
		ss.save(u);

		Student existe =ss.findById(2L);



	}
}
