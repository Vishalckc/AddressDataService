package com.example.addressDataService.config;

import com.example.addressDataService.controller.AddressDataServiceController;
import com.example.addressDataService.service.AddressDataService;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*@EnableJpaRepositories("com.example.addressDataService.dao")*/
@EntityScan("com.example.addressDataService.model")
@Configuration
@ComponentScan(basePackageClasses = {AddressDataService.class, AddressDataServiceController.class})
@ComponentScan(basePackages = {"com.example.addressDataService.service"})
public class AppConfig {

}