package com.zlw.mybatis.dao;

import java.util.List;

import com.zlw.mybatis.bean.Json;

public interface JsonDaoMapper {
	//查询
	public List<Json> queryAll();
	//添加
	public void addJson(Json json);
	//更新
	public void updateJson(Json json);
	//删除
	public void deleteJson(Json json);
	
}
