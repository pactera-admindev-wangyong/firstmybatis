/*
 *    Copyright 2015-2022 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package com.wy.firstmybatis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.wy.firstmybatis.domain.City;
import com.wy.firstmybatis.mapper.CityMapper;
import com.wy.firstmybatis.service.CityService;

@Controller
public class CityController {

	@Autowired
	private CityService cityService;
	
	@GetMapping("/cityinfo")
	public String getCity(Model model,@RequestParam("state") String state) {
		model.addAttribute("city", cityService.getCityByState(state));
		
		cityService.getCityById(Long.valueOf(1));
		cityService.getAllCity();
		
		City newCity = new City();
		newCity.setName("aaa");
		newCity.setState("bbb");
		newCity.setCountry("ccc");
		cityService.createCity(newCity);
		
		City updateCity = new City();
		updateCity.setId(Long.valueOf(2));
		updateCity.setName("aaa");
		updateCity.setState("bbb");
		updateCity.setCountry("ccc");
		cityService.modifyCity(updateCity);
		
		cityService.removeCity(Long.valueOf(2));
		
		return "cityinfo";
	}

}
