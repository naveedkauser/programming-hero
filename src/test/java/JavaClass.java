import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class JavaClass {


    // driver
    static ChromeDriver driver;
    static String url;

    //re data get
    String re;

    // open chrome browser
    @Test(priority = 1)
    public void createObjectOnly() throws InterruptedException {
        driver = new ChromeDriver();

    }
    // navigate to the URL
    @Test(priority = 2)
    public void navigateToGooglePage() {
        // bad approach
        //driver.get("https://www.google.com/");

        // good approach while learning java
        url = "https://www.orangehrm.com/";
        driver.get(url);
    }

    // It will validate the state of current url and the URL which i have inserted
    @Test(priority = 3)
    public void validateState() {
        System.out.println(driver.getCurrentUrl());
        // bad approach
        //Assert.assertEquals("https://www.google.com/", driver.getCurrentUrl());

        Assert.assertEquals(url, driver.getCurrentUrl());
    }

}
