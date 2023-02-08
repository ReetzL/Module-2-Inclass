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
public class EmployeeTest {
    public static void main(String[] args) {
      Employee emp1 = new Employee("Lebron", "James", 100000.00);
      Employee emp2 = new Employee("Steph", "Curry", 60000.00);
        
        
        // OUTPUT OF BOTH EMPLOYEE'S
        // Emp1:
        System.out.print("Employee 1 - Name:\t");
        System.out.println(emp1.getFname() + " " + emp1.getLname());
        
        System.out.print("Employee 1 - Salary:\t");
        System.out.println(emp1.getSalary());
        
        // Emp2:
        System.out.print("Employee 2 - Name:\t");
        System.out.println(emp2.getFname() + " " + emp2.getLname());
        
        System.out.print("Employee 2 - Salary:\t");
        System.out.println(emp2.getSalary());
        
        
        // THE RAISE THEY BOTH GET:
        emp1.getSalary();
        emp2.getSalary();
        
        System.out.println("\nAfter Raise:");
        System.out.print("Employee 1 - Salary:\t");
        System.out.println(emp1.getSalary());
        System.out.print("Employee 2 - Salary:\t");
        System.out.println(emp2.getSalary());
        
    }
}
