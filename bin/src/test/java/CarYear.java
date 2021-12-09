import io.cucumber.java.en.Then;
import org.testng.Assert;

import example.model.Car;

public class CarYear {
/*
  example.model.Car car;

  @When("^Car created$")
  public void createCar() {
     example.service.CarService service = new example.service.CarServiceImpl();
     car = service.createCar();
  }
*/
  @Then("Car year should be 0")
  public void checkYear() {
    example.service.CarService service = new example.service.CarServiceImpl();
    example.model.Car car = service.createCar();
     Assert.assertEquals(car.getYear(), 0);
  }
}
