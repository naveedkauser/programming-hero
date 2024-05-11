import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {

    // Instance variable // copy
    ChromeDriver chromeGhrKaAddress;

    // static
    static String url = "google";
    static WebDriver driver;

    public static void main(String[] args) {
//        new ChromeDriver();
//        new ChromeDriver();
//        new ChromeDriver();

        // Object and instance variable example
        // Object t1
        test t = new test();
        // Method Calling
        t.initDriver();
        System.out.println(test.url);

        //ChromeDriver chromeGhrKaAddress = new ChromeDriver();
        t.chromeGhrKaAddress.get("https://www.google.com");


        // Object t2
        test t2 = new test();
        // Method Calling
        t2.initDriver();

        //ChromeDriver chromeGhrKaAddress = new ChromeDriver();
        t2.chromeGhrKaAddress.get("https://www.facebook.com");

        // static example
        // static method or variable is always call by class name e.g. test.
        test.initDriver2();
        test.driver.get("https://www.youtube.com");
    }

    public void initDriver(){
        chromeGhrKaAddress = new ChromeDriver();
    }

    // static method
    public static void initDriver2(){
        driver = new ChromeDriver();
    }
}
