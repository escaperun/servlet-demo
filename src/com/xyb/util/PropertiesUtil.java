package com.xyb.util;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Properties;

/**
 * @author luyang
 * @ClassName PropertiesUtil
 * @description 〈功能详细描述〉
 * @time 2019/5/711:18
 * @modificationHistory <记录修改历史记录 who where what>
 */
public class PropertiesUtil extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Properties pro = new Properties();
        ServletContext servletContext = getServletContext();
        String realPath = servletContext.getRealPath("/WEB-INF/db.properties");
        File file = new File(realPath);
        InputStream inputStream = new FileInputStream(file);
        pro.load(inputStream);
        String url = pro.getProperty("url");
        System.out.println(url);
        resp.getOutputStream().print(url);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req,resp);
    }
}
