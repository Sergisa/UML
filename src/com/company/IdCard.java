package com.company;

import java.util.Date;

public class IdCard {
    private Date dateExpire;
    private int number;

    public IdCard(int n) {
        number = n;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int newNumber) {
        number = newNumber;
    }

    public Date getDateExpire() {
        return dateExpire;
    }

    public void setDateExpire(Date newDateExpire) {
        dateExpire = newDateExpire;
    }
}
