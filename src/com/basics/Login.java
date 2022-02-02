package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver",
                "E:\\JAVA\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		System.out.println("Entering username");
		WebElement username = driver.findElement(By.id("email"));
		username.sendKeys("test@gmail.com");
		System.out.println("Entering password");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("test");
		
		System.out.println("Webpage title "+ driver.getTitle());
		
		if((driver.getTitle()).equals("Facebook – log in or sign up"))
			System.out.println("Title is showing correctly");
		else 
			System.out.println("You are in forgot password page");
		
		WebElement forgotPass = driver.findElement(By.partialLinkText("Forgotten"));
		forgotPass.click();
		
		System.out.println("Webpage title "+ driver.getTitle());
		System.out.println("Get current url "+ driver.getCurrentUrl());
		
		
		
//		WebElement logIn = driver.findElement(By.name("login"));
//		logIn.click();
		
		//driver.close();
		//driver.quit();
		
		
		

	}

}
