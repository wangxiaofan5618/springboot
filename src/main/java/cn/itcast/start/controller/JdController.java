package cn.itcast.start.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JdController {
	
	/**
	 * 需求：返回jd首页
	 */
	@RequestMapping("list")
	public String jdList(){
		return "index";
	}

}
