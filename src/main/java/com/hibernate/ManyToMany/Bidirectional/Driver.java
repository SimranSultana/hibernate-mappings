package com.hibernate.ManyToMany.Bidirectional;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Student student1 = new Student();
		student1.setStudentRollNo(1);
		student1.setStudentName("Simran Sultana");
		student1.setStudentAddress("Bengaluru");
		
		Subject sub = new Subject();
		sub.setSubjectId(101);
		sub.setSubjectName("SE JAVA");
		
		Subject sub1 = new Subject();
		sub1.setSubjectId(102);
		sub1.setSubjectName("EE JAVA");
		
		Subject sub3 = new Subject();
		sub3.setSubjectId(103);
		sub3.setSubjectName("Spring Boot");
		
		List<Subject> subject = new ArrayList();
		subject.add(sub);
		subject.add(sub1);
		subject.add(sub3);
		
		student1.setSubject(subject);
		
		et.begin();
		em.persist(student1);
		em.persist(sub);
		em.persist(sub1);
		em.persist(sub3);
		et.commit();
		
	}

}
