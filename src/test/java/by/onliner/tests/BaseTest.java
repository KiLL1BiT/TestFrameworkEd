package by.onliner.tests;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public abstract class BaseTest {
    @Steps
    public User user;

    @Managed
    WebDriver driver;

    @Before
    public void setUp() {
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();
        driver.get("https://www.onliner.by/");
    }

    @After
    public void tearDown() {
        driver.close();
    }


}
