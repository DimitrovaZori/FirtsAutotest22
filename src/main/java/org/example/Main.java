package org.example;

public class Main {
    public static void main(String[] args) {
//        String firstName = "Ali";
//        String middleName = "N";
//        String lastName = "S";
//        String fullName = firstName + " " + middleName + " " + lastName;
//        int age = 16;
//        String address = "Varna, Mladost, 35str";
//        String mail = "zd@yahoo.com";
//        String phone = "+359 882";
//        System.out.println(fullName + " is " + age + " years old." + " The address is " + address + ".");
//        System.out.println("For more details: " + phone + " and " + mail);

        calculateAve(4, 6, 8);
        totalSalary(1000);
        monthly(24000, 60);

    }

    public static void calculateAve(int first, int second, int third) {
        int average = (first + second + third) / 3;
        System.out.println("The average sum is " + average);
    }

    public static void totalSalary(int money) {
        int period = 12;
        int totalSalary = money * period;
        System.out.println("For one year is " + totalSalary);

    }

    public static void monthly(int loan, int time) {
        int monthly = loan / time;
        int interestYear = 7;
        int years = time / 12;
        int totalAmount = loan * years * interestYear / 100 + loan;
        System.out.println("It is monhly " + monthly);
        System.out.println("It is all the sum with interest " + totalAmount);
    }
}