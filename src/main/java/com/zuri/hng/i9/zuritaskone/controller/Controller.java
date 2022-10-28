package com.zuri.hng.i9.zuritaskone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zuri.hng.i9.zuritaskone.service.PersonService;

@RestController
public class Controller {
	
	@Autowired
	private PersonService service;

	@GetMapping("/info")
	public ResponseEntity<String> getDetails(){
		
		String personDetails = service.personDetails();
		
		return new ResponseEntity<String>(personDetails,HttpStatus.OK);
	}
}
