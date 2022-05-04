package com.sadatmalik.fusiongateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Bootstrap class starts a Fusion Api Gateway enabled as a eureka client.
 *
 * Using Spring Cloud Gateway with Eureka means we have the standard gateway a single endpoint
 * through which we can make calls, and also we can add and remove instances of a service without
 * ever having to modify the gateway. For instance, we can add a new service to Eureka, and the
 * gateway automatically routes calls to it because it’s communicating with Eureka about where the
 * actual physical service endpoints are located.
 *
 * @author sadatmalik
 */
@SpringBootApplication
@EnableEurekaClient
public class FusionGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(FusionGatewayApplication.class, args);
	}

}
