package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static Scanner in = new Scanner(System.in);
    public static ArrayList<HashMap<String, String>> studentList = new ArrayList<>();

    public static void main(String[] args) {

        // let's create 4 different hashmaps that contain information about students:

        // studentOne (firstName=Bob, lastName=Drummond, course=Spanish101)
        HashMap<String, String> studentOne = new HashMap<>();
        studentOne.put("firstName", "Bob");
        studentOne.put("lastName", "Drummond");
        studentOne.put("course", "Spanish101");

        // check your expectations:
//        System.out.println(studentOne.get("firstName")); // what does this print?
//        System.out.println(studentOne.get("lastName")); // what does this print?
//        System.out.println(studentOne.get("course")); // what does this print?

        // studentTwo (firstName=Tina, lastName=Turner, course=English101)
        HashMap<String, String> studentTwo = new HashMap<>();
        studentTwo.put("firstName", "Tina");
        studentTwo.put("lastName", "Turner");
        studentTwo.put("course", "English101");

        // studentThree (firstName=Fred, lastName=Flinstone, course=English101)
        HashMap<String, String> studentThree = new HashMap<>();
        studentThree.put("firstName", "Fred");
        studentThree.put("lastName", "Flintstone");
        studentThree.put("course", "English101");

        // studentFour (firstName=Bob, lastname=Hope, course=Spanish101
        HashMap<String, String> studentFour = new HashMap<>();
        studentFour.put("firstName", "Bob");
        studentFour.put("lastName", "Hope");
        studentFour.put("course", "Spanish101");

        // now let's pull all four of our student hashmaps into the static array list:
        studentList.add(studentOne);
        studentList.add(studentTwo);
        studentList.add(studentThree);
        studentList.add(studentFour);

        System.out.println(studentOne.keySet());
        System.out.println(studentOne.values());
        // prompt for input
        System.out.println("Enter a search term:");
        String userInput = in.nextLine();

        ArrayList<HashMap<String, String>> searchedStudents = searchUsingInput(userInput);
        // loop through ArrayList and then loop through each HashMap to print out each key value pair
        for(HashMap<String, String> currentStudent : searchedStudents) {
            System.out.println("-------");
            for(String key : currentStudent.keySet()) {
                System.out.println(key + ": " + currentStudent.get(key));
            }
            System.out.println("-------");
        }
    }

    public static ArrayList<HashMap<String, String>> searchUsingInput(String searchInput) {

        ArrayList<HashMap<String, String>> students = new ArrayList<>();

        for(HashMap<String, String> student : studentList) {
            for(String value : student.values()) {
                if(value.contains(searchInput)) {
                    students.add(student);
                    // searchInput matching 1 value is sufficient to add in student to students
                    break;
                }
            }
        }

        return students;
    }
}
