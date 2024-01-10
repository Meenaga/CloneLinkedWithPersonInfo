package com.naveen.cloneLinkedIn.entity;

import java.time.LocalDate;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name="Person_Details")
public class Person 
{

	@Id
	private long id;
	private String name;
	private String place;
	@Lob
	private byte[] image;
	@JsonFormat(shape=JsonFormat.Shape.STRING, pattern="yyyy-MM-dd")
	private LocalDate Date_of_Joining;
	public Person()
	{
		
	}
	public Person(long id, String name, String place, byte[] image, LocalDate date_of_Joining) {
		super();
		this.id = id;
		this.name = name;
		this.place = place;
		this.image = image;
		this.Date_of_Joining = date_of_Joining;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public LocalDate getDate_of_Joining() {
		return Date_of_Joining;
	}
	public void setDate_of_Joining(LocalDate date_of_Joining2) {
		this.Date_of_Joining = date_of_Joining2;
	}
	
 }
