package com.devfun.settingweb_boot.service;

import java.util.HashMap;
import java.util.Map;

import com.devfun.settingweb_boot.dto.StatisticDto;

public interface StatisticService {
	public HashMap<String, Object> yearloginNum(String year);

	public HashMap<String, Object> monthloginNum(String month);

	public HashMap<String, Object> dateloginNum(String date);
	
	
	public HashMap<String, Object> organMonthLoginNum(StatisticDto statisticDto);

	public Map<String, Object> excludeHolidayNum(StatisticDto statisticDto);

	
	
	

}
