/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package input_number_character;
import java.util.*;
/**
 *
 * @author Phan Ha
 */
public class Scanner_String {
    public static void main(String[] args) throws Exception
     {String code, name; int age;
       Scanner t = new Scanner(System.in);
       System.out.print("Enter code = ");
       code = t.nextLine();
       System.out.print("Enter name = ");
       name = t.nextLine();
       System.out.print("Enter age = ");
       age = t.nextInt();

       System.out.println("code = " + code);
       System.out.println("name = " + name);
       System.out.println("age = " + age);
       
       
       
       

     }
  }