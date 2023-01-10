package com.self.test.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(value = {SpringConstants.PACKAGE_BASE})
@PropertySources(@PropertySource(value = "file:self-experiment.properties"))
public class AppConfig {

}
