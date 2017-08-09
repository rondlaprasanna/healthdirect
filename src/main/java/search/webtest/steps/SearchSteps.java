package search.webtest.steps;

import org.jbehave.core.annotations.Then;
import search.webtest.pages.SearchPage;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.pages.Pages;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.When;
import org.openqa.selenium.WebDriver;

/**
 * Created by RondlaP on 8/08/2017.
 */
public class SearchSteps {
    @Managed
    WebDriver driver;

    @ManagedPages
    Pages pages;

    @Given("a user opens the healthdirect application")
    public void open_health_direct_application(){
        pages.get(SearchPage.class).open();
    }

    @When("I search using $keyword")
    public void search_using_keyword(String keyword){
        pages.get(SearchPage.class).search_using_keyword(keyword);
    }


    @Then("I should get the results related to search $keyword")
    public void search_results_should_contain_keyword(String keyword){
        pages.get(SearchPage.class).search_results_should_contain_keyword(keyword);

    }
}
