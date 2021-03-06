package com.componentmapping.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Person")
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "PERSON_SEQ")
	@Column(name = "PERSON_ID")
	private int id;

	@Column(name = "PERSON_NAME")
	private String name;

	@Embedded
	private Address address;

	public Person() {
		super();
	}

	public Person(String name, Address address) {
		super();
		this.name = name;
		this.address = address;
	}

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person Details are \nId: " + id + " and Person Name: " + name + " \n\nAddress Details are "
				+ address;
	}

}
