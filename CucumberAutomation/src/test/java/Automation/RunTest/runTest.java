package Automation.RunTest;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(
   //path of feature file
   features = "src/test/resources/CountNumber.feature",
   //path of step definition file
   glue = "src/test/Automation/Stepdefs/runTest"
   )

public class runTest {}
