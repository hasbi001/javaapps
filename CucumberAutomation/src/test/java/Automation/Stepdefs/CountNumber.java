package Automation.Stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.jupiter.api.Assertions.*;

public class CountNumber {
	private int num1, num2, result;
	
	@Given("number {int} {int}")
	public void number(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	@When("add number")
	public void add_number() {
		this.result = num1+num2;  
	}
	
	@Then("compare result number")
	public void compare_result_number() {
		assertEquals(4,result);
	}
	
}
