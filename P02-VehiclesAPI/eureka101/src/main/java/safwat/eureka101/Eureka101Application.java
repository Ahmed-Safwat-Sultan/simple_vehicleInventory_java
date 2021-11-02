package safwat.eureka101;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Eureka101Application {

	public static void main(String[] args) {
		SpringApplication.run(Eureka101Application.class, args);
	}

}
