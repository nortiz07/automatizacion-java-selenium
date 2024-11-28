package org.example.steps;

import net.serenitybdd.core.Serenity;
import net.thucydides.core.annotations.Step;
import org.example.pages.interacciones.MainPageInteraction;
import org.example.pages.mapeos.LoginPage;
import org.fluentlenium.core.annotation.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class LoginSteps {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoginSteps.class);

    @Page
    private LoginPage loginPage;

    @Page
    private MainPageInteraction mainPageInteraction;

    @Step("user open login page")
    public void openLoginPage(){
        loginPage.open();
        LOGGER.info("user open login page");
    }

    @Step("clear user and password")
    public void clearFields(){
        loginPage.inputUsername.type("");
        loginPage.inputPassword.type("");
    }

    @Step("enter credentials")
    public void enterCredentials(String username, String password){
        Serenity.setSessionVariable("username").to(username);
        loginPage.inputUsername.type(username);
        loginPage.inputPassword.type(password);
        LOGGER.atInfo().setMessage("enter credentials with username:{} and password:{}")
                .addArgument(username).addArgument(password).log();
        LOGGER.info("Otra forma si funciona:{}",username);
    }

    @Step("access the system")
    public void accessSystem(){
        //loginPage.btnLogin.waitUntilVisible().click();
        loginPage.getBtnByText("Iniciar sesión").waitUntilVisible().click();
    }

    @Step("validate login")
    public void validateLogin(){
        final String mensajeError = "Login errado";
        String name = Serenity.sessionVariableCalled("username");
        assertThat(mensajeError, mainPageInteraction.getTitleMainPage(), is(equalTo("Tablero")));
        LOGGER.info("Nombre usuario:{}",name);
    }

}
