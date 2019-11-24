package com.thesaihan.erms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thesaihan.erms.dao.SubjectDao;
import com.thesaihan.erms.model.Subject;

@RestController
@CrossOrigin
@RequestMapping("subject")
public class SubjectController {
	
	@Autowired
	SubjectDao subjectDao;
	
	@PostMapping("save")
	public boolean save(@RequestBody Subject sub) {
		return subjectDao.save(sub);
	}
	
	@PostMapping("delete")
	public boolean delete(@RequestBody String sub_code) {
		return subjectDao.delete(sub_code);
	}
	
	@GetMapping("all")
	public List<Subject> getAll(){
		return subjectDao.getAllSubjects();
	}

}
