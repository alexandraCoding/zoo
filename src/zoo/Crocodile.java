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
public class Crocodile extends Animal{
int legs;
    public void printVariables(){
    System.out.println("name is "+name);
    System.out.println("age is "+age);
    System.out.println("cage is  "+cage);
}
public Crocodile(){
    System.out.println("crocodile created");}
public Crocodile(String name, int age){
super(name,age);
}
public void play(){
    super.play();
    System.out.println("Crocodile is playing");}


    @Override
    public String toString() {
        return super.toString()+ "Crocodile{" + "legs=" + legs + '}';
    }

     public static Crocodile getOldestCrocodile(List<Crocodile>crocodiles){
  Crocodile max=crocodiles.get(0);
      for (Crocodile i:crocodiles){
      if (i.getAge()>max.getAge()){
      max=i;
      } 
  }return max;}
    
}