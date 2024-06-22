package com.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.main.dto.TravelDto;
import com.main.service.RedBusService;
@RestController
public class RedBusController {
	
	@Autowired RedBusService redbusService;
	
	@GetMapping("/viewAllTravels")
	public ResponseEntity<List<List<TravelDto>>> getAllTravels(){
		
		List<List<TravelDto>> list=redbusService.getAllTravels();
		
		return new ResponseEntity<List<List<TravelDto>>>(list, HttpStatus.ACCEPTED);
	}

}
