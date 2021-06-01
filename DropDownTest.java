package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;
import sun.awt.SunHints.Value;

public class DropDownTest {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/select-menu");
		
		driver.manage().window().maximize();
		//driver.findElement(By.id("oldSelectMenu")).sendKeys("Pink");
		WebElement dropDown=driver.findElement(By.id("oldSelectMenu"));
		Select select = new Select(dropDown);
		select.selectByVisibleText("Black");
		
		List<WebElement> Values  =driver.findElements(By.tagName("option"));
		
		System.out.println("VAlues in :"+Values.size());
		
		for(int i=0;i<Values.size();i++) {
			System.out.println(Values.get(i).getText());
		}

	}

}
