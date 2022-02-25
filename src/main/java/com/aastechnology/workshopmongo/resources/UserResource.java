package com.aastechnology.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.aastechnology.workshopmongo.domain.User;

@RestController
@RequestMapping(value ="/users")
public class UserResource {
	
	@RequestMapping(method= RequestMethod.GET)// anotation avisa que os dados deste metodo seram trazidos para o Rest atraves do GET. 
	// também funciona com a aanotation @GetMapping
	
	
	
	public ResponseEntity<List<User>> findAll(){
		User maria = new User("1", "Maria Brown", "maria@gmail.com");
		User alex = new User("2", "Alex Green", "alex@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(maria, alex));
		return ResponseEntity.ok().body(list);
	}
	
	

}
