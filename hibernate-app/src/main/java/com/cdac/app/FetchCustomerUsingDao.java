package com.cdac.app;

import java.util.List;

import com.cdac.dao.CustomerDao;
import com.cdac.entity.Customer;

public class FetchCustomerUsingDao {
	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
//		Customer customer = dao.findByPK(1);
//		System.out.println(customer.getName());
//		System.out.println(customer.getEmail());
//		System.out.println(customer.getDateofbirth());
//		System.out.println(customer.getCity());
		List<Customer> list=dao.findAll();
		for(Customer customer:list) {
			System.out.println(customer.getName());
			System.out.println(customer.getEmail());
			System.out.println(customer.getDateofbirth());
			System.out.println(customer.getCity());
			System.out.println("................................");
		}
	}
}
