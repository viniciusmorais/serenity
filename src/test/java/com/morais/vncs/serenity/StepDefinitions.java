package com.morais.vncs.serenity;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {
	int saldo, saque = 0;

	@Given("Clive has ${int} in his Current account")
	public void clive_has_$_in_his_current_account(Integer int1) {
		saldo = int1;
	}

	@When("he withdraws ${int} in cash")
	public void he_withdraws_$_in_cash(Integer int1) {
		saque = int1;
	}

	@Then("his remaining balance should be ${int}")
	public void his_remaining_balance_should_be_$(Integer int1) {
		assertEquals((int) int1, (int) saldo - saque);
	}
}