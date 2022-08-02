package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/rediffmoneyMyPortfolio.feature",glue="stepdefinition",
dryRun=false,tags={"@tag1,@tag2,@tag3,@tag4,@tag5,@tag6,@tag7,@tag8"},
plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/Report.html"})
public class myPortfolioTestStocks extends AbstractTestNGCucumberTests {

}
