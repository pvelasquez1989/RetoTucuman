package co.com.banistmo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class MenuPage extends PageObject {

    public static final Target MENU_SERVICES = Target.the("Menu of Services ").locatedBy("//*[@id='menutop']/ul/li[3]/a");
    public static final Target INFORMATION_TRAVEL = Target.the("Information travel ").locatedBy("//*[@id='menutop']/ul/li[3]/ul/li[1]/a");
    public static final Target ITEMS_LOST = Target.the("Items lost ").locatedBy("//*[@id='menutop']/ul/li[3]/ul/li[1]/ul/li[8]/a");
    private MenuPage(){

    }
}
