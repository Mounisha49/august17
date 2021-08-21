package HotelProject;

import org.openqa.selenium.WebDriver;

import com.base.BaseClass;
import com.pom.BookHotel;
import com.pom.SearchHotel;
import com.pom.loginPage;

public class Adactin extends BaseClass {

	
	 public static WebDriver driver;
	    
		public static void main(String[] args) throws InterruptedException {
			driver=browserLaunch("chrome");
			openurl("http://adactin.com/HotelApp");
			
			
			loginPage lp=new loginPage(driver);
			clickonelement(lp.getUsername(),"devisri49");
			clickonelement(lp.getPassword(), "6AEE99");
			click(lp.getLogin());
			
			SearchHotel sp=new SearchHotel(driver);
			dropdown(sp.getLocation(), "Sydney");
			dropdown(sp.getHotels(), "Hotel Creek");
			dropdown(sp.getRoom_type(), "Deluxe");
			dropdown3(sp.getRoom_nos(), 2);
			click(sp.getSubmit());
			click(sp.getRadiobutton());
			click(sp.getContinuee());
			
			BookHotel bh=new BookHotel(driver);
			clickonelement(bh.getFirst_name(), "devi");
			clickonelement(bh.getLast_name(), "sri");
			clickonelement(bh.getAddress(), "newyorkcity");
			clickonelement(bh.getCc_num(), "9087654345678965");
			dropdown3(bh.getCc_type(), 2);
			dropdown(bh.getCc_exp_month(), "February");
			dropdown3(bh.getCc_exp_year(), 5);
			clickonelement(bh.getCc_cvv(), "789");
			click(bh.getBook_now());
			click(bh.getSearchHotel());
			click(bh.getLogout());
			
			
		}
		

}
