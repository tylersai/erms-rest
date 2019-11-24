package com.thesaihan.erms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thesaihan.erms.dao.MajorDao;
import com.thesaihan.erms.model.Major;

@RestController
@CrossOrigin
@RequestMapping("major")
public class MajorController {
	
	@Autowired
	MajorDao majorDao;
	
	@GetMapping("all")
	public List<Major> getAllMajors(){
		return majorDao.getAllMajors();
	}

}
