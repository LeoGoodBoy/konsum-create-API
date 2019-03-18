package com.imi.dolphin.sdkwebservice;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.imi.dolphin.sdkwebservice"})
public class SdkWebserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SdkWebserviceApplication.class, args);
	}
}
