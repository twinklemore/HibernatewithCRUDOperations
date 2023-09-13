package com.jsp.student;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


public class StudentGetAll {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		String sql="SELECT s FROM Student s"; 
		Query query=entityManager.createQuery(sql); //javax.persist pckg
		List<Student>students=query.getResultList(); //list is from java.util pckg
		for(Student s:students) {
			System.out.println("========================================");
			System.out.println(s.getId());
			System.out.println(s.getName());
			System.out.println(s.getEmail());
			System.out.println(s.getCno());
			System.out.println("========================================");


	}

}
}
