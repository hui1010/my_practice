package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {   // practice 1 & 2
        String name = "Huiyi";
         name = name.concat(" Skårner");
        System.out.println(name);
       // practice 3
        float a = 3.56f, b = 8.93f, result = 0;
         result = a + b;
        System.out.println(result);

        // practice 4
        Car audi = new Car();
        audi.brand = "Audi A6";
        audi.registrationNumber = "ABC 123";
        audi.maxSpeed = 120;
        audi.ownerName = "Anna Carlsson";

        //practice 5
        int score = 55;
        if (score >= 65) {
            System.out.println("you passed");
        }
        else {
            System.out.println("you did not pass");
        }

        //practice 6
        Scanner object = new Scanner(System.in);
        System.out.println("Enter your name");
        String yourName = object.nextLine();
        System.out.println("Your hobby is");
        String yourHobby = object.nextLine();
        System.out.println("Your name is: " + yourName +" and " + "your hobby is: " + yourHobby + ".");

    }
}
