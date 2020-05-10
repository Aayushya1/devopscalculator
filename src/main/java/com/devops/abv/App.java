package com.devops.abv;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Integer a = 50;
        Integer b = 40;
        System.out.println("Output for the addition is : "+addition(a,b));

        System.out.println("Output for the subtraction is : "+subtraction(a,b));

        System.out.println("Output for the Multiplication is : "+multiplication(a,b));

        System.out.println("Output for the Division is : "+division(Double.valueOf(a),Double.valueOf(b)));

    }

    public static Integer addition(Integer a,Integer b){ return a+b;}

    public static Integer subtraction(Integer a,Integer b){return  a-b;}

    public static Integer multiplication(Integer a,Integer b){return a*b;}

    public static Double division(Double a,Double b){return  a/b;}

}
