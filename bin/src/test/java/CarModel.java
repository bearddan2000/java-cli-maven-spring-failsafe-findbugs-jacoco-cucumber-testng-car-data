import io.cucumber.java.en.Then;

import org.testng.Assert;

import example.model.Car;

public class CarModel {
  @Then("Car model should be test")
  public void checkModel() {
    example.service.CarService service = new example.service.CarServiceImpl();
    example.model.Car car = service.createCar();
     Assert.assertEquals(car.getModel(), "test");
  }
}
