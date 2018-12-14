/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

/**
 *
 * @author Mohammedf
 */
public class DataTreeListing {
    
    String name;
    String phoneNumber;
    String emailAddress;
    String key;

    DataTreeListing leftChild;
    DataTreeListing rightChild;

    DataTreeListing(String firstName, String lastName, String phoneNumber, 
            String emailAddress) {

        this.name = firstName + " " + lastName;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.key = name.toUpperCase();

    }

}