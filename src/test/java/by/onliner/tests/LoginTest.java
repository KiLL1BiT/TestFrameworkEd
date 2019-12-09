package by.onliner.tests;

import org.junit.Test;

public class LoginTest extends BaseTest{

    @Test
    public void loginTest() {
        user.atMainPage.goToLoginPage();
        user.atLoginPage.login();
    }
}
