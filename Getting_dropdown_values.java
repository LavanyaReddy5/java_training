mport io.vavr.collection.Array;
import net.serenitybdd.core.annotations.findby.By;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

public class TestPractice {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reddyl\\Desktop\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		List <WebElement> Element = new ArrayList<WebElement>() ;
		List <String> values = new ArrayList<>() ;
		List <String> tests = new ArrayList<>() ;
		Element=driver.findElements(By.xpath("\t\t//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select/option\n"));
		for (WebElement element : Element){
			tests.add(element.getText());
			values.add(element.getAttribute("value"));
		}
		System.out.println("Values in dropdown:\n"+values);
		System.out.println("Texts in dropdown:\n"+tests);
	}

}
