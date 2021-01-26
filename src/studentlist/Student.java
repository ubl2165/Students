/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentlist;

/**
 *
 * @author Ji Li Jan 26 2021
 */
public class Student {
    
    private String name;
    
    private int age;
    
    private String address = "GTA";
    
    public Student(){
        setName("Ji Li");
        setAge(18);
    }

    public Student(String name) {
        this.name = name;
        setAge(18);
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
       
    public String getName(){
        
        return name;    
    }
  
    public void setName(String name) {
        this.name = name;
    }
    
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }  

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
    
}
