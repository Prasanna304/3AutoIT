package autoIT;

public class AutoIT {

	public static void main(String[] args) {
		
		File f = new File("");
		String Path = f.getAbsolutePath();
		System.setProperty("webdriver.chrome.driver",Path+"\\Driver\\chromedriver");
		WebDriver wd = new FirefoxDriver();
		wd.manage().window().maximize();
		wd.get("http://www.tinyupload.com/");
		WebElement upload = wd.findElement(By.xpath("/html/body/table/tbody/tr[4]/td/table/tbody/tr/td[2]/form/table/tbody/tr[2]/td[1]/input[2]"));
		upload.click();
		Thread.sleep(2000);
		Runtime.getRuntime().exec(Path+"\\AutoITSoftware\\AutoITTest.exe");
	}
}