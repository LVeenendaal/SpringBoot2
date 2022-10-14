package com.promineotech.jeep;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import com.promineotech.ComponentScanMArker;

import org.springframework.boot.SpringApplication;

@SpringBootApplication(scanBasePackageClasses = { ComponentScanMArker.class }, exclude= {DataSourceAutoConfiguration.class})

public class JeepSales {

	public static void main(String[] args) {
		SpringApplication.run(JeepSales.class, args);
	}

}
