import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.testng.Assert;

public class CarPrice {

  example.model.Car car;

  @When("^Car created$")
  public void createCar() {
     example.service.CarService service = new example.service.CarServiceImpl();
     car = service.createCar();
  }

  @Then("^Car price should be 0$")
  public void checkPrice() {
     Assert.assertEquals(car.getPrice(), 0);
  }
}
