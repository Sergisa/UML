package com.company;

import java.util.HashSet;
import java.util.Set;

public class Employee extends Man {
    private final Set<Room> room = new HashSet<>();
    private final Set<PastPosition> pastPosition = new HashSet<>();
    private Department department;
    private String position;
    private IdCard iCard;

    public Employee(String n, String s, String p) {
        name = n;
        surname = s;
        position = p;
    }

    public Set<Room> getRoom() {
        return room;
    }

    public void setRoom(Room newRoom) {
        room.add(newRoom);
    }

    public void deleteRoom(Room r) {
        room.remove(r);
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String newPosition) {
        position = newPosition;
    }

    public IdCard getIdCard() {
        return iCard;
    }

    public void setIdCard(IdCard c) {
        iCard = c;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Set<PastPosition> getPastPosition() {
        return pastPosition;
    }

    public void setPastPosition(PastPosition p) {
        pastPosition.add(p);
    }

    public void deletePastPosition(PastPosition p) {
        pastPosition.remove(p);
    }
}
