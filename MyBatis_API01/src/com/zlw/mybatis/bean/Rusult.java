package com.zlw.mybatis.bean;

public class Rusult<T> {
	private int code;
	private String msg;
	private T result;
	
	
	
	public Rusult() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Rusult(int code, String msg, T result) {
		super();
		
		this.code = code;
		this.msg = msg;
		this.result = result;
	}
	
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public T getResult() {
		return result;
	}
	public void setResult(T result) {
		this.result = result;
	}
	
	

}
