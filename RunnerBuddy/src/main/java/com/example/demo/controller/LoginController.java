package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Refferral;
import com.example.demo.repository.ReffRepository;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@CrossOrigin(origins = "http://localhost:4200")
public class LoginController {
	
	@Autowired
	public ReffRepository reffRepository;

	@GetMapping(value="/getRef")
	List<Refferral> login(){
		System.out.println(reffRepository.findAll().get(0).getName());
		return reffRepository.findAll();
	}
	
}
