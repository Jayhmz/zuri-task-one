package com.zuri.hng.i9.zuritaskone.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.zuri.hng.i9.zuritaskone.api.ResponseAPI;
import com.zuri.hng.i9.zuritaskone.model.PersonDTO;
import com.zuri.hng.i9.zuritaskone.service.PersonService;

@RestController
@CrossOrigin("*")
public class Controller {
	
	@Autowired
	private PersonService service;

	@GetMapping("/")
	@ResponseBody
	public ResponseEntity<ResponseAPI> getDetails(){
		
		ResponseAPI personDetails = service.personDetails();
		
		if(personDetails == null) {
			return new ResponseEntity<ResponseAPI>(personDetails, HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<ResponseAPI>(personDetails,HttpStatus.OK);
	}
}
