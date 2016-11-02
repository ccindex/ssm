package com.up.ssm.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.up.ssm.BaseTest;
import com.up.ssm.dto.AppointExecution;
import com.up.ssm.service.BookService;

public class BookServiceImplTest extends BaseTest {

	@Autowired
	private BookService bookService;

	@Test
	public void testAppoint() throws Exception {
		long bookId = 1002;
		long studentId = 12345678910L;
		AppointExecution execution = bookService.appoint(bookId, studentId);
		System.out.println(execution);
	}

}
