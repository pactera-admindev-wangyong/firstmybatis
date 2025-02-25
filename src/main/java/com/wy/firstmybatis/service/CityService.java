package com.wy.firstmybatis.service;

import java.util.List;
import com.wy.firstmybatis.domain.City;

public interface CityService {
	
	City getCityByState(String state);
	
	City getCityById(Long id);
	
	List<City> getAllCity();
	
	void createCity(City newCity);
	
	void modifyCity(City updateCity);
	
	void removeCity(Long id);
}
