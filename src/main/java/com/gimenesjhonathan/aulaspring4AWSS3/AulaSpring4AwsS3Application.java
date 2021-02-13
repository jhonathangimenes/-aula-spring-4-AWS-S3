package com.gimenesjhonathan.aulaspring4AWSS3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.gimenesjhonathan.aulaspring4AWSS3.services.S3Service;

@SpringBootApplication
public class AulaSpring4AwsS3Application implements CommandLineRunner {

	@Autowired
	private S3Service s3Service;
	
	public static void main(String[] args) {
		SpringApplication.run(AulaSpring4AwsS3Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\Users\\Jhonathan\\Downloads\\naruto.jpg");
	}

}
