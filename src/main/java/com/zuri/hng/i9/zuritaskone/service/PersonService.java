package com.zuri.hng.i9.zuritaskone.service;

import org.springframework.stereotype.Service;

import com.zuri.hng.i9.zuritaskone.api.ResponseAPI;
import com.zuri.hng.i9.zuritaskone.model.PersonDTO;

@Service
public class PersonService {

	public ResponseAPI personDetails() {
		
		PersonDTO personDTO = new PersonDTO("Jayhmz", "Backend Engineer and Tech Educator", false, 26);
				
		return new ResponseAPI(personDTO.getUsername(), true, personDTO.getAge(), personDTO.getBio());
		
	}
}
