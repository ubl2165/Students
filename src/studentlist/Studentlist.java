/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author Ji Li
 */

import java.util.Arrays;
import java.util.Scanner;

public class Studentlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        Student studentsArray[] = new Student[5];
        
        System.out.println("enter student names.");
        
        for (int i = 0; i < studentsArray.length; i++) {
            System.out.println("Please enter name for student " + (i+1));
            
            studentsArray[i] = new Student(input.nextLine());
        }
        
        System.out.println("Student Array is:");
        System.out.println(Arrays.toString(studentsArray));
        
        for (Student s: studentsArray) {
            System.out.println("Student name is: " + s);
        }
    }
    
}
