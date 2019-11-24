package com.thesaihan.erms.model;

public class Major {
	
	private String major_code;
	private String major_name;
	private String major_name_mm;
	private String major_type;
	private String dept_id;
	private Integer major_order;
	
	public Major() {
		this.clearProperties();
	}
	
	private void clearProperties() {
		this.dept_id = "";
		this.major_code = "";
		this.major_name = "";
		this.major_name_mm = "";
		this.major_type = "";
		this.major_order = 0;
	}

	public String getMajor_code() {
		return major_code;
	}

	public void setMajor_code(String major_code) {
		this.major_code = major_code;
	}

	public String getMajor_name() {
		return major_name;
	}

	public void setMajor_name(String major_name) {
		this.major_name = major_name;
	}

	public String getMajor_name_mm() {
		return major_name_mm;
	}

	public void setMajor_name_mm(String major_name_mm) {
		this.major_name_mm = major_name_mm;
	}

	public String getMajor_type() {
		return major_type;
	}

	public void setMajor_type(String major_type) {
		this.major_type = major_type;
	}

	public String getDept_id() {
		return dept_id;
	}

	public void setDept_id(String dept_id) {
		this.dept_id = dept_id;
	}

	public Integer getMajor_order() {
		return major_order;
	}

	public void setMajor_order(Integer major_order) {
		this.major_order = major_order;
	}

	@Override
	public String toString() {
		return "Major [major_code=" + major_code + ", major_name=" + major_name + ", major_name_mm=" + major_name_mm
				+ ", major_type=" + major_type + ", dept_id=" + dept_id + ", major_order=" + major_order + "]";
	}
	
	

}
