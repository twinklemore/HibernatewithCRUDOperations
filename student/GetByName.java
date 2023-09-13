package com.jsp.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetByName {

	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	Student student=entityManager.find(Student.class,3);
	System.out.println(student.getId());
	System.out.println(student.getName());
	System.out.println(student.getEmail());
	System.out.println(student.getCno());
	}

}
