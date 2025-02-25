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
package com.wy.firstmybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.wy.firstmybatis.domain.City;

/**
 * @author wy
 */
@Mapper
public interface CityMapper {

  @Select("select id, name, state, country from city where state = #{state}")
  City findByState(@Param("state") String state);
  
  @Select("select id, name, state, country from city")
  List<City> findAll();
  
  @Select("select id, name, state, country from city where id = #{id}")
  City findById(@Param("id") Long id);
  
  @Insert("insert into city (name, state, country) values( #{newCity.name},#{newCity.state},#{newCity.country})")
  void insertCity(@Param("newCity") City newCity);
  
  @Update("update city set name = #{updateCity.name}, state = #{updateCity.state}, country = #{updateCity.country} where id = #{updateCity.id}")
  void updateCity(@Param("updateCity") City updateCity);
  
  @Delete("delete from city where id = #{id}")
  void deleteById(@Param("id") Long id);

}
