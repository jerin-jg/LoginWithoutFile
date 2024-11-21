package LoginTest;
import Login.LoginPage;
import org.testng.annotations.Test;

public class LoginPageTest extends LoginPage {
    LoginPage loginPage = new LoginPage();
    @Test
    public void logintest(){
        loginPage.login();
    }
}
