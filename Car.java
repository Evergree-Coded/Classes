public class Car{
  public String name;
  public int fuelAmount;
  public double mileage;
  
  public Car(String carName, int carFuelAmount, double carMileage)
  {
    name = carName; // "Honda"
    fuelAmount = carFuelAmount;// 10
    mileage = carMileage; //256
  }

  public double getCarMileage(){
      return mileage;
  }

  public void addCarMileage(double newMileage){
    mileage += newMileage;
  }
}