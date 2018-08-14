package com.apt.APT.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apt.APT.DAO.PropertyDAOint;
import com.apt.APT.entity.Property;
import com.apt.APT.services.proService;

@RestController
@RequestMapping(value="/api")
public class PropertyController {
	
	@Autowired
	proService proSev;
	
	Property po=null;
	

	@RequestMapping(value="/property/getappproperty",method=RequestMethod.GET)
	public String getAllProperty(@RequestParam String board){
			System.out.print(board);
	return board;
	}
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String getTest(){
		return "Hi";
	}
	
}
