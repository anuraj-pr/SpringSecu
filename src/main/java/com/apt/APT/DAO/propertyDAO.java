package com.apt.APT.DAO;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.apt.APT.entity.Property;

@Repository
public class propertyDAO implements PropertyDAOint {

	@Autowired
	SessionFactory sess;

	
	
	@Override
	public void adduer(Property pop) {
		Session ses=sess.getCurrentSession();
		ses.save(pop);
	}



	public SessionFactory getSess() {
		return sess;
	}



	public void setSess(SessionFactory sess) {
		this.sess = sess;
	}
	
	
	
}
