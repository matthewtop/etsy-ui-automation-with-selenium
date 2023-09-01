package pl.globallogic.etsy.features;

import org.testng.annotations.Test;

public class SearchResultFilteringTest {

    //WebDriver
    //LandingPage
    //SearchResultsPage

    @Test
    public void searchResultPriceFitPriceRangeAfterFiltering(){

    }

    @Test
    public void freeShippingTagNeedToBePresentAfterFiltering(){

    }

    @Test
    public void searchResultPageContentNotChangedIfFilterApplicationCanceled(){

    }

    @Test
    public void colorSelectionOptionShouldBeAvailableInItemDetailsViewAfterFilteringByColor(){
        //go to landing page
        //search for item
        //wait for search result to be loaded
        //expand filtering panel
        //select required filters (by free shipping)
        //apply selected filters
        //wait for search result to be filtered
        //go to 1st result item details view
        //verify color selection element contains required color

    }

    //ship to country filtering -> check if item details contains expected country fo shipping
    @Test
    public void filteredShippingCountryShouldBePresentInShippingDestinationOptions(){
        //go to landing page
        //search for item
        //wait for search result to be loaded
        //expand filtering panel
        //select required filters (by shipping country)
        //apply selected filters
        //wait for search result to be filtered
        //go to 1st result item details view
        //verify shipping destination selection element contains required country

    }
}
