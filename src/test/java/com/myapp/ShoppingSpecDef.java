package com.myapp;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sun.security.util.PendingException;

import java.util.List;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

/**
 * Created by Hexad GmbH on 21-10-2016.
 */
public class ShoppingSpecDef {

    private    Calculator calculator = new Calculator();

    @Given("^the following groceries:$")
    public void the_following_groceries(List<Product> products) throws Throwable {
        for (Product product : products) {
            calculator.addProductPrice(product.getPrice());

        }
        assertThat(calculator.getPrice()).isEqualTo(21);
    }

    @When("^I pay (\\d+)$")
    public void i_pay(double amountPaid) throws Throwable {
        calculator.setAmountPaid(amountPaid);
        assertThat(calculator.getAmountPaid()).isEqualTo(25);
    }

    @Then("^my change should be (\\d+)$")
    public void my_change_should_be(double change) throws Throwable {
      assertThat(calculator.getBalance()).isEqualTo(change);
    }

}
