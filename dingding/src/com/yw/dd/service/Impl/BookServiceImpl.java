package com.yw.dd.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yw.dd.dao.BookDao;
import com.yw.dd.entity.Book;
import com.yw.dd.service.BookService;

@Service
public class BookServiceImpl  implements BookService{

@Autowired
BookDao dao;
	
	public List<Book> getBookByCategoryId(int id){
		return dao.getBookByCategoryId(id);
	}	
	
}
