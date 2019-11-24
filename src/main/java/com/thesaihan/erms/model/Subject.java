package com.thesaihan.erms.model;

public class Subject {
	
	private String sub_code;
	private String sub_name;
	private String dept_id;
	private Integer sub_pass;
	private Integer sub_distinction;
	private Integer sub_excellent;
	
	public Subject() {
		this.clearProperties();
	}

	private void clearProperties() {
		this.dept_id = "";
		this.sub_code = "";
		this.sub_distinction = 70;
		this.sub_excellent = 85;
		this.sub_name = "";
		this.sub_pass = 50;
	}

	public String getSub_code() {
		return sub_code;
	}

	public void setSub_code(String sub_code) {
		this.sub_code = sub_code;
	}

	public String getSub_name() {
		return sub_name;
	}

	public void setSub_name(String sub_name) {
		this.sub_name = sub_name;
	}

	public String getDept_id() {
		return dept_id;
	}

	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}

	public Integer getSub_pass() {
		return sub_pass;
	}

	public void setSub_pass(Integer sub_pass) {
		this.sub_pass = sub_pass;
	}

	public Integer getSub_distinction() {
		return sub_distinction;
	}

	public void setSub_distinction(Integer sub_distinction) {
		this.sub_distinction = sub_distinction;
	}

	public Integer getSub_excellent() {
		return sub_excellent;
	}

	public void setSub_excellent(Integer sub_excellent) {
		this.sub_excellent = sub_excellent;
	}

	@Override
	public String toString() {
		return "Subject [sub_code=" + sub_code + ", sub_name=" + sub_name + ", dept_id=" + dept_id + ", sub_pass="
				+ sub_pass + ", sub_distinction=" + sub_distinction + ", sub_excellent=" + sub_excellent + "]";
	}
	
}
