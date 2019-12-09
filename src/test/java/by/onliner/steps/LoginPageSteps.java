package by.onliner.steps;

import by.onliner.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginPageSteps extends ScenarioSteps {

    LoginPage onPage;

    @Step
    public void login() {
        onPage.emailInput();
        onPage.passwordInput();
        onPage.submit();
    }
}
