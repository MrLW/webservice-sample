package com.lw.webservice;

public class WeatherService implements IWeatherService {

	@Override
	public String getWeatherByCityName(String cityName) {
		if("����".equals(cityName)){
			return "����";
		}else if("�Ϻ�".equals(cityName)){
			return "Сѩ";
		}
		return "��ѯʧ��";
	}

}
