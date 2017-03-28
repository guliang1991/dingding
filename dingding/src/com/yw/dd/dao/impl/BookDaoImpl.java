package com.yw.dd.dao.impl;

import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.yw.dd.dao.BookDao;
import com.yw.dd.entity.Book;

@Repository("BookDao")
public class BookDaoImpl implements BookDao {
String SQL_GETBOOKBYCATEGORY="from d_book where d_book.id";	
	
@Resource(name = "sessionFactory")
private SessionFactory sessionFactory;

public void setSessionFactory(SessionFactory sessionFactory){
	this.sessionFactory=sessionFactory;
	
}

	@Override
	public List<Book> getBookByCategoryId(int id) {
		System.out.println("执行了");
		 Session session = sessionFactory.openSession(); 
		 Book student = (Book) session.get(Book.class, "1");  
		//Query query = session.createQuery(SQL_GETBOOKBYCATEGORY);
		//query.setString(0, "1");
		System.out.println(student.toString());
		
		return null;
	}

}
