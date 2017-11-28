package org.servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SignInservelet
 */
@WebServlet("/signinservelet")
public class SignInservelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignInservelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		try(PrintWriter out=response.getWriter())
		{
			String firstName=request.getParameter("FirstName");
			String lastName=request.getParameter("LastName");
			String rollNo=request.getParameter("RollNo");
			String emailId=request.getParameter("EmailId");
			String phoneNo=request.getParameter("PhoneNo");
			String userName=request.getParameter("UserName");
			String passWord=request.getParameter("PassWord");
			System.out.println("firstName");
			System.out.println("lastName");
			System.out.println("rollNo");
			System.out.println("emailId");
			System.out.println("phoneNo");
			System.out.println("userName");
			System.out.println("passWord");
			if(firstName!=null&&lastName!=null&&rollNo!=null&&emailId!=null&&phoneNo!=null&&userName!=null&&passWord!=null)
			{
				
				out.println("SIGN IN SUCCESS");
				
			}
			else
			{
				out.println("REQUIRED FIELD IS NEEDED TO SIGNIN");
			}
					
		}
	}

}
