package com.cdac.app;

import com.cdac.dao.CustomerDao;
import com.cdac.entity.Customer;

public class AddCustomerUsingDao {
	public static void main(String [] args) {
		Customer customer = new Customer();
		customer.setName("Samruddhi");
		customer.setEmail("samruddhi@gmail.com");
		customer.setDateofbirth(null); 
		customer.setCity("Mumbai");
		
		CustomerDao dao = new CustomerDao();
		dao.store(customer);
	}

	
}
