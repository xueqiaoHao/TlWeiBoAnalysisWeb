package com.hao.Controller;
/**
* @author Griezmann
* @date 2018年10月9日 
* 当访问http://localhost:8080/时候，
* 进入到该方法中 并将返回的内容作为字符串直接返回给浏览嚣
*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
@EnableAutoConfiguration
public class DemoController{
/* 当访问http://localhost:8080/时候，
* 进入到该方法中 并将返回的内容作为字符串直接返回给浏览嚣*/
	@RequestMapping("/")
	@ResponseBody
	String index(){
		return "安托万格里兹曼";
	}
	@RequestMapping("/weibo")
	String weibo(){
		return "weibo";
	}
//	静态填充
	@RequestMapping("/dynamic")
	String dynamic(ModelMap map){
		map.put("nickname", "Griezmann");
		return "dynamic";
	}
//	动态填充
	@RequestMapping("/dynamic_v2")
	String dynamic(ModelMap map,String nickname){
		map.put("nickname", nickname);
		return "dynamic";
	}
	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoController.class, args);
	}
	
}
