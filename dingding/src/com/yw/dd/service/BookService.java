package com.yw.dd.service;

import java.util.List;

import com.yw.dd.entity.Book;

public interface BookService {
	List<Book> getBookByCategoryId(int id);

}
