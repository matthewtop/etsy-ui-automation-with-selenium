package pl.globallogic.etsy.wdcapatibilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.log4testng.Logger;

public class BaseCapabilitiesDemoTest {
    protected WebDriver driver;

    protected Logger logger = (Logger) LoggerFactory.getLogger(BaseCapabilitiesDemoTest.class);
    protected String SANDBOX_ADDRESS ="https://bonigarcia.dev/selenium-webdriver-java/";

    String WEB_FORM = SANDBOX_ADDRESS + "web-form.html";
    String DROPDOWN_MENU = SANDBOX_ADDRESS + "dropdown-menu.html";
    String DRAW_IN_CANVAS = SANDBOX_ADDRESS + "draw-in-canvas.html";
    String LOADING_IMAGES = SANDBOX_ADDRESS + "loading-images.html";
    String SLOW_CALCULATOR= SANDBOX_ADDRESS + "slow-calculator.html";

    protected void sleep(){
        try{
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @BeforeClass
    public void globalSetup(){
//        WebDriverManager.chromedriver().setup();
        logger.warn("Starting Selenium Webdriver capabilities demonstration");
    }

    @BeforeMethod
    public void setUp(){driver= new ChromeDriver();}

    @AfterMethod(alwaysRun = true)
    public void cleanUp(){
        driver.quit();
    }

    @AfterClass
    public void globalCleanUp(){
        logger.warn("Finished with web driver capabilities demonstration");
    }

}
