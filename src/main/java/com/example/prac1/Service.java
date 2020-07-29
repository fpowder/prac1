package com.example.prac1;

import com.example.prac1.dto.Book;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
public class Service {

    @RequestMapping(value="/")
    public String index(Model model){


        return "main";
    }

    @RequestMapping(value="/books", method= RequestMethod.GET)
    public @ResponseBody Map<String, Book> getBooks(){
        Book book = new Book();
        book.setAuthor("jojoo");
        book.setId(1);
        book.setName("jesus");

        Map<String, Book> result = new HashMap<String, Book>();
        result.put("books", book);


        return result;
    }

}
