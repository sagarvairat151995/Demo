package com.example.curd.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "student")
public class Student {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer stdID;
	
	private String fName;
	
	private String lName;

	public Integer getStdID() {
		return stdID;
	}

	public void setStdID(Integer stdID) {
		this.stdID = stdID;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	@Override
	public String toString() {
		return "Student [stdID=" + stdID + ", fName=" + fName + ", lName=" + lName + "]";
	}

	public Student(Integer stdID, String fName, String lName) {
		super();
		this.stdID = stdID;
		this.fName = fName;
		this.lName = lName;
	}
	
	
	

}
