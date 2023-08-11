package starter.actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {

    public static Performable goAutomationWebHomePage (){
        return Task.where("opens automation web",
                Open.browserOn().the(AutomationWebGoHome.class));
    }

}
