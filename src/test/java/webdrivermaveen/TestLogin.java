package webdrivermaveen;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLogin {
	@Test
 public void doLogin(){
		 WebDriverManager.chromedriver().setup();
		 WebDriver web=  new ChromeDriver();
		 web.get("http://www.google.com");

		 /** thrid
		  **/		 
		  
		 /****  code***/
		  /*** second***/
	}
	/** fourth**/
	/** fifth***/

}
