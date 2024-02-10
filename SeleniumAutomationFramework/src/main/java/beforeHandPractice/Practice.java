package beforeHandPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice {
	
	public static void main (String[]args) {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/test/resources/executables/chromedriver");
		WebDriver obj=new ChromeDriver();
		obj.get("http://www.google.com");
		String Title=obj.getTitle();
		System.out.println(Title);
		obj.quit();
		
	}

}
