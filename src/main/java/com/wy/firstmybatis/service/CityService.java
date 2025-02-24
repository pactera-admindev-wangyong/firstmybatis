package com.wy.firstmybatis.service;

import java.util.List;
import com.wy.firstmybatis.domain.City;

public interface CityService {
	City getCityByState(String state);
}
