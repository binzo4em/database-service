package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DatabaseController {
	
	@Autowired
    private Database database;
	
	@GetMapping(value="/database")
	@ResponseBody
	public ResponseEntity<Object>  database()  {		
		return ResponseEntity.ok(database.toString());
		
	}
}