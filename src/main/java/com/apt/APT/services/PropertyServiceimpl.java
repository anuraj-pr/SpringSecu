package com.apt.APT.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.apt.APT.DAO.PropertyDAOint;
import com.apt.APT.entity.Property;

@Service
@Transactional
public class PropertyServiceimpl implements proService {

	@Autowired
	PropertyDAOint proDAO;
	
	@Override
	public void adduer(Property prop) {
		proDAO.adduer(prop);
		
	}

}
