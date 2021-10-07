package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Book;

@Service
public class BookService {
	
	@Autowired
	private Book book;
	
	public Book getBookById(int id) {
		book.setBookId(201);
		book.setBookName("Head First Java");
		book.setAuthor("Kathy Sierra");
		if(id ==1){
			book.setBookId(202);
			book.setBookName("Effective Java");
			book.setAuthor("Bruce Erickel");
		}
		return this.book;
	}
	
	
	

}
