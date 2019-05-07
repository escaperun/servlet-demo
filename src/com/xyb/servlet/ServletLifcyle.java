package com.xyb.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

/**
 * @author luyang
 * @ClassName ServletLifcyle
 * @description 〈功能详细描述〉
 * @time 2019/5/710:48
 * @modificationHistory <记录修改历史记录 who where what>
 */
public class ServletLifcyle extends GenericServlet {


    @Override
    public void init() throws ServletException {
        System.out.println("==============init================");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("===============service==============");
    }

    @Override
    public void destroy() {
        System.out.println("============destory============");
    }
}
