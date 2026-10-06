package com.lpa.ems.employee.entities;

public class Employee {
	private int id;
	private String ename;
	private String email;
	private String dob;
	private String gender;
	private String qualification;
	private boolean status=true;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", empName=" + ename + ", email=" + email + ", dob=" + dob + ", gender="
				+ gender + ", qualification=" + qualification + ", status=" + status + "]";
	}
	//All args constructor
	public Employee(String ename, String email, String dob, String gender, String qualification) {
		super();
		this.ename = ename;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.qualification = qualification;
	}
	//No args constructor
	public Employee() {
		
	}
}
