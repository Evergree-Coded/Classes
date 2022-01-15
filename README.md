# Classes

Definition: A *class* is a software blueprint for implementing objects of a given type. 

- The methods of the class provide both the behaviors and the operations that manipulate the object

```java

public class BankAccount
{
  private String password;
  private double balance;


  //constructors
  /**Default constructor.
   * Constructs bank account with default values. */
   public BankAccount(){}

}
```

### Public, Private, and Static 
- Public methods and variables are able to be accessed and used by all client programs. (all cars have wheels)
- Private methods and variables can only be accessed by the methods of that class (only trucks have beds)
- Static methods and variables contain a value inside a class that is shared by all instances of the class only. (cars each have their own engine)

## Methods
Methods all have a certain header implementation

Example:
```java
public void withdraw(String password, double amount)
```
public: access specifier
void: return type
withdraw: method name
parameter list: (String password, double amount)

---

### Types of Methods within a class
1. constructor
- A * constructor* creates an object of the class. You can recognize a constructor by its name -- always the same name as the class. 

Example:
```java
public class Car{
  public String name;
  public int fuelAmount;
  public double mileage;
  
  public Car()
  {
    name = "Honda"; // "Honda"
    fuelAmount = 20;// 10
    mileage = 100; //256
  }

}
```

```java
Car c = new Car("Honda", 10, 256);
```

2. Accessors (getter methods)
- An *accessor method* is a public method that accesses a class object without altering the object. An accessor method returns information about the object. 

```java
public double getCarMileage(){
  return mileage;
}
```

```java
Car c = new Car("Honda", 10, 256.0);
double totalMileage = c.getCarMileage(); //256.0
```

**Note**
- The .operator (dot operator) indicates that getCarMileage() is a method of the Car class, which belongs to c. 
- A non-void method returns a single value specified in the header of the method

3. Mutator (setter methods)
- A *mutator method* changes the state of an object by modifying at least one of its instance variables. It is often a void method (i.e. has no return type).

```java
public void addCarMileage(double newMileage){
  mileage += newMileage;
}
```

```java
  Car c = new Car("Honda", 10, 256.0);
  c.addCarMileage(50); // mileage = 306
```



