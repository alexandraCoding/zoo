/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.List;

/**
 *
 * @author alexa
 */
public class Animal {
 protected String name;
  protected int age;
 protected String cage;   

 public Animal(){System.out.println("Animal Created");}   
 public Animal(String name) {
        this.name = name;
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Animal(String name, int age, String cage) {
        this.name = name;
        this.age = age;
        this.cage = cage;
    }
 public String getName() {
        return name;
        
    }
  public int getAge(){
  return age;}
  
  public String getCage(){
      return cage;
  
  }
  public void setName(String name) {
        this.name = name;
    }
  public void setAge(int age) {
        this.age = age;
    }
  public void setCage(String cage) {
        this.cage = cage;
    }
  protected void move(){
      System.out.println("Anima; is moving");}
  protected void eat(){
      System.out.println("Anima; is eating");}
  protected void play(){
      System.out.println("Anima; is playing");}
  
  public static Animal getOldestAnimal(List<Animal>animals){
  Animal max=animals.get(0);
      for (Animal i:animals){
      if (i.getAge()>max.getAge()){
      max=i;
      } 
  }return max;}

  public static Crocodile getOldestCrocodile(List<Crocodile>crocodiles){
  Crocodile max=crocodiles.get(0);
      for (Crocodile i:crocodiles){
      if (i.getAge()>max.getAge()){
      max=i;
      } 
  }return max;}
  
  public void setValues(){
  name="haidi;";
  age=3;
   }
  
  public void printValues(){
      System.out.println("name is "+ name);
      System.out.println("age is "+ age);}
  
  public void printLocalValues(){
      String name="Jack";
      int age=9;
      System.out.println("name is "+ name);
      System.out.println("age is "+ age);}
  
    @Override
    public String toString() {
        return "Animal{" + "name=" + name + ", age=" + age + ", cage=" + cage + '}';
    }



}
  


