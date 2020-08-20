package co.com.banistmo.stepdefinitions;

import co.com.banistmo.questions.FileValidation;
import co.com.banistmo.tasks.SelectMenu;
import co.com.banistmo.userinterfaces.MenuPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnlineCast;


import static net.serenitybdd.screenplay.actors.OnStage.*;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static co.com.banistmo.util.WebDriver.chrome;

public class BanistmoStepDefinitions {

    @Before
    public void init() {
        setTheStage(OnlineCast.ofStandardActors());
    }


    @Given("^the user need to enter the tucumenpanama page$")
    public void theUserNeedToEnterTheTucumanPanamaPage() {

        theActorCalled("user");
        theActorInTheSpotlight().can(BrowseTheWeb.with((chrome())));
    }


    @When("^the user search the infomation travel$")
    public void theUserSearchTheInformationTravel() {

        theActorInTheSpotlight().attemptsTo(SelectMenu.SearchOption());
    }

    @Then("^the user should see the file pdf correctly$")
    public void theUserShouldSeeTheFilePdfCorrectly() {

        theActorInTheSpotlight().should(GivenWhenThen.seeThat(FileValidation.isVisible()));

    }
}