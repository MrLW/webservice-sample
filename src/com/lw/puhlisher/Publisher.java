package com.lw.puhlisher;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.lw.webservice.WeatherService;

/**
 *  ��������
 * @author lw
 */
public class Publisher {

	public static void main(String[] args) {
		// 1������������
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean() ;
		// 2�����÷����ַ
		factoryBean.setAddress("http://localhost:12345/weather");
		//3�����÷�����
		factoryBean.setServiceBean(new WeatherService());
		//4������
		factoryBean.create(); 
	}
}
