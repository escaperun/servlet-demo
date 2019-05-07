package com.xyb.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @author luyang
 * @ClassName ServletConfig
 * @description 〈功能详细描述〉
 * @time 2019/5/713:00
 * @modificationHistory <记录修改历史记录 who where what>
 */
public class ServletConfigDemo extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ServletConfig config = getServletConfig();
        String username = config.getInitParameter("username");
        String password = config.getInitParameter("password");
        Enumeration<String> enumerations = config.getInitParameterNames();
        while (enumerations.hasMoreElements()){
            String param = enumerations.nextElement();
            String value = config.getInitParameter(param);
            System.out.println(param+"::"+value);
            resp.getWriter().println(param + "::" + value);
        }
        System.out.println(username);
        System.out.println(password);
        resp.getWriter().println(username);
        resp.getWriter().println(password);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
