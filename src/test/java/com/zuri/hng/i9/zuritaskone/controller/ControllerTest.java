package com.zuri.hng.i9.zuritaskone.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

import com.zuri.hng.i9.zuritaskone.api.ResponseAPI;
import com.zuri.hng.i9.zuritaskone.model.PersonDTO;
import com.zuri.hng.i9.zuritaskone.service.PersonService;

@ExtendWith(MockitoExtension.class)
class ControllerTest {
	
	@InjectMocks
	private Controller controller;
	
	@Mock
	private PersonService service;

	@Test
	void actualResponseTest() {
		PersonDTO dto = new PersonDTO("Jayhmz", "Backend Engineer and Tech Educator", false, 26);
		
		ResponseEntity<ResponseAPI> details = controller.getDetails();
		
		assertNotNull(details);
	}
	
	@Test
	void nullResponseTest() {
		PersonDTO dto = new PersonDTO("Jayhmz", "Backend Engineer and Tech Educator", false, 26);
		
		when(service.personDetails()).thenReturn(null);
		
		ResponseEntity<ResponseAPI> details = controller.getDetails();
		
		assertThrows(RuntimeException.class, () -> service.personDetails());
		
		
	}

}
