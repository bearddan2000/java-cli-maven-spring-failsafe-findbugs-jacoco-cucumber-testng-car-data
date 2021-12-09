import io.cucumber.java.en.Then;

import org.testng.Assert;

import example.model.Car;

public class CarMake {
  @Then("Car make should be test")
  public void checkMake() {
    example.service.CarService service = new example.service.CarServiceImpl();
    example.model.Car car = service.createCar();
     Assert.assertEquals(car.getMake(), "test");
  }
}
