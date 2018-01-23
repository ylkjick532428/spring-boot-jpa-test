package com.qooeo.jpa.dao;

import javax.annotation.Resource;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.qooeo.jpa.bean.Cat;

@Repository
public class CatDao {
	
	@Resource
	private JdbcTemplate jdbcTemplate;
	
	public Cat selectByCatName(String catName) {
//		1. define a sql
//		2. define a RowMapper object
//		3. excute query func
		String sql = "select * from cat where cat_name=?";
		RowMapper<Cat> rowMapper = new BeanPropertyRowMapper<>(Cat.class);
		Cat cat = jdbcTemplate.queryForObject(sql, new Object[] {catName}, rowMapper);
		return cat;
	}
}
