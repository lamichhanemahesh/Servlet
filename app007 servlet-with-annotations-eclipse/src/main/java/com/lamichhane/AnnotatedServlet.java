package com.lamichhane;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
		name="AnnotatedServlet",
		urlPatterns = { "/welcome" }, 
		loadOnStartup = 1,
		initParams = { 
				@WebInitParam(name = "a", value = "AAA"), 
				@WebInitParam(name = "b", value = "BBB")
		}
		)
public class AnnotatedServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	static {
		System.out.println("Servlet Loading");
	}
       
    public AnnotatedServlet() {
        System.out.println("Servlet Instantiation");
    }
    
    

	@Override
	public void init() throws ServletException {
		System.out.println("Servlet Initialization");
	}



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Request Processing");
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<h2>Context Param1="+getServletConfig().getInitParameter("a"));
		out.print("<h2>Context Param2="+getServletConfig().getInitParameter("b"));
	}



	@Override
	public void destroy() {
		System.out.println("Servlet Deinstantiation");
	}
	
	




}
