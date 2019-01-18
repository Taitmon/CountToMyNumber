package com.company;

public class Main
{

    public static void main(String[] args)
    {
        java.util.Scanner userinput = new java.util.Scanner(System.in);
        System.out.println("Please enter a number you wish to count up to.");
        int maxCount = userinput.nextInt();
        System.out.println("You entered: " + maxCount);


        int counter = 0;
        while (counter <= maxCount)
        {
            System.out.println(counter++);

        }
    }
}
