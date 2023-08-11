package starter.login;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginForm {

    static Target GO_SIGN_IN_BUTTON = Target.the("button go sign up").located(By.cssSelector("a[href=\"/login\"]"));

    static Target WRITE_EMAIL = Target.the("type email to login").located(By.cssSelector("input[data-qa=\"login-email\"]"));

    static Target WRITE_PASSWORD = Target.the("type pass to login").located(By.cssSelector("input[data-qa=\"login-password\"]"));

    static Target GO_SIGN_IN_CONFIRM = Target.the("click on login button").located(By.cssSelector("button[data-qa=\"login-button\"]"));

    static Target GO_LOG_OUT = Target.the("click on logout button").located(By.cssSelector("a[href=\"/logout\"]"));


}
