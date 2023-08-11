package com.automation;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.annotations.CastMember;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import starter.actions.NavigateTo;

import starter.login.TypeLogin;

@ExtendWith(SerenityJUnit5Extension.class)
public class WhenUserLoginForBuy {

    @CastMember
    Actor actor;

    @Test
    @DisplayName("Should be able to login on automation web")
    void loginAutomationWeb(){
        actor.attemptsTo(
                NavigateTo.goAutomationWebHomePage(),
                TypeLogin.clickSignIn(),
                TypeLogin.typeEmail("evictorio.uni@gmail.com"),
                TypeLogin.typePassword("machomacho3"),
                TypeLogin.clickConfirmSignIn(),
                TypeLogin.clickLogOut()
        );
    }

}
