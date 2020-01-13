package com.asadhome;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scenaio {
	void Target() {
		ChromeDriver dr = new ChromeDriver();
		Common c = new Common();
//		open Chrome
		c.openBrowser();
//		go to target
		c.getWebSite("https://www.target.com/");
//		click on categories
		c.myClick(By.xpath("//*[@id=\"categories\"]"));
//		click young adult
		c.myClick(By.xpath("//*[@id=\"qh1tf\"]/a/div"));
//		click top rated
		c.myClick(By.xpath("//*[@id=\"oc0lj\"]/a/div"));
//		click the first product on the page
		c.myClick(By.xpath("//*[@id=\"mainContainer\"]/div[4]/div[2]/div/div[1]/div[3]/div/ul/li[1]/div/div[1]/h3/a/div/div/div/picture[1]/img"));
//		select quantity as 3
		c.myClick(By.xpath("//*[@id=\"select-76\"]/button"));
		c.selectValueInDropDown_index(By.xpath(""), 3);
		c.myClick(By.xpath("//*[@id=\"options\"]/li[3]/a/div/div"));
//		select your size
		c.myClick(By.xpath("//*[@id=\"mainContainer\"]/div/div/div[2]/div[2]/div[3]/div[2]/div[2]/div[3]/button"));
//		click "ship it"
		c.myClick(By.xpath("//*[@id=\"mainContainer\"]/div/div/div[2]/div[3]/div[1]/div/div[2]/div[1]/div/div[2]/div/button"));
//		click "view cart and check out"
		
//		verify "3" is visiable in cart sign
//		click "I am ready to check out"
//		input email
//		input password
//		click sign in
//		verify error message
//		
		
		
	}

}
