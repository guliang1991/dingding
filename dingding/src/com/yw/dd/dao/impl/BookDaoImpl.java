package com.yw.dd.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.yw.dd.dao.BookDao;
import com.yw.dd.entity.Book;

@Repository("BookDao")
public class BookDaoImpl implements BookDao {
String SQL_GETBOOKBYCATEGORY="select* from d_book book where book.book_id=";	
	
@Resource(name = "sessionFactory")
private SessionFactory sessionFactory;

public void setSessionFactory(SessionFactory sessionFactory){
	this.sessionFactory=sessionFactory;
	
}

	@Override
	public List<Book> getBookByCategoryId(int id) {
		System.out.println("执行了");
		 Session session = sessionFactory.openSession(); 
		SQLQuery a = session.createSQLQuery(SQL_GETBOOKBYCATEGORY+1);
	    List<Book> books=  a.addEntity(Book.class).list();
		System.out.println("book="+books.get(0).toString());
		
		return books;
	}

}
