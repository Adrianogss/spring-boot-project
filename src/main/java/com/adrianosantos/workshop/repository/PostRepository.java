package com.adrianosantos.workshop.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.adrianosantos.workshop.domain.Post;

@Repository
public interface PostRepository extends MongoRepository<Post, String> {

	
	
	
	
	
	
	
	
}
