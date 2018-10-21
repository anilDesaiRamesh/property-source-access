package com.anil.property;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.anil.property.bean.PropertyBean;

@SpringBootApplication
public class PropertySourceAccessApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(PropertySourceAccessApplication.class, args);
		PropertyBean bean = run.getBean(PropertyBean.class);
		System.out.println(bean);
	}
}
