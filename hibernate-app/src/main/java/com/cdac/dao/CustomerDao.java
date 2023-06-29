package com.cdac.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cdac.entity.Customer;

public class CustomerDao {
	public void store (Customer customer) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		em.persist(customer); //persist will generate insert query
		
		tx.commit();
		em.close();
		emf.close();
	}
	public List<Customer> findAll(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		Query q = em.createQuery("select c from Customer c");
		List<Customer> list = q.getResultList();
		
		tx.commit();
		em.close();
		emf.close();

		return list;
		
	}
	public Customer findByPK(int id) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hibernate-app");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();
		
		Customer customer = em.find(Customer.class, id);
		
		tx.commit();
		em.close();
		emf.close();

		return customer;
	}
}
