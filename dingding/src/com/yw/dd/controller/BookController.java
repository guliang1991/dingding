package com.yw.dd.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yw.dd.service.BookService;

@Controller
@RequestMapping("/main")
public class BookController {
	
     @Resource
	private BookService bookService;
     
     @RequestMapping(value="/qbookByCat",method={RequestMethod.GET})
     @ResponseBody
     public String findByCatId(){
    	 System.out.println("执行了");
    	 bookService.getBookByCategoryId(0);
    	 return "ok";
     }


}
