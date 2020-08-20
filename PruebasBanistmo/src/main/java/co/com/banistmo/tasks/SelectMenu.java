package co.com.banistmo.tasks;

import co.com.banistmo.userinterfaces.FileDowload;
import co.com.banistmo.userinterfaces.MenuPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.chrome.ChromeDriver;

import static co.com.banistmo.userinterfaces.FileDowload.FILE_DOWLOAD;
import static co.com.banistmo.userinterfaces.MenuPage.*;
import static co.com.banistmo.util.SwitchWindow.switchWindow;

public class SelectMenu implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(MENU_SERVICES),
                Click.on(INFORMATION_TRAVEL),
                Click.on(ITEMS_LOST),
                Click.on(FILE_DOWLOAD)
                );
                switchWindow((ChromeDriver) BrowseTheWeb.as(actor).getDriver());

    }
    public static SelectMenu SearchOption(){
        return Tasks.instrumented(SelectMenu.class);
    }
}
