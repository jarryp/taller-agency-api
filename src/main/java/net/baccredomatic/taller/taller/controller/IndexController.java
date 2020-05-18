package net.baccredomatic.taller.taller.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import net.baccredomatic.taller.taller.service.AgencyService;

@Controller
public class IndexController {
	
	@Autowired private AgencyService agencyService;
	
	@GetMapping({"/index","/","/home"})
	public String index(Model model) {
		return "index";
	}
	
}
