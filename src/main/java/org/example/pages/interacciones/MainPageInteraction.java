package org.example.pages.interacciones;

import net.thucydides.core.pages.PageObject;
import org.example.pages.mapeos.MainPage;
import org.fluentlenium.core.annotation.Page;

public class MainPageInteraction extends PageObject {

    @Page
    private MainPage mainPage; //instancia el elemento Mainpage y se lo asigna a la variable

    public String getTitleMainPage() {
        return mainPage.txtTitleMainPage.waitUntilVisible().getText();
    }

}