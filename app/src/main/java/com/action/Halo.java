package com.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Levy on 2017/4/28.
 */

@Controller
public class Halo {
    /**
      * 1. 使用RequestMapping注解来映射请求的URL
      * 2. 返回值会通过视图解析器解析为实际的物理视图, 对于InternalResourceViewResolver视图解析器，会做如下解析
      * 通过prefix+returnVal+suffix 这样的方式得到实际的物理视图，然后会转发操作
      * "/WEB-INF/views/success.jsp"
      * @return
      */
     @RequestMapping("/helloWorld")
     public String hello(){
         System.out.println("hello world");
         return "success";
     }
}
