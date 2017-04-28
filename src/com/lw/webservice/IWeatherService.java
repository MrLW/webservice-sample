package com.lw.webservice;

import javax.jws.WebService;

// 作为webservice标志
@WebService
public interface IWeatherService {

	String getWeatherByCityName(String cityName);
}
