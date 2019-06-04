/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zoo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexa
 */
public class ZooMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Crocodile croco=new Crocodile();
        croco.play();
        croco.eat();
        croco.toString();
        System.out.println(croco);
        Zebra zebra=new Zebra();
        zebra.play();
        Lion lion=new Lion();
        lion.move();
   
   Animal a1=new Animal("Dogy",13);
   Animal a2=new Animal("Caty",18);
   Animal a3=new Animal("Frogy",15);
   
    List<Animal>animals=new ArrayList();
    animals.add(a1);
    animals.add(a2);
    animals.add(a3);
    
    //Animal.getOldestAnimal(animals).toString();
    Animal tempAnimal=Animal.getOldestAnimal(animals);
        System.out.println("Oldest animal is"+tempAnimal);
    
        Crocodile c1=new Crocodile("Luis",50);
        Crocodile c2=new Crocodile("Bob",70);
         List<Crocodile>crocodiles=new ArrayList();
         crocodiles.add(c1);
         crocodiles.add(c2);
         
         Animal crocodile=new Crocodile();
         Animal lion1=new Lion();
         Animal tiger=new Tiger();
         
         List<Animal>animals2=new ArrayList();
         animals2.add(crocodile);
         animals2.add(tiger);
         animals2.add(lion);
         
         for(Animal a:animals2){
         a.play();}
         
    Crocodile tempCrocodile=Animal.getOldestCrocodile(crocodiles);
        System.out.println("Oldest crocodile is"+tempCrocodile);
         
    }
    
}
