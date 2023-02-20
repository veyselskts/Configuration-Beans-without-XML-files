package com.volthread;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PringMessagesConfig {
	@Bean
	 public PrintMessages printMessage(){
	      return new PrintMessages();
	   }
}

