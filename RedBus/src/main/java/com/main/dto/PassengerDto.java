package com.main.dto;

import lombok.Data;

@Data
public class PassengerDto {

	private int pid;
	private String name;
	private String email;
	private int age;
	private String gender;
	private long contactNumber;
	private String pickUpPoint;
	private String DropPoint;
}
