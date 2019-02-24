package com.componentmapping.client;

import org.hibernate.Session;

import com.componentmapping.entity.Address;
import com.componentmapping.entity.Person;
import com.componentmapping.sessionfactory.HibernateSessionFactory;

public class HibernateClient {

	public static void main(String[] args) {

		Session session = HibernateSessionFactory.getSession();
		session.beginTransaction();
		Address address1 = new Address("Saifee Lane", "Indore", "ABC123");
		Person person1 = new Person("Taher", address1);
		Integer i = (Integer) session.save(person1); //Persist the given transient instance, and returns a generated identifier.
		System.out.println("Record Inserted Successfully");
		System.out.println();
		Person person2 = session.get(Person.class, i);
 		session.getTransaction().commit();
		System.out.println(person2);
	}

}
