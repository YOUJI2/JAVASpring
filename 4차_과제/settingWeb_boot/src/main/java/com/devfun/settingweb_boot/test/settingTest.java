package com.devfun.settingweb_boot.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.devfun.settingweb_boot.dto.StatisticDto;
import com.devfun.settingweb_boot.service.StatisticService;

@Controller
public class settingTest {
    
	//공휴일 정보 
	holidayTest holidayTest;
	
	//controller
	@Autowired
	private StatisticService service;
	
	//연간 로그인 수 
	@ResponseBody
	@RequestMapping("/sqlyearStatistic")
	public Map<String, Object> sqltest(String year) throws Exception{
		return service.yearloginNum(year);
	}

	//특정달 로그인 수
	@ResponseBody
	@RequestMapping("/sqlmonthStatistic/{month}")
	public Map<String, Object> monthLoginTest(
				@PathVariable(name ="month") String month) throws Exception{
		return service.monthloginNum(month);
	}

	//특정날 로그인 수
	@ResponseBody
	@RequestMapping("/sqldateStatistic/{date}")
	public Map<String, Object> dateLoginTest(
				@PathVariable(name ="date") String date) throws Exception{
		return service.dateloginNum(date);
	}

	//휴일을 제외한 접속일 수 
	@ResponseBody
	@RequestMapping("/sqldataStatistic/exHoliday")
	public Map<String, Object> excludeHolidayLoginTest(
		@RequestBody StatisticDto statisticDto) throws Exception{
		return service.excludeHolidayNum(statisticDto);
	}
	//부서별 월간 로그인 수
	 @ResponseBody	  
	 @RequestMapping("/sqlorganStatistic/dept")
	 public Map<String, Object> organMonthLoginTest(	 
	  @RequestBody StatisticDto statisticDto) throws Exception{
		 return service.organMonthLoginNum(statisticDto);
	  }
	 	
	
	
	
//---------------------------------------------------------------------------
	
    @RequestMapping("/test") 
    public ModelAndView test() throws Exception{ 
        ModelAndView mav = new ModelAndView("test"); 
        mav.addObject("name", "devfunpj"); 
        List<String> resultList = new ArrayList<String>(); 
        resultList.add("!!!HELLO WORLD!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!"); 
        resultList.add("설정 TEST!!!!!"); 
        resultList.add("설정 TEST!!!!!!"); 
        mav.addObject("list", resultList); 
        return mav; 
    }
 
    
    
    
    
    
    
    
    
    
    
}