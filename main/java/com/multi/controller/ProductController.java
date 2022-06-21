package com.multi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {

	@RequestMapping("add")
	public String add(Model m) {
		m.addAttribute("center","product/add");
		return "index";
	}
	
	@RequestMapping("select")
	public String select(Model m) {
		m.addAttribute("center","product/select");
		return "index";
	}
	
	@RequestMapping("catemain")
	public String catemain(Model m) {
		m.addAttribute("center","product/catemain");
		return "index";
	}
	
	
}