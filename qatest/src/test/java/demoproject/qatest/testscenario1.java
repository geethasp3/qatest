package demoproject.qatest;

import org.junit.Test;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class testscenario1 {
	
	
	
	@Given("^this is teh first step$")
	public void this_is_teh_first_step() {
	  System.out.println("first step of the scenario1");
	}

	@When("^we use the second stpe$")
	public void we_use_the_second_stpe()  {
		System.out.println("second step of the scenario1");
	   	}
@Test
	@Then("^we get the third step$")
	public void we_get_the_third_step() {
		System.out.println("thrid step of the scenario1");
	}

	@Given("^this is teh first step for scenario2$")
	public void this_is_teh_first_step_for_scenario2(){
		System.out.println("first step of the scenario2");
	}

	@When("^we use the second stpe for scenario2$")
	public void we_use_the_second_stpe_for_scenario2() {
		System.out.println("second step of the scenario2");
	}

	@Then("^we get the third step for scenario2$")
	public void we_get_the_third_step_for_scenario2()  {
		System.out.println("third step of the scenario2");
		
	}
		
		@Given("^this is teh first step for scenario3$")
		public void this_is_teh_first_step_for_scenario3(){
			System.out.println("first step of the scenario1");		}

		@When("^we use the second stpe for scenario3$")
		public void we_use_the_second_stpe_for_scenario3() {
			System.out.println("second step of the scenario2");
		}

		@Then("^we get the third step for scenario3$")
		public void we_get_the_third_step_for_scenario3() {
			System.out.println("third step of the scenario3");
	}
}
