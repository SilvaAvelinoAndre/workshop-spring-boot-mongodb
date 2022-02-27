package com.aastechnology.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aastechnology.workshopmongo.domain.User;
import com.aastechnology.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired // injeção de dependencia - instanciação automatica do UserRepository dentro do serviço
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
		
	}

}
