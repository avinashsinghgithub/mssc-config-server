package guru.sfg.brewery.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MsscConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscConfigServerApplication.class, args);
	}

}
//https://www.udemy.com/course/spring-boot-microservices-with-spring-cloud-beginner-to-guru/learn/lecture/18588296#overview