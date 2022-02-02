package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatorsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
                "E:\\JAVA\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		//driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		System.out.println("Entering username");
		WebElement username = driver.findElement(By.cssSelector("input[name='email']"));
		username.sendKeys("test@gmail.com");
		System.out.println("Entering password");
		WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
		password.sendKeys("test");
		
		WebElement create= driver.findElement(By.xpath("//a[text()='Create New Account']"));
		create.click();
		
		Thread.sleep(5000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		
		Select s = new Select(day);
		s.selectByValue("3");
		
		WebElement month = driver.findElement(By.cssSelector("#month"));
		
		Select s1 = new Select(month);
		s1.selectByVisibleText("Nov");
		
		WebElement year = driver.findElement(By.name("birthday_year"));
		Select s2 = new Select(year);
		s2.selectByValue("2001");
		
		WebElement gender = driver.findElement(By.xpath("//input[@value='2']"));
		WebElement genderText = driver.findElement(By.xpath("//label[contains(text(),'Female')]"));
		gender.click();
		System.out.println(genderText.getText());
		
		WebElement signUp = driver.findElement(By.name("websubmit"));
		signUp.click();
		
		Thread.sleep(10000);
		driver.close();
		
		
		
		
		
		
		
		
		
		

	}

}
