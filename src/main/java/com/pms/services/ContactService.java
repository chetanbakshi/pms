package com.pms.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.pms.entity.Contact;
import com.pms.repository.ContactRepository;

@Service
public class ContactService {

	@Autowired
	private ContactRepository contactRepository;

	public List<Contact> getAllContacts() {
		/*
		 * List<Contact> list = new ArrayList<Contact>();
		 * contactRepository.findAll().forEach(contact -> {
		 * 
		 * if (contact.getUid().equals("2")) { System.out.println(contact);
		 * list.add(contact); } });
		 */
		return contactRepository.findAll();

	}

	public List<Contact> getContactsByUid(String uid) {
		List<Contact> list = new ArrayList<Contact>();
		list = contactRepository.getContactsByUid(uid);
		return list;
	}

	public Contact addContact(Contact contact) {
		System.out.println(contact);
		return contactRepository.save(contact);
	}
	
	
	
//	public List<Contact> getAllContactsByid() {
//		List<Contact> list = new ArrayList<Contact>();
//		
//		return contactRepository.
//		contactRepository.findAll().forEach(contact -> {
//			
//			if (contact.getUid() ==  "1") {		
//				System.out.println(contact);
//				list.add(contact);
//			}
//		});
		// return list;

//	}

}
