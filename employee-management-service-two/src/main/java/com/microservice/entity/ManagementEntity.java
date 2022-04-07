package com.microservice.entity;

public class ManagementEntity {
	
	private int empId;
	private String fullname;
	private String address;
	private String mobile;
	private String manager;
	private String project;

	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getManager() {
		return manager;
	}
	public void setManager(String manager) {
		this.manager = manager;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public ManagementEntity(int empId, String fullname, String address, String mobile, String manager, String project) {
		super();
		this.empId = empId;
		this.fullname = fullname;
		this.address = address;
		this.mobile = mobile;
		this.manager = manager;
		this.project = project;
	}
	
	

}
