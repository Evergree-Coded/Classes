class Main {
  public static void main(String[] args) {
    /*Car c = new Car("Honda", 10, 256.0);
    double totalMileage = c.getCarMileage();
    System.out.println("Beginning Mileage: " + totalMileage);
    c.addCarMileage(50);
    System.out.println("End Mileage: " + c.getCarMileage());*/

    Person p = new Person();
    p.addPersonName("Nick");
    p.addPersonAge(22);

    System.out.println("Our person is named " + p.getPersonName() + " and their age is " + p.getPersonAge());
    
  }
}

