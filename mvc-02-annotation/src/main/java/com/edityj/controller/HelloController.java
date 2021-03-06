package com.edityj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/v1")
public class HelloController {

  @RequestMapping("/hello")
  public String hello(Model model){
    model.addAttribute("msg", "Hello,annotation!");
    return "hello";
  }
}
