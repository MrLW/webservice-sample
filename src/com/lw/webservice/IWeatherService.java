package com.lw.webservice;

import javax.jws.WebService;

// ��Ϊwebservice��־
@WebService
public interface IWeatherService {

	String getWeatherByCityName(String cityName);
}
