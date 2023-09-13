package com.jsp.student;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Student {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	
private int id;
private String name;
private String email;
private String place;
private long cno;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public long getCno() {
	return cno;
}
public void setCno(long cno) {
	this.cno = cno;
}

}
