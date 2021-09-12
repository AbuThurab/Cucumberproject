package org.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;

	public static void launchBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void launchUrl(String url) {
		driver.get(url);

	}

	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public static void fillText(WebElement e, String text) {
		e.sendKeys(text);
	}

	public static void click(WebElement e) {
		e.click();

	}

	public static void takeSnap(String filename) throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File init = tk.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\ABU\\eclipse-workspace\\Practice\\Screenshot" + filename + ".png");
		FileUtils.copyFile(init, dest);

	}

}
