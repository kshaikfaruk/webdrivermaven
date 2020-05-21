package webdrivermaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {
	public static void main(String args[]){
		 WebDriverManager.chromedriver().setup();
		 WebDriver web=  new ChromeDriver();
		 web.get("http://www.google.com");

		 /** thrid
		  **/		 
		  
		 /****  code***/
		  /*** second***/
	}

}
