package com.hz.web;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Jack on 2017/5/18.
 */
@Controller
@EnableAutoConfiguration
public class HelloController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

//    @RequestMapping("/session")
//    public void session(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        String attributeName = req.getParameter("attributeName");
//        String attributeValue = req.getParameter("attributeValue");
//        req.getSession().setAttribute(attributeName, attributeValue);
//        resp.sendRedirect(req.getContextPath() + "/");
//    }
}
