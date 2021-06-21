/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement.objs;

import java.util.ArrayList;

/**
 *
 * @author Lukas
 */
public class Student {
    
    private String studentName;
    private int studentID;
    private int yearEnrolled;
    private double studentBalance;
    private ArrayList<Course> courses;
    
    public Student(){
        this.studentName = "Null";
        this.studentID = 0;
        this.yearEnrolled = 0;
        this.studentBalance = 0;
        this.courses = new ArrayList<Course>();
    }
    
    public Student(String name, int id, int year, double balance, ArrayList<Course> courses){
        this.studentName = name;
        this.studentID = id;
        this.yearEnrolled = year;
        this.studentBalance = balance;
        this.courses = courses;
    }
    
    public String getName(){
        return studentName;
    }
    
    public int getID(){
        return studentID;
    }
    
    public int getYear(){
        return yearEnrolled;
    }
    
    public double getBalance(){
        return studentBalance;
    }
    
    public ArrayList<Course> getCourses(){
        return courses;
    }
    
    public double getTuition(){
        return courses.size() * 600;
    }
    
    public String getStringCourses(){
        String coursesString = "";
        for(int i = 0; i < courses.size(); i++){
            coursesString += courses.get(i).toString();
            coursesString += ", ";
        }
        
        return coursesString;
    }
    
    @Override
    public String toString(){
        return "Name: " + studentName + ", ID: " + studentID + ", Year: " + yearEnrolled + ", Balance: " + studentBalance + ", Courses: " + getStringCourses() + "Tuition: " + "$" + getTuition();
    }
    
}
