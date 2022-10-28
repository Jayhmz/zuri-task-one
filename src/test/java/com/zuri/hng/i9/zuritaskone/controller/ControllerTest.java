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
		PersonDTO dto = new PersonDTO();
		dto.setAge(10);
		dto.setBackend(true);
		dto.setUsername("James");
		dto.setBio("somethinng hereee");
		
		ResponseEntity<ResponseAPI> details = controller.getDetails(dto);
		
		assertNotNull(details);
	}
	
	@Test
	void nullResponseTest() {
		PersonDTO dto = new PersonDTO();
		dto.setAge(10);
		dto.setBackend(true);
		dto.setUsername("James");
		dto.setBio("somethinng hereee");
		
		when(service.personDetails(dto)).thenReturn(null);
		
		ResponseEntity<ResponseAPI> details = controller.getDetails(dto);
		
		assertThrows(RuntimeException.class, () -> service.personDetails(dto));
		
		
	}

}
