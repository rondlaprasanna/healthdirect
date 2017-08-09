package search.webtest.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;



/**
 * Created by RondlaP on 8/08/2017.
 */
@DefaultUrl("https://www.healthdirect.gov.au")

public class SearchPage extends PageObject {

    @FindBy(css = "#search-form-node-desktop-mode > #header-search")
    WebElement SearchField;

    public void search_using_keyword(String keyword) {
        SearchField.sendKeys(keyword, Keys.ENTER);
    }

    public void search_results_should_contain_keyword(String keyword) {

        List<WebElement> results = getDriver().findElements(By.id("searchResults"));

        // Loop over the list to verify each result contains search keyword

        for (int i = 0; i < results.size(); i++) {
            Assert.assertEquals(results.get(i).getText().contains(keyword), true);
        }

    }
}
