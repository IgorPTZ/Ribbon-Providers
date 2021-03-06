package lab.five.client.verb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Lab5VerbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Lab5VerbApplication.class, args);
	}

}
