package pack11;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class CheckLogo {

	@Test
	public void test() {
		My1 m = new My1();
		m.driver.navigate().to("http://www.wallis.co.uk/");
		Assert.assertEquals("Wallis", m.driver.findElement(By.id("store_logo")));
		
	}

}
