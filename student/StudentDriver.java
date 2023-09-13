package com.jsp.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StudentDriver {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=
				Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Student student=new Student();
		//student.setId(1);
		student.setName("Pbmore");
		student.setEmail("pbmore@mail.com");
		student.setPlace("airoli");
		student.setCno(99690456);
		
		entityTransaction.begin();
		entityManager.persist(student);
		entityTransaction.commit();

	}

}
