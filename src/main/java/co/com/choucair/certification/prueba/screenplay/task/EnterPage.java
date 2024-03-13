package co.com.choucair.certification.prueba.screenplay.task;

import co.com.choucair.certification.prueba.screenplay.userinterfaces.PaginaXTTT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;

public class EnterPage implements Task {
     public static EnterPage credentials() {
        return Tasks.instrumented(EnterPage.class);
    }
    @Override
    public <T extends Actor> void performAs (T actor){
         actor.attemptsTo(Enter.theValue("@andres2022_Screenplay").into(PaginaXTTT.TXT_USUARIO),
            Enter.theValue("1234567890*").into(PaginaXTTT.TXT_CONTRASENNA),
                 Click.on(PaginaXTTT.BTN_SING_IN));

    }
}

