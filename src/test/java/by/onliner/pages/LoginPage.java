package by.onliner.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.annotations.findby.How;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(how = How.XPATH, using = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div/div/input")
    private WebElement emailPlaceholder;

    @FindBy(how = How.XPATH, using = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div/div/input")
    private WebElement passwordPlaceholder;

    String email = "x_zzz.06@mail.ru";
    String password = "testFRAMEWORK2";

    public void emailInput() {
        element(emailPlaceholder).sendKeys(email);
    }

    public void passwordInput() {
        element(passwordPlaceholder).sendKeys(password);
    }

    public void submit() {
        element(passwordPlaceholder).submit();
    }
}
