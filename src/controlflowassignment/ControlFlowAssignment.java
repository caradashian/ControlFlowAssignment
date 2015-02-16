/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlflowassignment;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author carateresa
 */
public class ControlFlowAssignment {

    public static void main(String[] args) {
       getPersonDrivingData();
       studentTestManager();
       studentGradeManager();
       getPersonAgeOfMajorityData();
       oddEvenTester();
       getData();

    }

//<editor-fold defaultstate="collapsed" desc="Question 1">
    private static void getPersonDrivingData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = input.nextLine();

        System.out.println("And your age, please:");
        int age = input.nextInt();

        if (checkDrivingEligibility(age)) {
            System.out.println("Congratulations," + name + "you are able to apply for a driver’s license!");
        } else {
            System.out.println("Sorry," + name + "you are not able to drive yet.");

        }
    }

    private static boolean checkDrivingEligibility(int age) {
        return (age >= 16) == true;

    }
//</editor-fold>  

//<editor-fold defaultstate="collapsed" desc="Question 2">
    private static void oddEvenTester() {
        System.out.println("Even/Odd");
        Scanner input = new Scanner(System.in);

        int i = 22;

        do {
            System.out.println("Please enter a number");
            i = input.nextInt();

            if (isEven(i)) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
            String msg = isEven(i) ? "Really even" : "Really, really Privett";
            System.out.println(msg);

            System.out.println("Number = " + i);

        } while (i != 0);

    }

    private static boolean isEven(int value) {
        return (value % 2) == 0;
    }

//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Question 3">
    private static void studentTestManager() {
        Scanner input = new Scanner(System.in);
        System.out.println("Student Grade");
        System.out.println("---------------");
        studentGradeIfThenElse("Jane", 87);
        studentGradeIfThenElse("Peter", 82);
        studentGradeIfThenElse("Zeeshan", 91);
        studentGradeIfThenElse("Stephan", 68);
        studentGradeIfThenElse("Helen", 97);
        studentGradeIfThenElse("Joe", 78);
        studentGradeIfThenElse("Lindsay", 75);

    }

    private static void studentGradeIfThenElse(String studentName, int mark) {

        if (mark < 50) {
            System.out.println(studentName + ":" + "  " + mark + "  " + "F");
        } else if (mark < 65) {
            System.out.println(studentName + ":" + "  " + mark + "  " + "D");
        } else if (mark < 70) {
            System.out.println(studentName + ":" + "  " + mark + "  " + "C-");
        } else if (mark < 80) {
            System.out.println(studentName + ":" + "  " + mark + "  " + "C");
        } else if (mark < 90) {
            System.out.println(studentName + ":" + "  " + mark + "  " + "B");
        } else if (mark < 100) {
            System.out.println(studentName + ":" + "  " + mark + "  " + "A");
        }

    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Question 4">
    private static void studentGradeManager() {
//        Scanner input = new Scanner(System.in);
        System.out.println("Student   Grade   Message");
        System.out.println("--------------------------");

        printGradeMessage("Jane", "A");
        printGradeMessage("Peter", "C");
        printGradeMessage("Zeeshan", "B");
        printGradeMessage("Stephan", "B");
        printGradeMessage("Helen", "A");
        printGradeMessage("Joe", "C-");
        printGradeMessage("Lindsay", "F");

    }

    private static void printGradeMessage(String studentName, String grade) {

        if (grade == "A") {
            System.out.println(studentName + "   " + grade + "   " + "Excellent work!");
        } else if (grade == "B") {
            System.out.println(studentName + "   " + grade + "   " + "Well done.");
        } else if (grade == "C") {
            System.out.println(studentName + "   " + grade + "   " + "Well done.");
        } else if (grade == "C-") {
            System.out.println(studentName + "   " + grade + "   " + "Passing grade.");
        } else if (grade == "D") {
            System.out.println(studentName + "   " + grade + "   " + "Pass, but additional work required.");
        } else if (grade == "F") {
            System.out.println(studentName + "   " + grade + "   " + "Failing grade");

        } else {
            System.out.println("Invalid grade.");
        }
    }
    //</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Question 5">
    private static void getPersonAgeOfMajorityData() {
        Scanner input = new Scanner(System.in);
        int a = 0;
        
        do {
            System.out.println("Please enter your name");
            String name = input.nextLine();
            
            System.out.println("And your province of residence:");
            String provinceCode = input.nextLine();
            
            System.out.println("And your age, please:");
            int age = input.nextInt();
            
            if (checkAgeOfMajorityEligibility(age, provinceCode)) {
                System.out.println("Congratulations," + name + " you are legally considered an adult!");
            } else {
                System.out.println("Sorry, " + name + " you are not considered an adult under law.");
            }
            String msg = checkAgeOfMajorityEligibility(age, provinceCode) ? "Really even" : "Really, really Privett";
            System.out.println(msg);
            
        } while (a != 0);
        
    }
    
    private static boolean checkAgeOfMajorityEligibility(int age, String provinceCode) {
        if (provinceCode.equals("AB")) {
            return age >= 18;
        } else if (provinceCode.equals("BC")) {
            return age >= 19;
            
        } else if (provinceCode.equals("SK")) {
            return age >= 18;
            
        } else if (provinceCode.equals("MN")) {
            return age >= 18;
            
        } else if (provinceCode.equals("ON")) {
            return age >= 19;
            
        } else if (provinceCode.equals("PQ")) {
            return age >= 18;
            
        } else if (provinceCode.equals("NB")) {
            return age >= 18;
            
        } else if (provinceCode.equals("NF")) {
            return age >= 19;
            
        } else if (provinceCode.equals("NS")) {
            return age >= 19;
            
        } else if (provinceCode.equals("PEI")) {
            return age >= 18;
            
        } else if (provinceCode.equals("NWT")) {
            return age >= 19;
            
        } else if (provinceCode.equals("YK")) {
            return age >= 19;
            
        } else if (provinceCode.equals("NVT")) {
            return age >= 19;
            
        }
        return false;
        
    }
//</editor-fold>
    
//                            //<editor-fold defaultstate="collapsed" desc="Class Example Work">
    private static void getData() {
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me ye name:");
        String name = input.nextLine();
        System.out.println(name + "dsafa sdfsad");

        System.out.println("HOW MUCH WOOD");
        int woodCount = input.nextInt();

        if (woodCount > 10) {
            System.out.printf((" Wow, %d is a lot of wood!"), woodCount);
        } else {
            System.out.printf("Dude, %d is slothful...", woodCount);
        }

        String response = JOptionPane.showInputDialog("Which two people in your grade will get married to each other?");
        JOptionPane.showMessageDialog(null, String.format("Well, %s should be very happy (for a while) ", response));
        System.out.printf("Well, %s should be very happy (for a while) ", response);
    }
//</editor-fold>
}
