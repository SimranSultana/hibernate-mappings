package com.hibernate.ManyToMany.Bidirectional;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Subject {
	@Id
    private int SubjectId;
    private String SubjectName;
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn (name = "Sudent_id"),inverseJoinColumns = @JoinColumn (name = "Subject_id"))
    private List<Student> student;
	public int getSubjectId() {
		return SubjectId;
	}
	public void setSubjectId(int subjectId) {
		SubjectId = subjectId;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	public List<Student> getStudent() {
		return student;
	}
	public void setStudent(List<Student> student) {
		this.student = student;
	}
	@Override
	public String toString() {
		return "Subject [SubjectId=" + SubjectId + ", SubjectName=" + SubjectName + ", student=" + student + "]";
	}
}
