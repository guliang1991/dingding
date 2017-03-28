package com.yw.dd.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name="d_book")
public class Book  extends Product{
@Id
@Column(name="book_id")
private String bookId;

@Column(name="author")
private String author;

@Column(name="book_name")
private String bookName;

private String publishing;

@Column(name="print_time")
private String printTime;

@Column(name="page_count")
private String pageCount;

@Column(name="word_count")
private String wordCount;







public String getBookId() {
	return bookId;
}
public void setBookId(String bookId) {
	this.bookId = bookId;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public String getBookName() {
	return bookName;
}
public void setBookName(String bookName) {
	this.bookName = bookName;
}
public String getPublishing() {
	return publishing;
}
public void setPublishing(String publishing) {
	this.publishing = publishing;
}
public String getPrintTime() {
	return printTime;
}
public void setPrintTime(String printTime) {
	this.printTime = printTime;
}
public String getPageCount() {
	return pageCount;
}
public void setPageCount(String pageCount) {
	this.pageCount = pageCount;
}
public String getWordCount() {
	return wordCount;
}
public void setWordCount(String wordCount) {
	this.wordCount = wordCount;
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", author=" + author + ", bookName=" + bookName + ", publishing=" + publishing
			+ ", printTime=" + printTime + ", pageCount=" + pageCount + ", wordCount=" + wordCount + "]";
}
	



}
