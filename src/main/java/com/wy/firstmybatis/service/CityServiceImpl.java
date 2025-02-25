package com.wy.firstmybatis.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.wy.firstmybatis.domain.City;
import com.wy.firstmybatis.mapper.CityMapper;

@Service
public class CityServiceImpl implements CityService {
	
	@Autowired
	private CityMapper cityMapper;
	
	@Override
    public City getCityByState(String state) {
        return cityMapper.findByState(state);
    }
	
	@Override
	public City getCityById(Long id) {
		return cityMapper.findById(id);
	}
	
	@Override
	public List<City> getAllCity(){
		return cityMapper.findAll();
	}
	
	@Override
	public void createCity(City newCity) {
		cityMapper.insertCity(newCity);
	}
	
	@Override
	public void modifyCity(City updateCity) {
		cityMapper.updateCity(updateCity);
	}
	
	@Override
	public void removeCity(Long id) {
		cityMapper.deleteById(id);
	}
}
