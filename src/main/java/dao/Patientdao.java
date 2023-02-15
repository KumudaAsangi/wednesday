package dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import controller.Patient;
import dto.Patientdto;

public class Patientdao {
	EntityManagerFactory entitymanagerfactory=Persistence.createEntityManagerFactory("xyz");
	EntityManager entitymanager= entitymanagerfactory.createEntityManager();
	EntityTransaction entitytransaction= entitymanager.getTransaction();

	public void insert(Patient patient) {
	 entitytransaction.begin();
	 entitymanager.persist(patient);
	 entitytransaction.commit();
}
	public void update(String s1,String s2){
		Patientdto p1=entitymanager.find(Patientdto.class,s1);
		p1.setBg(s2);
		
		entitytransaction.begin();
		entitymanager.merge(p1);
		entitytransaction.commit();
	}
}
