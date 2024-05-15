package com.doping.dopingchal.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; 
	
	
	private String firstName;
	private String lastName; 
	private String userName;
	private String passwords;
	
	
	@OneToMany(mappedBy = "student")
    private List<TestResult> testResults;


	
	
	
	
	
	
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
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


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPasswords() {
		return passwords;
	}


	public void setPasswords(String passwords) {
		this.passwords = passwords;
	}


	public List<TestResult> getTestResults() {
		return testResults;
	}


	public void setTestResults(List<TestResult> testResults) {
		this.testResults = testResults;
	}
	
	
	
	
	
	
	
	

}
