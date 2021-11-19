package mypkg;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO ellenorizni, hogy a parameterek leteznek-e, vagy sem, valamint, azt, hogy szamok-e
		int a = Integer.parseInt((String) request.getParameter("numa"));
		int b = Integer.parseInt((String) request.getParameter("numb"));
		String op = (String) request.getParameter("op");
		
		String responseStr;
		
		try {
			responseStr = Integer.toString(CalculatorService.doMath(a, b, op));
		} catch (ArithmeticException e) {
			responseStr = "Nem tudok nullaval osztani :(";
		}
		
		response.getWriter().append(responseStr);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
