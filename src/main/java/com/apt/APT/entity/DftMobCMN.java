package com.apt.APT.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="DFT_MOBCMN")
public class DftMobCMN {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer MOBCMNKEY;
	private String IDCADDRESS;
	private String IDCSTATUS;
	private String CITY;
	private String BEDS;
	private String IDCLISTPRICE;
	
}
