package com.xyb.servlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author luyang
 * @ClassName ServletContextDemo2
 * @description 〈功能详细描述〉
 * @time 2019/5/715:46
 * @modificationHistory <记录修改历史记录 who where what>
 */
public class ServletContextDemo2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletContext context = getServletContext();
        int count = (int)context.getAttribute("count");
        resp.getWriter().print("===after==="+ ++count);
        context.setAttribute("count",count++);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
