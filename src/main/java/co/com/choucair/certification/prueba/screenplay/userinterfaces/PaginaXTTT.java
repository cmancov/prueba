package co.com.choucair.certification.prueba.screenplay.userinterfaces;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://colorlib.com/polygon/metis/login.html")
public class PaginaXTTT extends PageObject {
    public static final Target TXT_USUARIO= Target.the("Ingresar usuario").located(By.xpath("//input[@placeholder='Username']"));
    public static final Target TXT_CONTRASENNA= Target.the("Ingresar contraseña").located(By.xpath("//input[@placeholder='Password']"));
    public static final Target BTN_SING_IN = Target.the("Botón ingresar").located(By.xpath("//button[contains(text(),'Sign in')]"));
    public static final Target LBL_MENU = Target.the("Etiqueta Menu").located(By.xpath("//*[@id='menu']/li[1]"));
}
