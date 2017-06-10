package com.zlw.mybatis.sevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.zlw.mybatis.bean.Json;
import com.zlw.mybatis.bean.Rusult;
import com.zlw.mybatis.dao.JsonDaoMapper;
import com.zlw.mybatis.utils.JsonMananger;

/**
 * Servlet implementation class DeleteJsonServlet
 */
@WebServlet("/deletejson")
public class DeleteJsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteJsonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("mybatis-config.xml"));
		SqlSession sqlSession = sessionFactory.openSession();
		
		
		
		JsonDaoMapper jsonDaoMapper = sqlSession.getMapper(JsonDaoMapper.class);
		
		
		Rusult<String> rusult = new Rusult<>();
		
		int ros = 123;
		try{
			Json json = new Json(ros);
		
			 jsonDaoMapper.deleteJson(json);
			 
			 rusult.setCode(200);
			 rusult.setMsg("ÇëÇó³É¹¦");
			 rusult.setResult("É¾³ý³É¹¦");
		}catch (Exception e) {
			// TODO: handle exception
			 rusult.setCode(400);
			 rusult.setMsg("ÇëÇóÊ§°Ü");
			 rusult.setResult("É¾³ýÊ§°Ü");
		}{	
		}
		sqlSession.commit();
		response.setContentType("text/json;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println(JsonMananger.beanToJson(rusult));
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
