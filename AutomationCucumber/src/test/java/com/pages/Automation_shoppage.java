package com.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Automation_shoppage {
static WebDriver dr;
By shop=By.xpath("/html/body/div[1]/div[1]/header/div[2]/nav/ul/li[1]/a");
By add=By.xpath("/html/body/div[1]/div[2]/div/div/ul/li[2]/a[2]");
public void url() { // url for launch the chrome
	System.setProperty("webdriver.chrome.driver",  "src/test/resources/driver/chromedriver");
	dr = new ChromeDriver();
	dr.manage().window().maximize();
	dr.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
}
public void shopPage() throws InterruptedException //using webdriver get visting the testing website
{
	dr.get("http://practice.automationtesting.in/");
	System.out.println(dr.getTitle());
	Thread.sleep(5000);
	 
}
public void shopDeatils()
{
	dr.findElement(shop).click(); // move to to element achiving by creating object
	dr.findElement(add).click();
}
public void submit2() throws InterruptedException
{
Thread.sleep(3000);
	dr.close();
}}

