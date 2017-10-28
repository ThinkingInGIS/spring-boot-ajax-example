package org.thinkingingis.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import org.thinkingingis.model.User;

@Service
public class UserService {
	private List<User> users;
	
	public List<User> findByUserNameOrEmail(String username){
		List<User> result = users.stream()
				.filter(x -> x.getUsername().equalsIgnoreCase(username))
				.collect(Collectors.toList());
		return result;
	}
	
	//初始化一些user
	@PostConstruct
	private void initDataForTesting() {
		users = new ArrayList<User>();
		User user1 = new User("Thinking", "password111", "thinking@gis.com");
		User user2 = new User("in", "password222", "in@gis.com");
		User user3 = new User("gis", "password333", "gis@gis.com");
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
	}

}
