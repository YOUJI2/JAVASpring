package com.devfun.settingweb_boot.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devfun.settingweb_boot.dao.StatisticMapper;
import com.devfun.settingweb_boot.dto.StatisticDto;
import com.devfun.settingweb_boot.test.holidayTest;

@Service
public class StatisticServiceImpl implements StatisticService{
	
	@Autowired
	private StatisticMapper uMapper;
	
	holidayTest holidayTest;
	
	@Override
	public HashMap<String , Object> yearloginNum(String year){
		HashMap<String , Object> retVal = new HashMap<String, Object>();
		
		try {
			retVal = uMapper.selectYearLogin(year);
			retVal.put("year", year);
			retVal.put("is_success", true);
		}catch (Exception e) {
			// TODO: handle exception
			retVal.put("totCnt", -999);
			retVal.put("year", year);
			retVal.put("is_success", false);
		}
		
		return retVal;
	}

	@Override
	public HashMap<String, Object> monthloginNum(String month) {
		// TODO Auto-generated method stub
		HashMap<String , Object> retVal = new HashMap<String, Object>();
		
		try {
			retVal = uMapper.selectMonthLogin(month);
			retVal.put("month", month);
			retVal.put("is_success", true);
		}catch (Exception e) {
			// TODO: handle exception
			retVal.put("totCnt", -999);
			retVal.put("month", month);
			retVal.put("is_success", false);		
		}		
		return retVal;
	}

	@Override
	public HashMap<String, Object> dateloginNum(String date) {
		// TODO Auto-generated method stub
		HashMap<String , Object> retVal = new HashMap<String, Object>();
		
		try {
			retVal = uMapper.selectDateLogin(date);
			retVal.put("month", date);
			retVal.put("is_success", true);
		}catch (Exception e) {
			// TODO: handle exception
			retVal.put("totCnt", -999);
			retVal.put("date", date);
			retVal.put("is_success", false);		
		}		
		return retVal;
	}


	@Override
	public Map<String, Object> excludeHolidayNum(StatisticDto statisticDto) {
		// TODO Auto-generated method stub
		HashMap<String , Object> retVal = new HashMap<String, Object>();	
		List<String> holidayList = holidayTest.get(statisticDto.getYear(), statisticDto.getMonth());
		statisticDto.setHolidayList(holidayList);
		statisticDto.setHolidayListSize(holidayList.size());
		try {
			retVal = uMapper.selectExcludeHolidayLogin(statisticDto);
			
			retVal.put("year", statisticDto.getYear());
			retVal.put("month", statisticDto.getMonth());
			retVal.put("is_success", true);
		}catch (Exception e) {
			// TODO: handle exception
			retVal.put("totCnt", -999);
			retVal.put("year", statisticDto.getYear());
			retVal.put("month", statisticDto.getMonth());			
			retVal.put("is_success", false);		
		}		
		return retVal;

		
	}

	//부서별 월간 로그인 수 
	@Override
	public HashMap<String, Object> organMonthLoginNum(StatisticDto statisticDto) {
		// TODO Auto-generated method stub
		HashMap<String , Object> retVal = new HashMap<String, Object>();	
		try {
			retVal = uMapper.selectOrganMonthLogin(statisticDto);
			retVal.put("month", statisticDto.getMonth());
			retVal.put("organ", statisticDto.getOrgan());
			retVal.put("is_success", true);
		}catch (Exception e) {
			// TODO: handle exception
			retVal.put("totCnt", -999);
			retVal.put("date",statisticDto.getMonth());
			retVal.put("is_success", false);		
		}		
		return retVal;
	}

	
	
	
	
	
	
}
