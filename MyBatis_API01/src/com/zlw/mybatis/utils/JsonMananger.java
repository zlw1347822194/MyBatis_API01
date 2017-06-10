package com.zlw.mybatis.utils;

import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.util.TypeUtils;

public class JsonMananger {
	   static{
	        TypeUtils.compatibleWithJavaBean = true;
	    }
	    /**
	     * ��json�ַ���ת����java����
	     * @param json
	     * @param cls
	     * @return
	     * @throws HttpException
	     */
	    public static <T> T jsonToBean(String json, Class<T> cls)   {
	        return JSON.parseObject(json, cls);
	    }

	    /**
	     * ��json�ַ���ת����java List����
	     * @param json
	     * @param cls
	     * @return
	     * @throws HttpException
	     */
	    public static <T> List<T> jsonToList(String json, Class<T> cls)   {
	        return (List<T>) JSON.parseArray(json, cls);
	    }

	    /**
	     * ��bean����ת����json�ַ���
	     * @param obj
	     * @return
	     * @throws HttpException
	     */
	    public static String beanToJson(Object obj)  {
	        String result = JSON.toJSONString(obj);
	        return result;
	    }
}
