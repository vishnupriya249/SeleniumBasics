package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {
	
	public static void main(String args[]){
		System.setProperty("webdriver.chrome.driver",
                "E:\\JAVA\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");
		driver.switchTo().frame("iframeResult"); 
		WebElement tryIt = driver.findElement(By.xpath("//button[contains(text(),'Try it')]"));
		tryIt.click();
	
	}
}
