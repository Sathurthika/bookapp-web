package com.kvcet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.revature.dao.DAObook;
import com.revature.training.Book;

/**
 * Servlet implementation class BookController
 */
@WebServlet("/BookController")
public class BookController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("book_id"));
		String name = request.getParameter("book_name");

		Book book = new Book();
		book.setId(id);
		book.setName(name);

		DAObook dao = new DAObook();
		dao.addbook(book);

		// System.out.println(id + " " + name);
		//
		// request.setAttribute("name", name);
		// request.setAttribute("id", id);

		RequestDispatcher rd = request.getRequestDispatcher("show.jsp");
		rd.forward(request, response);
	}

}
