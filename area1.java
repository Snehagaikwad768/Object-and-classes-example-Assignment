/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;
public class area1 {
    int length;
    int breadth;
    area1(int a, int b)
    {
         length = a;
         breadth = b;
    }
    public int areareturn()
    {
        return length * breadth;
    }
}

public class Rectangle4 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the lenght of Recatangle");
         a = obj.nextInt();
        obj.nextLine();
        System.out.println("Enter the breadth of Recatangle");
        b = obj.nextInt();
        area ob1 = new area(a,b);
        System.out.println("Area = "+ ob1.areareturn());
    }
}
