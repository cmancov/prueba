package co.com.choucair.certification.prueba.screenplay.questions;

import co.com.choucair.certification.prueba.screenplay.userinterfaces.PaginaXTTT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verify implements Question {

    public static Verify result(){
        return new Verify();
    }

    @Override
    public Object answeredBy(Actor actor){
        return Text.of(PaginaXTTT.LBL_MENU).answeredBy(actor).toString();
    }
}
