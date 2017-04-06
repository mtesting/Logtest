package pack11;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

public class CheckColor {

	@Test
	public void ColorFilter() {
		My1 m = new My1();
		m.driver.navigate().to("http://www.wallis.co.uk/");
		m.img1 = m.driver.findElement(By.id("colorbox"));
		m.img1.click();
		
	}

}
