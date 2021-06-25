package microservices.zuul.zuulexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulexampleApplication.class, args);
	}

}
