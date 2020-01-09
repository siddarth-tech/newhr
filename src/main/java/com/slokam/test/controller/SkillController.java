package com.slokam.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.springframework.http.HttpStatus;

import com.slokam.test.entity.Skill;
import com.slokam.test.service.SkillService;

@RestController
@RequestMapping("Skill") 
public class SkillController {
	 @Autowired
	 private SkillService service;
	 


	 @PostMapping("/save") 
	 public ResponseEntity<Skill>	 saveSkill(@RequestBody Skill obj)
	 throws Exception{
		  service.save(obj);
		  return new ResponseEntity<Skill>(obj,HttpStatus.CREATED);
	 }
	
	 @PostMapping("/delete") 
	 public ResponseEntity<Skill>	 deleteSkill(@RequestBody Skill obj)
	 throws Exception{
		  service.remove(obj);
		  return new ResponseEntity<Skill>(obj,HttpStatus.CREATED);
	 }
	 @GetMapping("/all")
	 public ResponseEntity<List<Skill>> getAllSkill(){
		 List<Skill> list = service.getAll();
		 return new ResponseEntity<List<Skill>>(list,HttpStatus.OK);
	 }
	 
	 @GetMapping("/id")
	 public ResponseEntity<Skill> getByIdSkill(Integer id) {
		  Skill obj =  service.getById(id);
		  return new ResponseEntity<Skill>(obj,HttpStatus.OK);
	 }
	 @DeleteMapping("/delete/{id}") 
	 public ResponseEntity<Skill>	 
	 deleteSkill(@PathVariable Integer id)
	 throws Exception{
		  service.remove(id);
		  return new ResponseEntity<Skill>(HttpStatus.OK);
	 }
}

