/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.inclass2;

/**
 *
 * @author itlabs
 */
public class Employee {
    private String fname;
    private String lname;
    private double salary;

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary > 0){
            this.salary = salary;
        }
        else {
            this.salary = 00.00;
        }
        
        
        
    }
    
    
}
