/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Printtheareaoftworectangles {
     int lenght;
    int breath;

    tt(int l, int b) {
        this.lenght = l;
        this.breath = b;
    }

    public int area()
    {
        return lenght * breath;
    }
}
 public class Rectangle{
    public static void main(String[] args) {
        tt obj = new tt(4,5);
        tt obj1 = new tt(5,8);

        System.out.println(obj.area());
        System.out.println(obj1.area());





    }
}
