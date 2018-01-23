package com.qooeo.jpa.service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.qooeo.jpa.bean.Cat;
import com.qooeo.jpa.dao.CatDao;
import com.qooeo.jpa.repository.CatRepository;
import com.qooeo.jpa.repository.Cat2Repository;

@Service
public class CatService {
	@Resource
	private CatRepository catRepository;
	
	@Resource
	private Cat2Repository cat2Repository;
	
	@Resource
	private CatDao catDao; 
	
	@Transactional
	public void save(Cat cat) {
		catRepository.save(cat);
	}
	
	@Transactional
	public void delete(int id) {
		catRepository.delete(id);
	}
	
	@Transactional
	public Iterable<Cat> getAll(){
		return catRepository.findAll();
	}
	
	public Cat findByCatName(String catName) {
		return null;
	}
	
	public Cat findByCatName2(String catName) {
		return null;
	}
	
	public Cat selectByCatName(String catName) {
		return catDao.selectByCatName(catName);
	} 
	
	
}
