package co.com.banistmo.questions;

import co.com.banistmo.userinterfaces.FileDowload;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Visibility;

public class FileValidation implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(FileDowload.VALIDATION_PDF).viewedBy(actor).asBoolean();
    }
    public static FileValidation isVisible(){

        return new FileValidation();

    }
}
