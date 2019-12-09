package by.onliner.steps;

import by.onliner.pages.MainPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class MainPageSteps extends ScenarioSteps {
    MainPage onPage;

    @Step
    public void goToLoginPage() {
        onPage.goToLoginPage();
    }
}
