package controller;


import helper.RegisterQuery;
import helper.UserHelper;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pojos.User;
import utilities.PasswordService;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet(
		description = "Servlet used to register new users", 
		urlPatterns = { 
				"/RegisterServlet", 
				"/Register"
		})
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HttpSession session; 
	private String url;
	private int loginAttempts;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//get our current session
				session = request.getSession();
				//pull the fields from the form for user Column
				String username = request.getParameter("username");
				String password = request.getParameter("password");
				
				//encrypt the password to check against what's stored in DB
				PasswordService pws = new PasswordService();
				String encryptedPass = pws.encrypt(password);
				
				// insert info in user table
				RegisterQuery rq = new RegisterQuery("FoodBam", "root", "");
				rq.addUser(username,encryptedPass);
				
				//read database to get userID
				
				int userID = rq.readUserID();
				
				//pull the fields from the form pertaining to Customer column
				String firstName = request.getParameter("firstName");
				String lastName = request.getParameter("lastName");
				String email = request.getParameter("email");
				//insert info into customer
				rq.addCustomer(firstName,lastName,email,userID);
				
				//success message
				String msg = "Successfull Registration! Please log in below.";
				
				// pass on back to index for login
			    String url = "index.jsp";
			    
			    request.setAttribute("msg", msg);
			    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
			    dispatcher.forward(request, response);					
				
			
	}
}


