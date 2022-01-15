public class Person{
  public String name;
  public int age;
  public int grade;

  public Person(){
    name = "";
    age = 0;
    grade = 0;
  }

  public String getPersonName(){
    return name;
  }
  public int getPersonAge(){
    return age;
  }
  public int getPersonGrade(){
    return grade;
  }

  public void addPersonName(String newName){
    name = newName;
  }
  public void addPersonAge(int newAge){
    age = newAge;
  }
  public void addPersonGrade(int newGrade){
    grade = newGrade;
  }
}