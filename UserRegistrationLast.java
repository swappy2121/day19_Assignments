package com.Bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationLast {
        static Scanner scanner = new Scanner(System.in);

        public void firstName() {
            System.out.println("Enter the first name: ");
            String name = scanner.next();
            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
            Matcher match = pattern.matcher(name);

            if (match.matches()) {
                System.out.println("Name is valid");
            } else {
                System.out.println("Name is invalid, Try with another name.");
            }
        }

        public void lastName(){
            System.out.println("Enter the last name: ");
            String name = scanner.next();
            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,}$");
            Matcher match = pattern.matcher(name);

            if (match.matches()) {
                System.out.println("Name is valid");
            } else {
                System.out.println("Name is invalid, Try with another name.");
            }
        }

        public static void main(String[] args) {

            com.Bridgelabz.UserRegistrationLast check = new com.Bridgelabz.UserRegistrationLast();
            check.firstName();
            check.lastName();
        }
    }

