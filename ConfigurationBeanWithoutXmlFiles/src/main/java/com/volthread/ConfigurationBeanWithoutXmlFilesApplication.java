package com.volthread;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationBeanWithoutXmlFilesApplication {

	public static void main(String[] args) {

	
		 ApplicationContext context = new AnnotationConfigApplicationContext(PringMessagesConfig.class);
		   
		 	PrintMessages printMessage=context.getBean(PrintMessages.class);
		 			printMessage.setMessage("Mehmet Veysel Işıktaş");
		 			printMessage.getMessage();
		     
		   }		
	}


