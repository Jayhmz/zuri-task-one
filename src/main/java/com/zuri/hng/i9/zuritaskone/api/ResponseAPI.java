package com.zuri.hng.i9.zuritaskone.api;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data @AllArgsConstructor
public class ResponseAPI {

	private String slackUsername; 
	private boolean backend;
	private int age;
	private String bio;
}
