package com.yi.sample;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.Setter;
import lombok.extern.log4j.Log4j;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class SamileTests {
	@Setter(onMethod_ = { @Autowired})
	private Restaurant restaurant;
	
	@Test
	public void testExit() {
		assertNotNull(restaurant);
		log.info(restaurant);
		log.info("1----------------------");
		log.info(restaurant.getChef());
	}

	@Test
	public void testExit1() {
		assertNotNull(restaurant);
		log.info(restaurant);
		log.info("2---------------------");
		log.info(restaurant.getChef());
	}
	
	
	public void testExit2() {
		assertNotNull(restaurant);
		log.info(restaurant);
		log.info("3---------------------");
		log.info(restaurant.getChef());
	}
	
}
