package test.spring_boot_helloworld_time;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
@ComponentScan(basePackages = "test.spring_boot_helloworld_time")
public class Application {

	@RequestMapping("/")
	public String testConfiguration() {
		Date d = new Date();
		return String.format("Hello world %s", d.toString());
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
