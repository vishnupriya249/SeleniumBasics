package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalendarDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",
                "E:\\JAVA\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/flights/");
		
		WebElement close = driver.findElement(By.xpath("//span[@class='langCardClose']"));
		close.click();

	}

}
