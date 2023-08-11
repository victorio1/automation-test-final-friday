package starter.login;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class TypeLogin {

    // Metodo para poder hacer click sobre el boton de login

    public static Performable clickSignIn(){
        return Task.where("{0} click on sign in",
                Click.on(LoginForm.GO_SIGN_IN_BUTTON));
    }

    // Metodo para escribir el email del usuario para hacer login

    public static Performable typeEmail(String email){
        return Task.where("{0} type email '" + email + "'",
                Enter.theValue(email).into(LoginForm.WRITE_EMAIL));
    }

    // Metodo para escribir la contraseña del usuario para hacer login

    public static Performable typePassword(String password){
        return Task.where("{0} type email '" + password + "'",
                Enter.theValue(password).into(LoginForm.WRITE_PASSWORD));
    }

    // Metodo para poder hacer click para la confirmacion de login

    public static Performable clickConfirmSignIn(){
        return Task.where("{0} click on confirm sign in",
                Click.on(LoginForm.GO_SIGN_IN_CONFIRM));
    }

    // Metodo para poder salir sesion

    public static Performable clickLogOut(){
        return Task.where("{0} click on log out",
                Click.on(LoginForm.GO_LOG_OUT));
    }

}
