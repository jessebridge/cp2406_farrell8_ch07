import sun.security.util.Password;

import javax.swing.*;
import java.util.Scanner;

public class ValidatePassword {
    public static void main(String[] args) {
        String password = JOptionPane.showInputDialog("Enter a password that has 2 lower case, 2 upper case, and 2 numbers");
        int stringlength = password.length();
        System.out.println(password);
        int numberOfLowerCase = findlowercase(password,stringlength);
        int numberOfUpperCase = findUpperCase(password,stringlength);
        int numberOfNumbers = findAmountOfNumbers(password,stringlength);

        while (numberOfLowerCase < 2 || numberOfUpperCase < 2 || numberOfNumbers < 2){
            if (numberOfLowerCase < 2){
                System.out.println("The Password requires 2 lower case characters");
            }
            else if(numberOfUpperCase < 2){
                System.out.println("The password requires 2 upper case characters");
            }
            else{
                System.out.println("The password requires 2 numbers");
            }
            password = JOptionPane.showInputDialog("Enter a password that has 2 lower case, 2 upper case, and 2 numbers");
            stringlength = password.length();
            numberOfLowerCase = findlowercase(password,stringlength);
            numberOfUpperCase = findUpperCase(password,stringlength);
            numberOfNumbers = findAmountOfNumbers(password,stringlength);
        }
        System.out.println("password: " + password + " Has been accepted");
    }

    private static int findAmountOfNumbers(String password, int stringlength) {
        int numbers = 0;
        for (int i = 0; i < stringlength; i++) {
            if (Character.isDigit(password.charAt(i))) {
                numbers++; }
        }
        return numbers;
    }

    private static int findlowercase(String password, int stringlength) {
        int lowerCase = 0;
        for (int i = 0; i < stringlength; i++) {
            if (Character.isLowerCase(password.charAt(i))) {
                lowerCase++;
            }
        }

        return lowerCase;
    }
    private static int findUpperCase(String password, int stringlength) {
        int Uppercase = 0;
        for (int i = 0; i < stringlength; i++) {
            if (Character.isUpperCase(password.charAt(i))) {
                Uppercase++; }
        }
        return Uppercase;
    }}
