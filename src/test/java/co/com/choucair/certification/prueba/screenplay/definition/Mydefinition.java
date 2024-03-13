package co.com.choucair.certification.prueba.screenplay.definition;


import co.com.choucair.certification.prueba.screenplay.questions.Verify;
import co.com.choucair.certification.prueba.screenplay.task.EnterPage;
import co.com.choucair.certification.prueba.screenplay.task.OpenPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;


public class Mydefinition {

  @Before
  public void startScenario(){
    OnStage.setTheStage(new OnlineCast());
  }

@Given("I enter with my credentials")
public void iEnterWithMyCredentials() {
  OnStage.theActorCalled("Crihstian").wasAbleTo(OpenPage.urlApp());
}
@When("I proceed with the authentication")
public void iProceedWithTheAuthentication() {
    OnStage.theActorInTheSpotlight().attemptsTo(EnterPage.credentials());
}
  @Then("go to the main view of the page")
  public void goToTheMainViewOfThePage() {
    OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verify.result(), Matchers.equalTo("MENU")));
  }
}

