package com.thesaihan.erms.controller;

import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.AntPathMatcher;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.HandlerMapping;

import com.thesaihan.erms.dao.StudentDao;
import com.thesaihan.erms.model.Student;

@RestController
@CrossOrigin
@RequestMapping("student")
public class StudentController {

	@Autowired
	StudentDao studentDao;

	@GetMapping("all")
	public List<Student> getAllStudent() {
		return studentDao.getAllStudents();
	}

	@GetMapping("id/**")
	public Student getStudentById(HttpServletRequest request) {
		String id = extractId(request);
		return studentDao.getStudentByID(id);
	}

	@PostMapping("save")
	public boolean saveStudent(@RequestBody Student std) {
		return studentDao.save(std);
	}

	@PostMapping("delete")
	public boolean deleteStudent(@RequestBody HashMap<String, Object> param) {
		return studentDao.delete((String) param.get("std_id"));
	}

	private String extractId(HttpServletRequest request) {

		String path = (String) request.getAttribute(HandlerMapping.PATH_WITHIN_HANDLER_MAPPING_ATTRIBUTE); // /elements/CATEGORY1/CATEGORY1_1/ID
		String bestMatchPattern = (String) request.getAttribute(HandlerMapping.BEST_MATCHING_PATTERN_ATTRIBUTE); // /elements/**

		return new AntPathMatcher().extractPathWithinPattern(bestMatchPattern, path); // CATEGORY1/CATEGORY1_1/ID
	}

}
