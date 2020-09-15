package com.yi.persistence;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yi.domain.BoardVO;
import com.yi.mapper.BoardMapper;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
@Log4j
public class BoardMapperTests {
	
	@Setter(onMethod_ = @Autowired)
	private BoardMapper mapper;
	
	//@Test
	public void testGetList() {
		mapper.getList().forEach(board -> log.info(board));
	}
	
	
	//@Test
	public void testInsert() {
		BoardVO board = new BoardVO();
		board.setName("새로작성하는 이름");
		board.setAge(55);
		board.setAddress("새로작성하는 주소");
		board.setCphone("새로작성하는 전화");
		
		mapper.insert(board);
	}
	
//	@Test
	public void testRead() {
		BoardVO board = mapper.read("최영민");
		
		log.info(board);
		
		System.out.println(board.getAddress());
		System.out.println(board.getAge());
		System.out.println(board.getName());
	
	}
	
	
//	@Test
	public void testDelete()
	{
		log.info("지워졌네용" +  mapper.delete(1));
	}

	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		board.setMid(5);
		board.setName("장동건");
		board.setAddress("제주도");
		board.setAge(40);
		board.setCphone("010-8889-9999");
		
		int count = mapper.update(board);
		log.info("잘 수정했지용" + count);
		
	}
	
}
