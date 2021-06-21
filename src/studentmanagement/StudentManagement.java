/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagement;

import java.util.ArrayList;
import java.util.Scanner;
import studentmanagement.objs.Course;
import studentmanagement.objs.Student;

/**
 *
 * @author Lukas
 */
public class StudentManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();
        int option = 0;
        Scanner kybd = new Scanner(System.in);

        ArrayList<Course> courses = new ArrayList<Course>();
        courses.add(new Course("History 101"));
        courses.add(new Course("Mathematics 101"));
        courses.add(new Course("English 101"));
        courses.add(new Course("Chemistry 101"));
        courses.add(new Course("Computer Science 101"));
        
        do{
            printMenu();
            option = kybd.nextInt();
            switch(option){
                case 1:
                    students = inputStudents(students, courses);
                    break;
                case 2:
                    printStudents(students);
                    break;
                case 3:
                    printCourses(courses);
                    break;
            }
        }while(option != 4);
    }

    public static void printMenu() {
        System.out.println("====== STUDENT MANAGEMENT SYSTEM ======");
        System.out.println("Options:");
        System.out.println("1.) Input new student");
        System.out.println("2.) View students");
        System.out.println("3.) View Courses");
        System.out.println("4.) Exit");
    }

    public static void printCourses(ArrayList<Course> courses) {
        System.out.println("AVAILABLE COURSES");
        for (int i = 0; i < courses.size(); i++) {
            System.out.println((i + 1) + " " + courses.get(i).getName());
        }
    }
    
    public static void printStudents(ArrayList<Student> students){
        System.out.println("STUDENTS");
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).toString());
        }
    }
    
    public static ArrayList<Student> inputStudents(ArrayList<Student> students, ArrayList<Course> courses){
        boolean valid = false;
        int numberOfStudents;
        Scanner kybd = new Scanner(System.in);
        
        System.out.println("How many students will be added?");
        do {
            numberOfStudents = kybd.nextInt();
            if (numberOfStudents <= 0) {
                System.out.println("Number of students must be greater than 0");
                valid = false;
            } else {
                valid = true;
            }
        } while (valid == false);
        kybd.nextLine();

        System.out.println("Inputting " + numberOfStudents + " students");
        Student s;
        String studentName;
        int studentID;
        int year;
        double balance;
        ArrayList<Course> studentCourses = new ArrayList<Course>();
        int courseNum;

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.print("Student Name: ");
            studentName = kybd.nextLine();
            System.out.print("Student ID: ");
            studentID = kybd.nextInt();
            System.out.print("Year: ");
            year = kybd.nextInt();
            System.out.print("Student Balance: ");
            balance = kybd.nextDouble();

            System.out.println("SELECT COURSES");
            printCourses(courses);
            System.out.println("0 to finish");

            do {
                courseNum = kybd.nextInt();
                switch (courseNum) {
                    case 1:
                        if (!studentCourses.contains(courses.get(0))) {
                            studentCourses.add(courses.get(0));
                        } else {
                            System.out.println("Already enrolled on that course");
                        }
                        break;
                    case 2:
                        if (!studentCourses.contains(courses.get(1))) {
                            studentCourses.add(courses.get(1));
                        } else {
                            System.out.println("Already enrolled on that course");
                        }
                        break;
                    case 3:
                        if (!studentCourses.contains(courses.get(2))) {
                            studentCourses.add(courses.get(2));
                        } else {
                            System.out.println("Already enrolled on that course");
                        }
                        break;
                    case 4:
                        if (!studentCourses.contains(courses.get(3))) {
                            studentCourses.add(courses.get(3));
                        } else {
                            System.out.println("Already enrolled on that course");
                        }
                        break;
                    case 5:
                        if (!studentCourses.contains(courses.get(4))) {
                            studentCourses.add(courses.get(4));
                        } else {
                            System.out.println("Already enrolled on that course");
                        }
                        break;
                }
            }while(courseNum != 0);
            s = new Student(studentName, studentID, year, balance, studentCourses);
            students.add(s);
        }
        return students;
    }

}
