package test2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test2
 * get�� post�� ���� �����ϴ� servlet ����
 */
//annotation����  servlet ���� ��θ� ������ �� �ִ�. 7.0����. xml ������ �ּ�ȭ�ϴ� �������� ��ȵ� ��ġ�̴�.
@WebServlet("/Test2") 
public class Test2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html;charset-euc-kr");
	    PrintWriter out=response.getWriter();
	    out.println("<html><body><h1>I'm answering for your get request</h1></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    response.setContentType("text/html;charset-euc-kr");
        PrintWriter out=response.getWriter();
        out.println("<html><body><h1>I'm answering for your post request</h1></body></html>");
	}

}
