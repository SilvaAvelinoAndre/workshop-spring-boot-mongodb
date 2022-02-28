package com.aastechnology.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aastechnology.workshopmongo.domain.Post;
import com.aastechnology.workshopmongo.repository.PostRepository;
import com.aastechnology.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired // injeção de dependencia
	private PostRepository repo;

	

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}


}
