package com.gimenesjhonathan.aulaspring4AWSS3.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gimenesjhonathan.aulaspring4AWSS3.services.S3Service;

@RestController
@RequestMapping(value = "/picture")
public class PictureResource {
	
	@Autowired
	private S3Service s3Service;
	
	@PostMapping
	public ResponseEntity<Void> insert(@RequestParam(name="file") MultipartFile file) {
		URI uri = s3Service.uploadFile(file);
		return ResponseEntity.created(uri).build();
	}
}
