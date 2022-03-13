package sidecare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class SidecareApplication {

	public static void main(String[] args) {
		SpringApplication.run(SidecareApplication.class, args);
	}

}
