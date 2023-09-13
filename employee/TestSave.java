package com.jsp.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSave {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=
				Persistence.createEntityManagerFactory("vikas"); //persistence unit
EntityManager entityManager=entityManagerFactory.createEntityManager();
	
EntityTransaction entityTransaction=entityManager.getTransaction();
Employee employee=new Employee();
employee.setName("klm");
employee.setEmail("klm@mail.com");
employee.setCno(56478456);

entityTransaction.begin(); //lights
entityManager.persist(employee); //camera
entityTransaction.commit(); //takes action
	}
}
