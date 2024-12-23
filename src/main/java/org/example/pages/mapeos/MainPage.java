package org.example.pages.mapeos;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.At;
import net.thucydides.core.pages.PageObject;

@At("https://demo.serenity.is") //Cuando inicie deberia estar en esa url
public class MainPage extends PageObject {

    @FindBy(xpath = "//main//h1")
    public WebElementFacade txtTitleMainPage;


}
