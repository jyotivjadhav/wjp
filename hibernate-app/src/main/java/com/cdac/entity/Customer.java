package com.cdac.entity;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
@Entity
@Table(name="tbl_customer")
public class Customer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)//auto generate primary key
	@Column(name="cust_id")
	private int id;
	@Column(name="cust_name")
	private String name;
	@Column(name="cust_email_address")
	private String email;
	@Column(name="cust_date_of_birth")
	private LocalDate dateofbirth;
	@Column(name="cust_city_of_residence")
	private String city;
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDate getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(LocalDate dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

}
