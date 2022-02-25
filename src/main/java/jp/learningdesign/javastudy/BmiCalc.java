package jp.learningdesign.javastudy;

import jakarta.servlet.ServletException;
import java.io.PrintWriter;/*テキストの出力をするためのクラス*/
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class BmiCalc
 */
public class BmiCalc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BmiCalc() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=UTF-8"); /*ページを送り返す処理 HTMLを送り返す宣言、文字コードの宣言*/
		PrintWriter out = response.getWriter(); /*responceのgetWriterメソッドの呼び出し*/
		out.println("<html><body>");
		out.println("<h1>こんにちは、サーブレットの世界へようこそ！");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String height_in,weight_in;
		double height, weight, bmi;
		height_in = request.getParameter("height1");
		weight_in = request.getParameter("weight1");
		height = Double.parseDouble(height_in);
		weight = Double.parseDouble(weight_in);
		height /= 100;
		bmi = weight /(height * height);
		
		out.println("<html><body>");
		out.println("あなたのBMI、体格指数は、" + bmi + "です。");	
		
	}

}
