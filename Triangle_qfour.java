/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Triangle_qfour {
    int s1,s2,s3;
    public Triangle_qfour(int side1,int side2,int side3)
     {
        s1=side1;
        s2=side2;
        s3=side3;
     }
       public static void main(String[] args)
       {
             Triangle_qfour t1=new Triangle_qfour(3,4,5);
             int peri=(t1.s1+t1.s2+t1.s3);
             System.out.println("perimeter is:"+peri);
             int sp=(peri/2);
             int ar=((((sp*(sp-t1.s1))*(sp-t1.s2))*(sp-t1.s3)));       
             int area=(int)Math.sqrt(ar);   
             System.out.println("Area is:"+area);
        }
}
