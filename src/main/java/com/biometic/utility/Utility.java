package com.biometic.utility;

import org.springframework.stereotype.Service;


public interface Utility {

	
	// create user http://localhost:3000/api/newuser?employeeNo=KGM041&orgName=KAGAMI
	// create new server  http://localhost:3000/api/newserver?serverIp=192.168.1.98&port=8000&serverName=KAGAMIERP.COM&country=INDIA&type=entry
     String ESCALATE_ISSUE_STATUS = "sfarm_cloud_env_11";
	
	//read and write  update last read value of device 
	// replace string values with string constant values 
	// read from server machine one by one in and out 
	// post error in separate table if error comes 
	// logs implementations 
	// scheduling 
	// 
	
	 String GETEVENTCOUNT="geteventcount";
	 String SEQ_NUMBER="Seq-Number";
	 String GET_EVENTS="getevents";
	 
	 
	 
	 
}
