package com.jack.csci1660.exercise8;

import java.util.ArrayList;

/**
 * Created by brobst.30 on 3/19/18.
 */
public class ContactCollection {

    ArrayList<Contact> cList;

    public ContactCollection() {
        this.cList = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        this.cList.add(contact);
    }

    public void displayAll() {
        for (Contact c : cList) {
            c.displayContact();
        }
    }

}
