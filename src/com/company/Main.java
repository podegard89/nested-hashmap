package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        // let's create 4 different hashmaps that contain information about students:

        // studentOne (firstName=Bob, lastName=Drummond, course=Spanish101
        HashMap<String, String> studentOne = new HashMap<>();
        studentOne.put("firstName", "Bob");
        studentOne.put("lastName", "Drummond");
        studentOne.put("course", "Spanish101");

        // check your expectations:
//        System.out.println(studentOne.get("firstName")); // what does this print?
//        System.out.println(studentOne.get("lastName")); // what does this print?
//        System.out.println(studentOne.get("course")); // what does this print?

        // studentTwo (firstName=Tina, lastName=Turner, course=English101
        HashMap<String, String> studentTwo = new HashMap<>();
        studentTwo.put("firstName", "Tina");
        studentTwo.put("lastName", "Turner");
        studentTwo.put("course", "English101");

        // studentThree (firstName=Fred, lastName=Flinstone, course=English101)
        HashMap<String, String> studentThree = new HashMap<>();
        studentThree.put("firstName", "Fred");
        studentThree.put("lastName", "Flinstone");
        studentThree.put("course", "English101");

        // studentFour (firstName=Bob, lastname=Hope, course=Spanish101
        HashMap<String, String> studentFour = new HashMap<>();
        studentFour.put("firstName", "Bob");
        studentFour.put("lastName", "Hope");
        studentFour.put("course", "Spanish101");

        // now let's pull all four of our student hashmaps into an array list:
        ArrayList<HashMap<String, String>> studentList = new ArrayList<>();
        studentList.add(studentOne);
        studentList.add(studentTwo);
        studentList.add(studentThree);
        studentList.add(studentFour);

        // check your expectations:
//        System.out.println(studentList.get(0).get("firstName")); // what does this print?
//        System.out.println(studentList.get(1).get("firstName")); // what does this print?
//        System.out.println(studentList.get(2).get("firstName")); // what does this print?

        // further expectation checking:
//        System.out.println(studentList.get(3).get("course")); // what does this print?

        // now let's loop through all the students in our ArrayList printing their first names:
//        for(int i = 0; i < studentList.size(); i++) {
//            HashMap<String, String> currentStudent = studentList.get(i);
//            System.out.println(currentStudent.get("firstName"));
//        }

        // alternate syntax using an enhanced for loop:
//        for(HashMap<String, String> currentStudent : studentList) {
//            System.out.println(currentStudent.get("firstName");
//        }

        // now let's loop through all the students in our ArrayList printing their course:
//        for(HashMap<String, String> currentStudent : studentList) {
//            System.out.println(currentStudent.get("course"));
//        }

        // now let's loop through all the students in our ArrayList and loop through all their keys associated with that HashMap
//        for(HashMap<String, String> currentStudent : studentList) {
//            for(String key : currentStudent.keySet()) {
//                System.out.println(key);
//            }
//        }

        // now let's loop through allt he students in our ArrayList and loop through all the values associated with the key in that HashMap
//        for(HashMap<String, String> currentStudent : studentList) {
//            for(String key : currentStudent.keySet()) {
//                System.out.println(currentStudent.get(key));
//            }
//        }

        // now let's loop through all the students in our ArrayList printing out their key value pairs
//        for(HashMap<String, String> currentStudent : studentList) {
//            for(String key : currentStudent.keySet()) {
//                System.out.println(key + ": " + currentStudent.get(key));
//            }
//        }
    }
}
