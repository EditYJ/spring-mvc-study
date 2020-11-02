package com.edityj.controller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloController implements Controller {

  public ModelAndView handleRequest(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws Exception {
    // ModelAndView 模型和视图
    final ModelAndView mv = new ModelAndView();

    // 封装对象
    mv.addObject("msg", "HelloMvc, 你好哇！");
    // 返回视图
    mv.setViewName("hello");

    return mv;
  }
}
