package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel {
public static WebDriver driver;
	
	
	@FindBy (id="location")	
	private WebElement location;
	@FindBy (id="hotels")	
	private WebElement hotels;
	@FindBy (id="room_type")	
	private WebElement room_type;
	@FindBy (id="room_nos")	
	private WebElement room_nos;
	@FindBy (id="Submit")	
	private WebElement Submit;
	@FindBy (id="radiobutton_0")	
	private WebElement radiobutton;
	@FindBy (id="continue")	
	private WebElement continuee;
	
	
	
	public  SearchHotel(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoom_type() {
		return room_type;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getContinuee() {
		return continuee;
	}
}
