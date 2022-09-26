package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:/Users/patel/eclipse-practiceQA/CucumberDataDriven/src/test/resources/LoginDemoFeature/LoginDemo.feature",
glue="stepDefinitions",
monochrome = true)
//plugin = {"pretty","html:target/HtmlReports/report.html","json:target/JsonReports/report.json,","junit:target/JUnitReports/report.xml"})


public class Test_DDRunner {

}
