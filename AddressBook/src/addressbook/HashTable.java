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

// MF Hash Table 
 class HashTable {
   Node[] hTable= new Node[13];
    
//MF Adding to Hash Table    
public void insert(String firstName, String lastName, String emailAddress, String phoneNumber) {        
String fullName = nameCat(firstName, lastName);
        //MF Taskstream addition
        int hashNum = Math.abs(fullName.toUpperCase().hashCode()%13);
        //MF New node values assignment
        Node newNode = new Node(firstName,lastName,fullName, emailAddress, phoneNumber, hTable[hashNum]);
        hTable[hashNum] = newNode;
        System.out.println("Added hash Number = " + hashNum);
    }
    //MF Find requested values
    public void find(String firstName, String lastName){
        //MA print the names we are looking up so we can keep track of progress
        String name = nameCat(firstName, lastName);
        System.out.println("Trying to find = " + name);
        int hashNum = Math.abs(name.toUpperCase().hashCode()%13);
        Node counter = hTable[hashNum];
        String foundEmail = null;
        String foundPhone = null;
        boolean foundIt = false; 
        //MF Hash Check
        while (counter != null) {
            if (counter.getfullName().equals(name)) {
                foundEmail = counter.getemailAddress();
                foundPhone = counter.getphoneNumber();
                foundIt = true;
            }
            counter = counter.getNextNode();
        }
        if(foundIt == false) {
            System.out.println(firstName + " " + lastName + " Can't Be found.");
        }
        else if(foundIt == true) {
            System.out.println("Found: " + name + " " + foundEmail + " " + foundPhone);
        }
    }
    //MF Delete node based on first and last name parameters
    public void delete(String firstName, String lastName) {
        String name = nameCat(firstName, lastName);
        System.out.println("Delete = " + name);
        //MF Calculates the Hash
        int hashNum = Math.abs(name.toUpperCase().hashCode() % 13);
        //MF Set the counter to Hash number
        Node counter = hTable[hashNum];
        //MF Find the value in the first node
        if (counter.getfullName().equals(name)) {
            hTable [hashNum] = hTable [hashNum].getNextNode();
        }
        else while (counter != null) {
            //MF Find the value of the previous node 
            Node prevNode = hTable [hashNum];
            //MF Set present node to one after the first node
            Node mNode = prevNode.getNextNode();
            //MA check the node to make sure it matches our name
            if (counter.getfullName().equals(name)) {
                mNode = mNode.getNextNode();
                prevNode = mNode;
            }
            //MF Null Check: Resolves the  nullpointerexception on JohnDoe
            if (mNode != null){
                //MF Only run setNextNode if there is not a null value - otherwise end
                prevNode.setNextNode(mNode.getNextNode());
            }
            //MF if we don't find the name we were looking for - from a previous deletion - we don't do anything
            else System.out.println("Name: "  + firstName + " " + lastName + " Not found to delete");
            counter = counter.getNextNode();
        }
    }
    //MF  concatenates the first and last name
    public String nameCat(String firstName, String lastName){
        String fullName = firstName + lastName;
        return fullName;
    }
}