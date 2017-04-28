package com.lw.puhlisher;

import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import com.lw.webservice.WeatherService;

/**
 *  发布服务
 * @author lw
 */
public class Publisher {

	public static void main(String[] args) {
		// 1、创建工厂类
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean() ;
		// 2、设置服务地址
		factoryBean.setAddress("http://localhost:12345/weather");
		//3、设置服务类
		factoryBean.setServiceBean(new WeatherService());
		//4、发布
		factoryBean.create(); 
	}
}
