package com.zlw.mybatis.dao;

import java.util.List;

import com.zlw.mybatis.bean.Json;

public interface JsonDaoMapper {
	//��ѯ
	public List<Json> queryAll();
	//���
	public void addJson(Json json);
	//����
	public void updateJson(Json json);
	//ɾ��
	public void deleteJson(Json json);
	
}
