package com.devfun.service;

import java.util.List;
import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.devfun.dao.MovieDAO;
import com.devfun.vo.MovieVO;

@Service
public class MovieServiceImpl implements MovieService{

	@Inject
	private MovieDAO movieDAO;

	@Override
	public List<MovieVO> selectMovie() throws Exception {
		// TODO Auto-generated method stub
		return movieDAO.selectMovie();
	}	
	
}
