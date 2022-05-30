package com.workshopmongodb.course.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.workshopmongodb.course.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity<List<User>> findAll() {
		User user1 = new User("1", "jose", "jose@outlook.com");
		User user2 = new User("2", "jose", "jose@outlook.com");
		User user3 = new User("3", "jose", "jose@outlook.com");
		
		List<User> list = new ArrayList<>();
		list.add(user1);
		list.add(user2);
		list.add(user3);
		
		return ResponseEntity.ok().body(list);
	}
}