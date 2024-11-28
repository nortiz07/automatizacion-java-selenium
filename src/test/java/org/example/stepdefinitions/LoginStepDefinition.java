package org.example.stepdefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinition {

    @Dado("que el usuario navega a la pagina de inicio de sesion")
    public void navegarPaginaInicioSesion() {
    }

    @Cuando("ingresa las credenciales de ingreso correctas")
    public void ingresaLasCredencialesDeIngresoCorrectas() {
    }

    @Entonces("debería ver la pagina principal")
    public void verPaginaPrincipal(){

    }
}
