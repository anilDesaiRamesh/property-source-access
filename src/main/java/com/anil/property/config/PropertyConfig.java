/**
 * 
 */
package com.anil.property.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.anil.property.bean.PropertyBean;

/**
 * @author Anil_Ramesh
 *
 */
@Configuration
@PropertySource("classpath:datasource.properties")
public class PropertyConfig {

	@Value("${anil.username}")
	private String user;
	@Value("${anil.password}")
	private String password;
	@Value("${anil.url}")
	private String url;

	@Bean
	public PropertyBean getDataSources() {
		PropertyBean bean = new PropertyBean();
		bean.setUser(user);
		bean.setPassword(password);
		bean.setUrl(url);
		return bean;
	}

	@Bean
	public static PropertySourcesPlaceholderConfigurer properties() {
		PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
		return propertySourcesPlaceholderConfigurer;
	}

}
