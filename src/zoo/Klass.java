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
public class Klass {
    
     String answername;
        int number;
        int number1;
        boolean isEqual;

        List<Trainer> trainers = new ArrayList();
        int n;
        System.out.println("how many trainers want to make");
     n=input.nextInt();
        for (int i = 1; i <= n; i++) {
            Trainer t = new Trainer();
            System.out.println("Insert your first name please");
            answername = input.next();
            s.setName(answername);
            System.out.println("Insert your last name please");

            number = input.nextInt();
            s.setAge(number);
            System.out.println("Insert your age grade");
            number1 = input.nextInt();
            s.setGrade(number1);
            students.add(s);
            System.out.println(s);
    
    
    
    
    
    
}
