/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritenceaddition;

/**
 *
 * @author Rishan Aziz
 */

import java.util.Scanner;

public class Addition extends Numbers
{
    int num1;
    int num2;
    int Sum, Sum1;

    Scanner input = new Scanner(System.in);

    Addition()
    {
        
    }

    Addition(int n1, int n2) {

        super(n1,n2);

    }

    void Calculation1()
    {
        super.SetNumber();
        Sum = Num1 + Num2;
    }

    void Calculation2()
    {
        System.out.println("Plase enter the first number : ");
        num1 = input.nextInt();
        System.out.println("Please enter the second number : ");
        num2 = input.nextInt();
        Sum1 = num1 + num2;
    }


    void DisplayTotal()
    {
        super.Display();
        System.out.println("Total : " + Sum);
    }

    void DisplayTotal1()
    {
        System.out.println("Total : " + Sum1);
    }
}
