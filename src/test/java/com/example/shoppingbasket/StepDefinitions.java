package com.example.shoppingbasket;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

  private Belly belly;

  @Given("I have {int} cukes in my belly")
  public void I_have_cukes_in_my_belly(int cukes) {
    belly = new Belly();
    belly.eat(cukes);
  }

  @When("I wait {int} hour")
  public void wait_one_hour(int number) {
    System.out.println(number);
  }

  @Then("my belly should grow!")
  public void my_belly_should_grow() {
    assertEquals(belly.size, 42);
  }
}
