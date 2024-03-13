package co.com.choucair.certification.prueba.screenplay.task;

import co.com.choucair.certification.prueba.screenplay.userinterfaces.PaginaXTTT;
import co.com.choucair.certification.prueba.screenplay.userinterfaces.PaginaXTTT;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task {
    private PaginaXTTT paginaXTTT;

     public static OpenPage urlApp() {
        return Tasks.instrumented(OpenPage.class);
    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Open.browserOn(paginaXTTT));
    }
}

