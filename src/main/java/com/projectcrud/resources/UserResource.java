package com.projectcrud.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projectcrud.entities.User;

@RestController //para definir como aplicação web q é implementado por  rest controller.
@RequestMapping(value = "/users") //para definir o caminho do endpoint
public class UserResource {
	
	@GetMapping //pra indicar q o método vai responder requisição do tipo get do http
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maique", "maiqued.18@gmail.com", "51983518820", "12345");
		return ResponseEntity.ok().body(u);
	}
}
