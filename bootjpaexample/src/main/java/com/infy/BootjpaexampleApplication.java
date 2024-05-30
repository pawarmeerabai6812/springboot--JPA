package com.infy;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.infy.Entity.User;
import com.infy.dao.UserRepository;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);

		UserRepository userRepository = context.getBean(UserRepository.class);

		User user=new User();
		user.setName("Meera Pawar");
		 user.setCity("Latur");
		 user.setStatus("I am a Java Programmer");
		User user1=userRepository.save(user);
		System.out.println(user1);

		// create object of user
		/*
		 * User user2=new User(); user2.setName("jana"); user2.setCity("udatpur");
		 * user2.setStatus("python Programmer");
		 * 
		 * 
		 * 
		 * User user3=new User(); user3.setName("sambhaji"); user3.setCity("udatpur");
		 * user3.setStatus("C++ Programmer");
		 */

		// Saving Single User
		// User result=userRepository.save(user2);
		// System.out.println("saved user"+result);
		// System.out.println("Done");

		// Saving All user//multiple object Method for this
		// List<User> users =List.of(user3,user2);

		// Iterable<User> result=userRepository.saveAll(users);

		// result.forEach(User->{
		// System.out.println(User);

		// });

		// System.out.println("Done");

		/*
		 * //Update the userid 502
		 * 
		 * Optional<User> optional=userRepository.findById(502); User user=
		 * optional.get(); user.setCity("Osmanabad"); User
		 * result=userRepository.save(user); System.out.println(result);
		 * 
		 */
		// Deleting the User
		//userRepository.deleteById(502);
		 //System.out.println("Deleted");
		 
		 //deleteing all user
		//Iterable<User> allusers=userRepository.findAll();
		//allusers.forEach(user->System.out.println(user));
		//userRepository.deleteAll(allusers);
		
		
		///Using Query annotion Getting All User Data 
		 List<User> alluser=userRepository.getAllUser();

		 alluser.forEach(e->{

		System.out.println(e);
		});
		System.out.println("____________________________________________________________________________");
		
		 //providing User name throw query
		List<User> UserByName = userRepository.getUserByName("Meera Pawar");

		UserByName.forEach(f -> {
		System.out.println(f);
	});
		
		
		System.out.println("_______________________");
		userRepository.getUsers().forEach(e-> System.out.println(e));
		

	}

}
