package com.lw.webservice;

public class WeatherService implements IWeatherService {

	@Override
	public String getWeatherByCityName(String cityName) {
		if("北京".equals(cityName)){
			return "晴天";
		}else if("上海".equals(cityName)){
			return "小雪";
		}
		return "查询失败";
	}

}
