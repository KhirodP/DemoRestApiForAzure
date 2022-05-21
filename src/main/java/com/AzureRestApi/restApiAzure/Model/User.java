package com.AzureRestApi.restApiAzure.Model;

import javax.persistence.Id;

import com.azure.spring.data.cosmos.core.mapping.Container;

@Container(containerName = "User")
public class User {

	@Id
	int id;
	String firstName;
	String lastName;
	String address;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String firstName, String lastName, String address) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + "]";
	}
	

	
}

