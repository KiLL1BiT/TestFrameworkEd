package by.onliner.tests;

import by.onliner.steps.LoginPageSteps;
import by.onliner.steps.MainPageSteps;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.steps.ScenarioSteps;

public class User extends ScenarioSteps {

    @Steps
    public MainPageSteps atMainPage;

    @Steps
    public LoginPageSteps atLoginPage;


}
