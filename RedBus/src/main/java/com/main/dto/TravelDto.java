package com.main.dto;

import lombok.Data;

@Data
public class TravelDto {
	private String busNumber;
	private String busAgencyName;
	private String busOwnerName;
	private String busDriverName;
	private String busCoDriverName;
	private int busSeatingCapacity;
	private float bustTicketPrice;
	private String fromLocation;
	private String toLocation;
	private String onBoardingTime;
	private String dropTime;

}
