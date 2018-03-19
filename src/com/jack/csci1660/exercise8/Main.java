package com.jack.csci1660.exercise8;


/*
Add a class to the previous exercise that represents a collection of contacts, both of the base class and the derived
class. The collection class should include a single method to add a contact, regardless of class, to the collection -
this demonstrates upcasting. The collection class should also include a method to iterate through the contacts and call
their display methods - this demonstrates late binding.
 */

public class Main {

    public static void main(String[] args) {
        ContactCollection cList = new ContactCollection();

        cList.addContact(new Contact("Person1", "uno@one.com"));
        cList.addContact(new BusinessContact("Person2", "zwei@two.com", "222-222-2223"));
        cList.addContact(new Contact("Person3", "notcreativeenough@forthis.com"));
        cList.addContact(new BusinessContact("Person4", "someother@email.com", "444-454-4422"));

        cList.displayAll();
    }
}
