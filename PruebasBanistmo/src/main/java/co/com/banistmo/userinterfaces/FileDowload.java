package co.com.banistmo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class FileDowload extends PageObject {

    public static final Target FILE_DOWLOAD = Target.the("Dowload Pdf items lost ").locatedBy("//*[@id='content']/article/p[5]/a/img");

    public static final Target VALIDATION_PDF = Target.the("Validation pdf").locatedBy("/html/body/embed");
}
