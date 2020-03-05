package com.example.addressDataService;

import com.example.addressDataService.config.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@ComponentScan(basePackageClasses = {AppConfig.class})
@SpringBootApplication
public class AddressDataServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AddressDataServiceApplication.class, args);
	}

}
