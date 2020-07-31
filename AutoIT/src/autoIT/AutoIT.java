package autoIT;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.chrome.driver",Path+"\\Driver\\chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://gofile.io/uploadFiles");
		Thread.sleep(4000);
		//WebElement upload = wd.findElement(By.xpath("//*[@id=\"mainContent\"]/div[4]/div/a/button"));
		//upload.click();
		Thread.sleep(4000);
		WebElement text = wd.findElement(By.xpath("//*[@id=\"btnChooseFiles\"]"));
		text.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(Path+"\\ScriptToRunProgram\\FileUpload.exe");
		Thread.sleep(4000);
		WebElement result = wd.findElement(By.xpath("//*[@id=\"file_0\"]/td[1]"));
		String output = result.getText();
		System.out.println(output);
	}
}