package com.hibernate.ManyToMany.Bidirectional;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Student {
	@Id
	private int StudentRollNo;
	private String StudentName;
	private String StudentAddress;

	@ManyToMany(mappedBy = "student")
	private List<Subject> subject;

	public int getStudentRollNo() {
		return StudentRollNo;
	}

	public void setStudentRollNo(int studentRollNo) {
		StudentRollNo = studentRollNo;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudentAddress() {
		return StudentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}

	public List<Subject> getSubject() {
		return subject;
	}

	public void setSubject(List<Subject> subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Student [StudentRollNo=" + StudentRollNo + ", StudentName=" + StudentName + ", StudentAddress="
				+ StudentAddress + ", subject=" + subject + "]";
	}

}
