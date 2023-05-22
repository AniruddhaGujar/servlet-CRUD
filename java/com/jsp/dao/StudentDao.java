package com.jsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.dto.Student;

public class StudentDao {

	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Aniruddha");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Student saveStudent (Student student) {
			student.setName("Aniruddha");
			student.setEmail("Aniruddha@gmail.com");
			entityTransaction.begin();
			entityManager.persist(student);
			entityTransaction.commit();
			return student;
		
	}
}
