/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement.objs;

/**
 *
 * @author Lukas
 */
public class Course {
    
    private String courseName;
    private final double cost = 600;
    
    public Course(){
        this.courseName = "Null";
    }
    
    public Course(String name){
        this.courseName = name;
    }
    
    public String getName(){
        return courseName;
    }
    
    @Override
    public String toString(){
        return "Course Name: " + courseName + " - " + cost;
    }
}
