package com.pms.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.pms.entity.Contact;
import com.pms.repository.ContactRepository;
import com.pms.services.ContactService;

@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;
	
	@GetMapping(value="/getContacts")
	public List<Contact> getContacts() {
		return contactService.getAllContacts();
	}
	
	@GetMapping(value="/getContacts/{uid}")
	public List<Contact> getContactsByUid(@PathVariable("uid") String uid) {
		return contactService.getContactsByUid(uid);
	}
	
	@PostMapping(value="/add")
	public Contact addContact(@RequestBody Contact contact) {
		
		return contactService.addContact(contact);
	}
	
}
