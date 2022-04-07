package runner1;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src\\test\\resources\\login1\\login1.feature"},
glue={"defination1"},
dryRun=false,
tags="@hello"
)
public class testrunner1 {
	
}
