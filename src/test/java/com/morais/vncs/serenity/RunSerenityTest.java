package com.morais.vncs.serenity;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features",
		glue = "com.morais.vncs.serenity",
		tags = "not @wip")
		
public class RunSerenityTest {

}
