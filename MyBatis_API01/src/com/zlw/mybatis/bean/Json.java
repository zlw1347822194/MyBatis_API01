package com.zlw.mybatis.bean;

public class Json {
	
	private int api_id;
	private String api_name;
	private String api_sex;
	private int api_age;
	
	
	public Json(int api_id, String api_name, String api_sex, int api_age) {
		super();
		this.api_id = api_id;
		this.api_name = api_name;
		this.api_sex = api_sex;
		this.api_age = api_age;
	}
	
	public Json(String api_name, String api_sex, int api_age) {
		super();
		this.api_name = api_name;
		this.api_sex = api_sex;
		this.api_age = api_age;
	}

	public Json(int api_id) {
		super();
		this.api_id = api_id;
	}
	
	
	



	public Json(String api_name) {
		super();
		this.api_name = api_name;
	}

	public Json() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getApi_id() {
		return api_id;
	}
	public void setApi_id(int api_id) {
		this.api_id = api_id;
	}
	public String getApi_name() {
		return api_name;
	}
	public void setApi_name(String api_name) {
		this.api_name = api_name;
	}
	public String getApi_sex() {
		return api_sex;
	}
	public void setApi_sex(String api_sex) {
		this.api_sex = api_sex;
	}
	public int getApi_age() {
		return api_age;
	}
	public void setApi_age(int api_age) {
		this.api_age = api_age;
	}
	
	
	
	
	
}
