package com.devfun.settingweb_boot.dao;

import java.util.HashMap;

import org.apache.ibatis.annotations.Param;

import com.devfun.settingweb_boot.dto.StatisticDto;

public interface StatisticMapper {

		public HashMap<String, Object> selectYearLogin(String year);

		public HashMap<String, Object> selectMonthLogin(
				 @Param (value = "month") String month);

		public HashMap<String, Object> selectDateLogin(
				 @Param (value = "date") String date);

	    public HashMap<String, Object> selectExcludeHolidayLogin(
	    		@Param (value = "statisticDto")StatisticDto statisticDto);
		
		public HashMap<String, Object> selectOrganMonthLogin(
	            @Param (value = "statisticDto") StatisticDto statisticDto);

		
}
