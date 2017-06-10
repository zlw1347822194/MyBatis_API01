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
 * Servlet implementation class UpdateJsonServlet
 */
@WebServlet("/updatejson")
public class UpdateJsonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateJsonServlet() {
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
		
		
		try{
			
			Json json = new Json(1,"zhang","M".equals("M")?"男":"女",19);
				
			
			 jsonDaoMapper.updateJson(json);
			 
			 rusult.setCode(200);
			 rusult.setMsg("请求成功");
			 rusult.setResult("更新成功");
		}catch (Exception e) {
			// TODO: handle exception
			 rusult.setCode(400);
			 rusult.setMsg("请求失败");
			 rusult.setResult("更新失败");
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
