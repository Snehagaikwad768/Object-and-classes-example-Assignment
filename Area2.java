/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class Area2 {
    int length,breadth;
Area2(int l, int b){
        length = l;
        breadth = b;
}
public int setDim(){
int results = length * breadth;
return results;
}
 public void getArea2(){
System.out.println("Area = " +  setDim());
}
public static void main(String []args){
Area2 x =new Area2(6,5);
x.getArea2();
    
}
}

