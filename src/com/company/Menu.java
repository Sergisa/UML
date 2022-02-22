package com.company;

public class Menu {

    public static void showEmployees(Employee[] employees) {
        System.out.println("Список сотрудников:");
        for (Employee emp : employees) {
            if (emp != null) {
                System.out.println(emp.getName() + " - " + emp.getPosition());
            }
        }
    }
}
