package com.sharmila;

import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdMavenProject {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\JARs\\Drivers\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/"); 
		String url=driver.getCurrentUrl();
		System.out.println(url);
	}

}
