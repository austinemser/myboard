package com.myboard.dao;

// Generated Mar 13, 2013 12:50:36 AM by Hibernate Tools 4.0.0

/**
 * Department generated by hbm2java
 */
public class Department implements java.io.Serializable {

	private int deptId;
	private String departmentName;

	public Department() {
	}

	public Department(int deptId, String departmentName) {
		this.deptId = deptId;
		this.departmentName = departmentName;
	}

	public int getDeptId() {
		return this.deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDepartmentName() {
		return this.departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

}