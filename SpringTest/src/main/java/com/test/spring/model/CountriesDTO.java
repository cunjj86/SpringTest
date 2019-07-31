package com.test.spring.model;

public class CountriesDTO {
	
	public int countryid;
	public String countryname;
	public String countrycurrencyname;
	public String countrycurrencyshortname;
	public String countryemail;
	public String countryflagurl;
	
	@Override
	public String toString() {
		return "CountriesDTO [countryid=" + countryid + ", countryname=" + countryname + ", countrycurrencyname="
				+ countrycurrencyname + ", countrycurrencyshortname=" + countrycurrencyshortname + ", countryemail="
				+ countryemail + ", countryflagurl=" + countryflagurl + "]";
	}
	
	public int getCountryid() {
		return countryid;
	}
	public void setCountryid(int countryid) {
		this.countryid = countryid;
	}
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	public String getCountrycurrencyname() {
		return countrycurrencyname;
	}
	public void setCountrycurrencyname(String countrycurrencyname) {
		this.countrycurrencyname = countrycurrencyname;
	}
	public String getCountrycurrencyshortname() {
		return countrycurrencyshortname;
	}
	public void setCountrycurrencyshortname(String countrycurrencyshortname) {
		this.countrycurrencyshortname = countrycurrencyshortname;
	}
	public String getCountryemail() {
		return countryemail;
	}
	public void setCountryemail(String countryemail) {
		this.countryemail = countryemail;
	}
	public String getCountryflagurl() {
		return countryflagurl;
	}
	public void setCountryflagurl(String countryflagurl) {
		this.countryflagurl = countryflagurl;
	}
	
}
