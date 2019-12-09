package by.onliner.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"userbar\"]/div[1]/div/div/div[1]")
    private WebElement loginButton;

    public void goToLoginPage() {
        element(loginButton).hasFocus();
        element(loginButton).click();
    }

}
