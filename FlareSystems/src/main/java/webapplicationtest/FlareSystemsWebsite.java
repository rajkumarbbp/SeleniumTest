package webapplicationtest;
//launch chrome /launch flaresystems web app /get the title/verification point/checkpoint-act vs exp result
//get url /close browser

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlareSystemsWebsite {

	public static void main(String[] args) {
	//start the server with binary/.exe file
		
		//windows:
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajpa\\Downloads\\chromedriver.exe");
		
		//mac:
		//System.setProperty("webdriver.chrome.driver", "/Users/rajpa/Downloads/chromedriver");
		
		WebDriver driver = new ChromeDriver();//launch chrome
		
		driver.get("https://flare.systems/.com");//enter url
		
		String title = driver.getTitle();//get the title
		System.out.println("page title is: " + title);
		
		//verification point/checkpoint/act vs exp result
		if(title.equals("Page not found - Flare Systems | Know your digital footprint. And own it.")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("incorrect title");
		}
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
//		String source = driver.getPageSource();
//		System.out.println(source.contains("Copyright The Closure Library Authors"));
	
		driver.quit();//close the browser
	}
}
