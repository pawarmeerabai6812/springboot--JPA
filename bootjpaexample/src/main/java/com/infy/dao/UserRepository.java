package com.infy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.infy.Entity.User;

public interface UserRepository extends CrudRepository<User,Integer>{

	@Query("select u from User u")
	public List<User> getAllUser();
	
	
	@Query("select u from User u where u.name =:n")
	public List<User>getUserByName(@Param("n")String name);
	
	@Query(value= "select * from user", nativeQuery = true)
	public List<User> getUsers();
}

