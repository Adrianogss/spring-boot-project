package com.adrianosantos.workshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.adrianosantos.workshop.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {

	
	
	
	
	
	
	
	
}
