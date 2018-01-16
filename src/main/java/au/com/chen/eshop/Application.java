package au.com.chen.eshop;

import au.com.chen.eshop.model.Product;
import au.com.chen.eshop.service.ProductService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.Arrays;

@SpringBootApplication
@EnableJpaRepositories(basePackages="au.com.chen.eshop")
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
//        return args -> {
//
//            System.out.println("Let's inspect the beans provided by Spring Boot:");
//
//            String[] beanNames = ctx.getBeanDefinitionNames();
//            Arrays.sort(beanNames);
//            for (String beanName : beanNames) {
//                System.out.println(beanName);
//            }
//
//        };
//    }

//    @Bean
//    public CommandLineRunner demo(ProductService repository) {
//        return (args) -> {
//            // save a couple of customers
//            repository.save(new Product("Jack", 12D));
//            repository.save(new Product("Chloe", 234D));
//
//            // fetch all customers
//            log.info("Products found with findAll():");
//            log.info("-------------------------------");
//            for (Product customer : repository.findAll()) {
//                log.info(customer.toString());
//            }
//            log.info("");
//
//            // fetch an individual customer by ID
//            Product customer = repository.findOne(1L);
//            log.info("Product found with findOne(1L):");
//            log.info("--------------------------------");
//            log.info(customer.toString());
//            log.info("");
//
//            // fetch customers by last name
//            log.info("Product found with findByLastName('Bauer'):");
//            log.info("--------------------------------------------");
//            for (Product bauer : repository.findByName("Bauer")) {
//                log.info(bauer.toString());
//            }
//            log.info("");
//        };
//    }
}
