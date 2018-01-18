package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	
	// 리턴해주는 값이 jsp 페이지의 이름 값이다.
	// Controller 에서 응답하기 위한 메소드가 되기 위해서 
	// 어노테이션을 붙여준다.
	
	@RequestMapping("/view")
	public String view(){
		return "view";
	}
	
	@RequestMapping("/content/contentView")
	public String content(Model model){
		
		model.addAttribute("id", "abcde");
		
		return "content/contentView";
	}
	
	@RequestMapping("/model/modelEx")
	public String modelEx(Model model){
		
		model.addAttribute("data", "abcdefg");
		
		return "/model/modelEx";
	}
	
	@RequestMapping("/modelAndView/modelView")
	public ModelAndView modelAndView(){
		// ModelAndView 를 이용하려고 할 때 따로 파라미터를 받지 않는다.
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", "Model&View");
		mv.setViewName("/modelAndView/modelView");
		
		return mv;
	}
}
