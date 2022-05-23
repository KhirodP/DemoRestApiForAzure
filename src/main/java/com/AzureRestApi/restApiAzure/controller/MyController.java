package com.AzureRestApi.restApiAzure.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.AzureRestApi.restApiAzure.Model.User;
import com.AzureRestApi.restApiAzure.controller.Repo.UserRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
class UserController {

	@Autowired
	private UserRepository repository;

	@PostMapping("/addUser")
	public Mono<User> addUser(@RequestBody User user) {
		return repository.save(user);
	}

	@GetMapping("/getUsers")
	public Flux<User> getUsers() {
		return  repository.findAll();
	}
	
	@GetMapping("/message")
	public String  getMessage() {
		return  "welcome to Azure deployment";
	}
	
	

}
