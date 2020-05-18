package net.baccredomatic.taller.taller.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import net.baccredomatic.taller.taller.models.entity.Agency;
import net.baccredomatic.taller.taller.service.AgencyService;

@RestController
@RequestMapping(value="rest",produces = "application/json")
public class AgencyController {
	
	@Autowired AgencyService service;
	
	@GetMapping("/saludo")
	public String saludo() {
		return "Hola Mundo!";
	}
	
	@GetMapping("/agency/all")
	@ResponseBody
	public List<Agency> all() {
		return service.findAll();
	}
	
	@GetMapping("/agency/{name}")
	@ResponseBody
	public Agency getAgencyByName(@PathVariable String name) {
		return service.findByAgencyName(name);
	}
	
	@GetMapping("/agency/byname")
	@ResponseBody
	public Agency getAgencyByName2(@RequestParam("name") String name) {
		return service.obtenerPorNombreAgencia(name);
	}
	
	@PostMapping("/agency/add")
	public void add(@RequestBody Agency agency) {
		service.save(agency);
	}

}
