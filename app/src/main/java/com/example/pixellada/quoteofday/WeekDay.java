package com.example.pixellada.quoteofday;

/**
 * Created by Pixellada on 2016-10-26.
 */
public class WeekDay {
    int number;
    char[]anArrayOfChars;
    anArrayOfChars[1]='Sunday';
    anArrayOfChars[2]='Monday';
    anArrayOfChars[2]='Tuesday';
    anArrayOfChars[2]='Wednesday';
    anArrayOfChars[2]='Thursday';
    anArrayOfChars[2]='Friday';
    anArrayOfChars[2]='Saturday';


    string[]anArrayOfStrings;
    anArrayOfStrings[1]='Q1';
    anArrayOfStrings[2]='Q2';
    anArrayOfStrings[3]='Q3';
    anArrayOfStrings[4]='Q4';
    anArrayOfStrings[5]='Q5';
    anArrayOfStrings[6]='Q6';
    anArrayOfStrings[7]='Q7';

    switch(number)

    {
        case (1):
            System.out.printl(anArrayOfStrings[1]);
            break;
        case (2):
            System.out.printl(anArrayOfStrings[2]);
            break;
        case (3):
            System.out.printl(anArrayOfStrings[3]);
            break;
        case (4):
            System.out.printl(anArrayOfStrings[4]);
            break;
        case (5):
            System.out.printl(anArrayOfStrings[5]);
            break;
        case (6):
            System.out.printl(anArrayOfStrings[6]);
            break;
        case (7):
            system.out.printl(anArrayOfStrings[7]);
            break;
    }


    Scanner sc=new Scanner(System.in);
    try
    {
        System.out.println("What day is it? Please input number 1-7 where 1 is Sunday and 7 is Saturday");
        //nextInt will throw InputMismatchException
        //if the next token does not match the Integer
        //regular expression, or is out of range
        int usrInput=sc.nextInt();
    }
    catch(InputMismatchException exception)
    {
        //Print "This is not an integer"
        //when user put other than integer
        System.out.println("This is not an integer");
    }
    While (number>7 | number<1){
        System.out.println("Error");
    }
}
