package com.main.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

import com.main.dto.TravelDto;
import com.main.service.RedBusService;

@Service
public class RedBusServiceImpl implements RedBusService{
	
	@Autowired RestTemplate rt;

	@Override
	@GetMapping("/allTravels")
	public List<List<TravelDto>> getAllTravels() {
		
		String url = "http://localhost:7070/travels/all";
		List<TravelDto> list = rt.getForObject(url, List.class);
		
		List al = new ArrayList();
		al.add(list);
		
		
		return al;
	}

}
