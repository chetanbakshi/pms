package com.pms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Contact")
public class Contact {
	
	

	@Id
	private int id;
	
	@Column(name="uid")
	private String uid;
	
	@Column(name="FIRSTNAME")
	private String firstName;
	
	@Column(name="LASTNAME")
	private String lastName;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name="PHONE")
	private String phone;
	
	@Column(name="MOBILE")
	private String mobile;
	
	@Column(name="ADDRESS")	
	private String address;
	
	

	
	  public Contact(String uid, String firstName, String lastName, String email,
	  String phone, String mobile, String address) {
	  
	  this.uid = uid; this.firstName = firstName; this.lastName = lastName;
	  this.email = email; this.phone = phone; this.mobile = mobile; this.address =
	  address; }
	 
	
	  public Contact() {
		  
	  }
	 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

//	@Override
//	public String toString() {
//		return "{id=" + id + ", uid=" + uid + ", firstName=" + firstName + ", lastName=" + lastName + ", email="
//				+ email + ", phone=" + phone + ", mobile=" + mobile + ", address=" + address + "}";
//	}

	
}
