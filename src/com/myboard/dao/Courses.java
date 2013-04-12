package com.myboard.dao;

import java.util.HashSet;
import java.util.Set;

// Generated Mar 13, 2013 12:50:36 AM by Hibernate Tools 4.0.0

/**
 * Courses generated by hbm2java
 */
public class Courses implements java.io.Serializable {

	private static final long serialVersionUID = -266516827773610878L;

	private Integer courseId;
	private CourseSection section;
	private Semester semester;
	private String courseRootDirectory;
	private Set<CourseMaterial> materials = new HashSet<CourseMaterial>(0);
	private Set<Announcements> announcements = new HashSet<Announcements>(0);
	private Set<CourseUsers> users = new HashSet<CourseUsers>(0);
	private Set<Message> messages = new HashSet<Message>(0);
	private Set<Assignments> assignments = new HashSet<Assignments>(0);

	public Courses() {
	}

	public Courses(CourseSection section, Semester semester, 
			String courseRootDirectory) {
		this.semester = semester;
		this.section = section;
		this.courseRootDirectory = courseRootDirectory;
	}

	public Courses(CourseSection section, Semester semester,
			String courseRootDirectory, Set<CourseMaterial> materials,
			Set<Announcements> announcements, Set<CourseUsers> users,
			Set<Message> messages, Set<Assignments> assignments) {
		this.semester = semester;
		this.section = section;
		this.courseRootDirectory = courseRootDirectory;
		this.materials = materials;
		this.announcements = announcements;
		this.users = users;
		this.messages = messages;
		this.assignments = assignments;
	}
	
	public Integer getCourseId() {
		return this.courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
	}

	public Semester getSemester() {
		return this.semester;
	}

	public void setSemester(Semester semester) {
		this.semester = semester;
	}

	public CourseSection getSection() {
		return this.section;
	}

	public void setSection(CourseSection section) {
		this.section = section;
	}
	
	public String getCourseRootDirectory() {
		return this.courseRootDirectory;
	}

	public void setCourseRootDirectory(String courseRootDirectory) {
		this.courseRootDirectory = courseRootDirectory;
	}
	
	public Set<CourseMaterial> getMaterials() {
		return this.materials;
	}

	public void setMaterials(Set<CourseMaterial> materials) {
		this.materials = materials;
	}

	public Set<Announcements> getAnnouncements() {
		return this.announcements;
	}

	public void setAnnouncements(Set<Announcements> announcements) {
		this.announcements = announcements;
	}

	public Set<CourseUsers> getUsers() {
		return this.users;
	}

	public void setUsers(Set<CourseUsers> users) {
		this.users = users;
	}

	public Set<Message> getMessages() {
		return this.messages;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}

	public Set<Assignments> getAssignments() {
		return this.assignments;
	}

	public void setAssignments(Set<Assignments> assignments) {
		this.assignments = assignments;
	}
}