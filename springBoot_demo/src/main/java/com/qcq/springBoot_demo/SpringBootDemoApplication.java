package com.qcq.springBoot_demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.qcq.springBoot_demo.mapper")
public class SpringBootDemoApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
			SpringApplication.run(SpringBootDemoApplication.class, args);
	}
}
