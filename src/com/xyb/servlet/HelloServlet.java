package com.xyb.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author luyang
 * @ClassName HelloServlet
 * @description 〈功能详细描述〉
 * @time 2019/5/710:20
 * @modificationHistory <记录修改历史记录 who where what>
 */
public class HelloServlet extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().print("Hello Servlet!");
        System.out.println("Hello Servlet!");
    }
}
