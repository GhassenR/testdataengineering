package tn.test.data.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.test.data.entities.Environnement;
import tn.test.data.services.IEnvironnementService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/environnement")
public class EnvironnementController {
	
	@Autowired
	IEnvironnementService env;
	
	
	@GetMapping("/getAllEnvironnement")
	@ResponseBody
	public List<Environnement> getAll() {
	List<Environnement> list = env.retrieveAllEnvironnements();
	return list;
	}
	
	@PostMapping("/addEnvironnement")
	@ResponseBody
	public Environnement addEnvironnement(@RequestBody Environnement e )
	{
		return env.addEnvironnement(e);
	
	}

}
