package com.myboard.dao;

import java.util.HashSet;
import java.util.Set;

// Generated Mar 13, 2013 12:50:36 AM by Hibernate Tools 4.0.0

/**
 * Department generated by hbm2java
 */
public class Department implements java.io.Serializable {

	private static final long serialVersionUID = -8762883222135130659L;

	private int deptId;
	private String departmentName;
	private Set<CourseInfo> courseInfos = new HashSet<CourseInfo>(0);
	private Set<Users> users = new HashSet<Users>(0);

	public Department() {
	}

	public Department(int deptId, String departmentName) {
		this.deptId = deptId;
		this.departmentName = departmentName;
	}

	public Department(int deptId, String departmentName,
			Set<CourseInfo> courseInfos, Set<Users> users) {
		this.deptId = deptId;
		this.departmentName = departmentName;
		this.courseInfos = courseInfos;
		this.users = users;
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

	public Set<CourseInfo> getCourseInfos() {
		return this.courseInfos;
	}

	public void setCourseInfos(Set<CourseInfo> courseInfos) {
		this.courseInfos = courseInfos;
	}

	public Set<Users> getUsers() {
		return this.users;
	}

	public void setUsers(Set<Users> users) {
		this.users = users;
	}
}
