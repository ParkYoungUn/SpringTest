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
		board.setName("�����ۼ��ϴ� �̸�");
		board.setAge(55);
		board.setAddress("�����ۼ��ϴ� �ּ�");
		board.setCphone("�����ۼ��ϴ� ��ȭ");
		
		mapper.insert(board);
	}
	
//	@Test
	public void testRead() {
		BoardVO board = mapper.read("�ֿ���");
		
		log.info(board);
		
		System.out.println(board.getAddress());
		System.out.println(board.getAge());
		System.out.println(board.getName());
	
	}
	
	
//	@Test
	public void testDelete()
	{
		log.info("�������׿�" +  mapper.delete(1));
	}

	@Test
	public void testUpdate() {
		BoardVO board = new BoardVO();
		board.setMid(5);
		board.setName("�嵿��");
		board.setAddress("���ֵ�");
		board.setAge(40);
		board.setCphone("010-8889-9999");
		
		int count = mapper.update(board);
		log.info("�� ����������" + count);
		
	}
	
}
