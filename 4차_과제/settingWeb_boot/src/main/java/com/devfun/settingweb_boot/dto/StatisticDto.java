package com.devfun.settingweb_boot.dto;

import java.util.List;

import com.devfun.settingweb_boot.test.holidayTest;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class StatisticDto {

	
	//유저 아이디 
	private Long userId;
	
	//특정 년도
	private String year;
	
	//특정 달
	private String month;
	
	//특정 날
	private String date;
	
	//부서 번호 
	private String organ;
	
	//휴일 리스트
	private List<String> holidayList;

	//휴일 리스트 갯수
	private int holidayListSize;
	

	
	public int getHolidayListSize() {
		return holidayListSize;
	}

	public void setHolidayListSize(int holidayListSize) {
		this.holidayListSize = holidayListSize;
	}

	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getOrgan() {
		return organ;
	}

	public void setOrgan(String organ) {
		this.organ = organ;
	}

	public List<String> getHolidayList() {
		return holidayList;
	}

	public void setHolidayList(List<String> holidayList) {
		this.holidayList = holidayList;
	}
	
	
}
