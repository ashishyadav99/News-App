
package com.stackroute.wipro.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.stackroute.wipro.model.User;

public interface UserDAO extends MongoRepository<User, String> {
	public User findByEmail(String email);
}
