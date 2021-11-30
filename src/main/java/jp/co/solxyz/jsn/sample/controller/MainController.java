package jp.co.solxyz.jsn.sample.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jp.co.solxyz.jsn.sample.dto.BooksDto;
import jp.co.solxyz.jsn.sample.service.BooksService;

@Controller
public class MainController {
	@Autowired
	BooksService booksservice;

	//外部API利用結果画面
	@RequestMapping("/booklist")
	public String booklist(Model model) {
		BooksDto [] books = booksservice.getBooks();
		model.addAttribute("books",Arrays.asList(books));
		return "books";
	}

	//API呼び出し
	@RequestMapping("/books")
	public String books() {
		return "books";
	}
}
