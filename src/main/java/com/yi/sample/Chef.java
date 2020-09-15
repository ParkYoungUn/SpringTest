package com.yi.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.log4j.Log4j;

@Component
@Data
public class Chef {
	
	Chef()
	{
		System.out.println("=====================");
	}

}
