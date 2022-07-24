package com.stackroute.wipro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.stackroute.wipro.model.User;

@Repository
@Transactional
public interface UserDAO extends JpaRepository<User,String>{
	User findByEmail(String email);
	User findByEmailAndPassword(String email, String password);

}
