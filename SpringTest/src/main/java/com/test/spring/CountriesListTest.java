package com.test.spring;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.spring.DAO.CountriesDAO;
import com.test.spring.model.CountriesDTO;

@Controller
public class CountriesListTest {
	
	private static final Logger logger = LoggerFactory.getLogger(CountriesListTest.class);

	@Inject

	private CountriesDAO countriesDAO;

	@RequestMapping(value = "/listTest.do")
	public void testGetCountriesList() throws Exception {

		List<CountriesDTO> countryList = countriesDAO.getCountryList();

		logger.info("\n Board List \n ");

		if(countryList.size() > 0) {

			for(CountriesDTO list : countryList) {

				logger.info(list.countryname);
				System.out.print(list.countryname);

			}

		} else {

			logger.info("데이터가 없습니다.");

		}

	}

}
