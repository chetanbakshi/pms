package com.pms;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pms.entity.Contact;
import com.pms.repository.ContactRepository;

@SpringBootApplication
public class PmsApplication   {

	@Autowired
	private ContactRepository contactRepository;
	public static void main(String[] args) {
		SpringApplication.run(PmsApplication.class, args);		
	}

//	@Override
//	public void run(String... args) throws Exception {
//	  Contact c = new Contact("1", "Keerti", "Patil", "keerti@gmail.com", "123654", "123654", "adress");
//	  Contact c3= new Contact("2", "Chetan", "Patil", "keerti@gmail.com", "123654", "123654", "adress");
//	  Contact c1= new Contact("1", "Keerti", "Patil", "keerti@gmail.com", "123654", "123654", "adress");
//	  Contact c2= new Contact("2", "Chetan", "Patil", "keerti@gmail.com", "123654", "123654", "adress");
//	  
//	  Contact c4= new Contact("2", "Chetan", "Patil", "keerti@gmail.com", "123654", "123654", "adress");
//	  List<Contact> list = new ArrayList<Contact>();
//	  list.add(c);
//	  list.add(c1);
//	  list.add(c2);
//	  list.add(c3);
//	  list.add(c4);
//	  
//	  contactRepository.saveAll(list);
	  
	  
	
}
