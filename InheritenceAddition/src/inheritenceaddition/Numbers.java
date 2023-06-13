/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritenceaddition;

/**
 *
 * @author Rishan Aziz
 */
public class Numbers {

    int Num1;
    int Num2;

    Numbers()
    {

    }

    Numbers(int n1, int n2)
    {
        Num1 = n1;
        Num2 = n2;
    }

    void SetNumber()
    {
        Num1 = 2;
        Num2 = 3;
    }

    void Display()
    {
        System.out.println("Number 1 : " + Num1);
        System.out.println("Number 2 : " +  Num2);
    }

}
