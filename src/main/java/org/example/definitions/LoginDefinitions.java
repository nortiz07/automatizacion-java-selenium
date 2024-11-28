package org.example.definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;
import org.example.steps.LoginSteps;

public class LoginDefinitions {

    @Steps
    private LoginSteps loginSteps;

    @Dado("que el usuario navega a la pagina de inicio de sesion")
    public void navegarPaginaInicioSesion() {
        loginSteps.openLoginPage();
        loginSteps.clearFields();
    }

    @Cuando("ingresa las credenciales de ingreso correctas")
    public void ingresaLasCredencialesDeIngresoCorrectas() {
        loginSteps.enterCredentials("admin","serenity");
        loginSteps.accessSystem();
    }

    @Entonces("debería ver la pagina principal")
    public void verPaginaPrincipal(){
        loginSteps.validateLogin();
    }
}
