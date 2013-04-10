package com.myboard.dao;

import java.util.HashSet;
import java.util.Set;

// Generated Mar 13, 2013 12:50:36 AM by Hibernate Tools 4.0.0

/**
 * AssignmentTypes generated by hbm2java
 */
public class AssignmentTypes implements java.io.Serializable {

	private static final long serialVersionUID = 8768129859307385060L;

	private int assignmentTypeId;
	private String assignmentTypeName;
//Begin Modification (Ben Andow)
	private Set<Assignments> assignments = new HashSet<Assignments>(0);
//End Modification (Ben Andow)
	
	public AssignmentTypes() {
	}

	public AssignmentTypes(int assignmentTypeId) {
		this.assignmentTypeId = assignmentTypeId;
	}

//Begin Modification (Ben Andow)
	public AssignmentTypes(int assignmentTypeId, String assignmentTypeName,
			Set<Assignments> assignments) {
		this.assignmentTypeId = assignmentTypeId;
		this.assignmentTypeName = assignmentTypeName;
		this.assignments = assignments;
	}
	
//	public AssignmentTypes(int assignmentTypeId, String assignmentTypeName) {
//		this.assignmentTypeId = assignmentTypeId;
//		this.assignmentTypeName = assignmentTypeName;
//	}
//End Modification (Ben Andow)
	
	public int getAssignmentTypeId() {
		return this.assignmentTypeId;
	}

	public void setAssignmentTypeId(int assignmentTypeId) {
		this.assignmentTypeId = assignmentTypeId;
	}

	public String getAssignmentTypeName() {
		return this.assignmentTypeName;
	}

	public void setAssignmentTypeName(String assignmentTypeName) {
		this.assignmentTypeName = assignmentTypeName;
	}
//Begin Modification (Ben Andow)
	public Set<Assignments> getAssignments() {
		return this.assignments;
	}

	public void setAssignments(Set<Assignments> assignments) {
		this.assignments = assignments;
	}
//End Modificaiton (Ben Andow)
}
