import java.util.Scanner;

import static java.lang.Math.floor;

public class Main {
    public static void main(String[] args) {

        double fahrenheit = 0;
        double celsuis = 0;

        while (fahrenheit > -460){
            fahrenheit = temp(fahrenheit);
            if (fahrenheit > -460){
                celsuis = converter(fahrenheit);
                System.out.println(fahrenheit+" in celsuis rounded to the nearest integer is "+ celsuis);
            }
        }
        System.out.println("You have inputted a number below -460 program shutting down due to internal problems");
        System.out.println("Thank you for using my program...........");
    }







    static double temp(double fahrenheit){
        Scanner input = new Scanner(System.in);
        System.out.println("What temperature would you like to convert? Please make sure it is a number. ");
        fahrenheit = Integer.parseInt(input.nextLine());
        return fahrenheit;
    }

    static double converter(double fahrenheit){
        double celsuis = 0;
        celsuis = Math.floor((fahrenheit - 32)* 5/9);
        return celsuis;
    }




}