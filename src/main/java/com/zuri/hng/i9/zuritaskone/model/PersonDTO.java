package com.zuri.hng.i9.zuritaskone.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class PersonDTO {

	String username, bio;
	boolean backend;
	int age;
}
