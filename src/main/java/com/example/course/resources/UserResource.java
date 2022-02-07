package com.example.course.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.course.entities.User;
import com.example.course.services.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@Autowired
	UserService userService;
	
	//responde a uma requisicao Get
	@GetMapping  
	public ResponseEntity<List<User>> findAll(){
		List <User> list= userService.findAll();
		// retorno , status, body da response
		return ResponseEntity.ok().body(list);
	}
	
	//a requisicao vai mandar um parametro
	@GetMapping (value = "/{id}")
	public ResponseEntity <User> findById(@PathVariable Long id){
		User user = userService.findById(id); 
		return ResponseEntity.ok().body(user);
	}
	
	
}
