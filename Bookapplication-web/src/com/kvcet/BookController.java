package com.kvcet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sathurthika.bookapp.dao.BookDAO;
import com.sathurthika.bookapp.model.Book;

@WebServlet("/BookController")
public class BookController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String name = request.getParameter("book_name");
		Float price = Float.parseFloat(request.getParameter("book_price"));

		Book book = new Book();
		book.setName(name);
		book.setPrice(price);

		BookDAO dao = new BookDAO();
		dao.save(book);

		List<Book> books = dao.findAll();

		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		request.setAttribute("books", books);
		rd.forward(request, response);
	}

}
