package testrunners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/login.feature",glue="stepdefinition",
dryRun=false,plugin={"com.cucumber.listener.ExtentCucumberFormatter:Reports/login.html"})
public class loginTest extends AbstractTestNGCucumberTests{

	
}
