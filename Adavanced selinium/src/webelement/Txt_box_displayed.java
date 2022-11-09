package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Txt_box_displayed {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Selenium/geckodriver.exe");
		WebDriver w=new FirefoxDriver();
		w.get("file:///G:/seleniumhtml/New%20Text%20Document(text)%206.html");
	    WebElement ele=w.findElement(By.xpath("//input[@type='text']"));
	    boolean b = ele.isDisplayed();
	    if(b)
	    {
	    	System.out.println("element is displayed");
	    }
	    else
	    {
	    	System.out.println("element is not displayed");
	    }
	}

}
