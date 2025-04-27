package com.sample.DTOsample;

import com.sample.DTOsample.model.Location;
import com.sample.DTOsample.model.User;
import com.sample.DTOsample.repository.LocationRepository;
import com.sample.DTOsample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DtOsampleApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DtOsampleApplication.class, args);
	}

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LocationRepository locationRepository;

	@Override
	public void run(String... args) throws Exception {
		Location location = new Location();
		location.setPlace("Manila");
		location.setDescription("Lively place");
		location.setLatitude(78.4);
		location.setLongitude(59.3);
		locationRepository.save(location);

		User user1 = new User();
		user1.setFirstName("John");
		user1.setLastName("Doe");
		user1.setEmail("JohnDoe@test.com");
		user1.setPassword("secret");
		user1.setLocation(location);
		userRepository.save(user1);

		User user2 = new User();
		user2.setFirstName("Jane");
		user2.setLastName("Doe");
		user2.setEmail("JaneDoe@test.com");
		user2.setPassword("secret");
		user2.setLocation(location);
		userRepository.save(user2);
	}
}
