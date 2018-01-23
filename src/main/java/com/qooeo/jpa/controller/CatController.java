package com.qooeo.jpa.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qooeo.jpa.bean.Cat;
import com.qooeo.jpa.service.CatService;


@RestController
@RequestMapping("/cat")
public class CatController {
	
	@Resource
	private CatService catService;
	
	@RequestMapping("/save")
	public String save() {
		Cat cat = new Cat();
		cat.setCatName("jack");
		cat.setCatAge(4);
		catService.save(cat);
		return "ok";
		
	}
	
	@RequestMapping("/delete")
	public String delete() {
		catService.delete(1);
		return "delete ok";
	}
	
	@RequestMapping("/getAll")
	public Iterable<Cat> getAll(){
		return catService.getAll();
	}
	
	@RequestMapping("/findByCatName")
	public Cat findByCatName(String catName) {
		return catService.findByCatName(catName);
		
	}
	
	@RequestMapping("/findByCateName2") 
	public Cat findByCatName2(String catName) {
		return catService.findByCatName2(catName);
	}
	
	@RequestMapping("/selectByCatName")
	public Cat selectByCatName(String catName) {
		return catService.selectByCatName(catName);
	}
}
