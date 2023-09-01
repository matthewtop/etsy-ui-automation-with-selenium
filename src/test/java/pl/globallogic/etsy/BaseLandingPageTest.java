package pl.globallogic.etsy;

import org.openqa.selenium.WebDriver;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.log4testng.Logger;
import pl.globallogic.config.OurWebDriverManager;
import pl.globallogic.etsy.features.pageobjects.InvalidSearchResultPage;
import pl.globallogic.etsy.features.pageobjects.LandingPage;


public class BaseLandingPageTest {
    protected WebDriver driver;

    protected LandingPage landingPage;
    protected InvalidSearchResultPage invalidSearchResultPage;

    Logger logger = (Logger) LoggerFactory.getLogger(BaseLandingPageTest.class);


    @BeforeClass
    public void globalSetup(){

    }

    @BeforeMethod
    public void testSetUp(){
        System.setProperty("browser","firefox");
        driver = OurWebDriverManager.getConfiguredWebDriver();
        LandingPage landingPage = new LandingPage(driver);
        landingPage.goTo();
        landingPage.acceptDefaultPrivacyPolicy();
    }

    @AfterClass
    public void globalCleanUp(){
        System.out.println("************* Test suite execution completed");
    }

    @AfterMethod(alwaysRun = true)
    public void testCleanUp(){
        System.out.println("Selenium webdriver quit");
        driver.quit();
    }
}
