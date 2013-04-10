package com.myboard.dao;

import java.util.HashSet;
import java.util.Set;

// Generated Mar 13, 2013 12:50:36 AM by Hibernate Tools 4.0.0

/**
 * CourseRoles generated by hbm2java
 */
public class CourseRoles implements java.io.Serializable {

	private static final long serialVersionUID = -3762025858490335307L;

	private int roleId;
	private String roleName;
//Begin Modification (Ben Andow)
	private Set<CourseUsers> users = new HashSet<CourseUsers>(0);
//End Modification (Ben Andow)
	
	public CourseRoles() {
	}

	public CourseRoles(int roleId, String roleName) {
		this.roleId = roleId;
		this.roleName = roleName;
	}

//Begin Modification (Ben Andow)
	public CourseRoles(int roleId, String roleName,
			Set<CourseUsers> users) {
		this.roleId = roleId;
		this.roleName = roleName;
		this.users = users;
	}
//End Modification (Ben Andow)
	
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
//Begin Modification (Ben Andow)
	public Set<CourseUsers> getUsers() {
		return this.users;
	}

	public void setUsers(Set<CourseUsers> users) {
		this.users = users;
	}
//End Modification (Ben Andow)
}
