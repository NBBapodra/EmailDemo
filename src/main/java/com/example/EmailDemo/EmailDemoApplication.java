package com.example.EmailDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class EmailDemoApplication {

	@Autowired
	private EmailSenderService emailSenderService;

	public static void main(String[] args) {
		SpringApplication.run(EmailDemoApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public  void  sendMail()
	{
	emailSenderService.sendSimpleEmail("bharatb.urteqi@gmail.com",
				"This is email body",
				"Hiii bharat hoe are you?");

	}
}
