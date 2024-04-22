package com.tubanurbalci.demoSchoolAdmin;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class DemoSchoolAdminApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSchoolAdminApplication.class, args);
	}

}
