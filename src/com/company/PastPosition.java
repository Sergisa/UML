package com.company;

public class PastPosition {
    private String name;
    private Department department;

    public PastPosition(String position, Department dep) {
        name = position;
        department = dep;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department d) {
        department = d;
    }
}
