package net.esilva.helloboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;

// convenience annotation, which "groups" many of the classic Spring frameworks
// annotations, namely: @Configuration, @EnableAutoConfiguration, @EnableMvc
// (in case spring-webmvc is on the class path), @ComponentScan (which will
// automatically scan for other components, configurations and services on the
// package)
@SpringBootApplication
public class HelloBootApplication {

    // main method, which will run the generated java application (.jar)
    public static void main(String[] args) {
        SpringApplication.run(HelloBootApplication.class, args);
    }

    // provides overview on the different beans that are automatically handled by Spring Boot
    // - this is the major advantage of using Spring Boot
	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {

			System.out.println("Let's inspect the beans provided by Spring Boot:");

			String[] beanNames = ctx.getBeanDefinitionNames();
			Arrays.sort(beanNames);
			for (String beanName : beanNames) {
				System.out.println(beanName);
			}

		};
	}
}
