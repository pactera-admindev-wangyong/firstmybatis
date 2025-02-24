package com.wy.firstmybatis.service;

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
}
