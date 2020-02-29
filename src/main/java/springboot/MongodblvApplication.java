package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;

@SpringBootApplication
public class MongodblvApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodblvApplication.class, args);
	}

}
