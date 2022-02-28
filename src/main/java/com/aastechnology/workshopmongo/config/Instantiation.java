package com.aastechnology.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

<<<<<<< HEAD
import com.aastechnology.workshopmongo.DTO.AuthorDTO;
import com.aastechnology.workshopmongo.domain.Post;
=======
>>>>>>> parent of 1a5be9e (Criando entity Post com User aninhado)
import com.aastechnology.workshopmongo.domain.User;
import com.aastechnology.workshopmongo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	
	
	@Override
	public void run(String... args) throws Exception {
		userRepository.deleteAll();
		
		User maria = new User(null, "Maria Brown", "maria@gmail.com");
		User alex = new User(null, "Alex Green", "alex@gmail.com");
		User bob = new User(null, "Bob Grey", "bob@gmail.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
<<<<<<< HEAD
		
		
		Post post1 = new Post(null,  sdf.parse("23/03/2018"), "Partiu viagem", "Vou viajar para São Paulo, Abraços!", new AuthorDTO(maria));
		Post post2 = new Post(null,  sdf.parse("23/03/2018"), "Bom dia", "Acordei feliz hoje!",new AuthorDTO(maria));
		
		
		postRepository.saveAll(Arrays.asList(post1, post2));
=======
>>>>>>> parent of 1a5be9e (Criando entity Post com User aninhado)
		
		maria.getPosts().addAll(Arrays.asList(post1, post2));
		userRepository.save(maria);
		
	}

}
