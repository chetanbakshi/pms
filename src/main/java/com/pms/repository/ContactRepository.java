package com.pms.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.pms.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	@Query(value = "SELECT * FROM Contact  WHERE uid=?", nativeQuery = true)
	public List<Contact> getContactsByUid(String Uid);

	

}
