package org.example;

import java.util.Scanner;

public class Main {
    public static boolean passwordValidation(String password){
        return  password.length()>=8 &&
                Character.isUpperCase(password.charAt(0)) &&
                password.charAt(password.length()-1) == '?' &&
                !password.contains(" ");
    }

    public static void main(String[] args) {
        System.out.printf("Şifrenizi oluşturun ");
        Scanner input = new Scanner(System.in);
        String password = input.nextLine();
        System.out.println(passwordValidation(password) ? "Geçerli, şifre oluşturuldu" : "Geçersiz, şifre oluşturulamadı");
    }
}