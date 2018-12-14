/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

/**
 *
 * @author MohammedF
 */
public class Main {
    
    public static void main(String [] args){
        System.out.println("Testing Hash Table:");
        //MF Test Case  Hash Table
        HashTable testHT = new HashTable();
        testHT.insert("Bob", "Smith", "bsmith@somewhere.com", "555-235-1111");
        testHT.insert("Jane", "Williams", "jw@something.com", "555-235-1112");
        testHT.insert("Mohammed", "al-Salam", "mas@someplace.com", "555-235-1113");
        testHT.insert("Pat", "Jones", "pjones@homesweethome.com", "555-235-1114");
        testHT.insert("Billy", "Kidd", "billy_the_kid@nowhere.com", "555-235-1115");
        testHT.insert("H.", "Houdini", "houdini@noplace.com", "555-235-1116");
        testHT.insert("Jack", "Jones", "jjones@hill.com", "555-235-1117");
        testHT.insert("Jill", "Jones", "jillj@hill.com", "555-235-1118");
        testHT.insert("John", "Doe", "jdoe@somedomain.com", "555-235-1119");
        testHT.insert("Jane", "Doe", "jdoe@somedomain.com", "555-235-1120");
        testHT.find("Pat", "Jones");
        testHT.find("Billy", "Kidd");
        testHT.delete("John", "Doe");
        testHT.insert("Test", "Case", "Test_Case@testcase.com", "555-235-1121");
        testHT.insert("Nadezhda", "Kanachekhovskaya", "dr.nadezhda.kanacheckovskaya@somehospital.moscow.ci.ru", "555-235-1122");
        testHT.insert("Jo", "Wu", "wu@h.com", "555-235-1123");
        testHT.insert("Millard", "Fillmore", "millard@theactualwhitehouse.us", "555-235-1124");
        testHT.insert("Bob", "vanDyke", "vandyke@nodomain.com", "555-235-1125");
        testHT.insert("Upside", "Down", "upsidedown@rightsideup.com", "555-235-1126");
        testHT.find("Jack", "Jones");
        testHT.find("Nadezhda", "Kanachekhovskaya");
        testHT.delete("Jill", "Jones");
        testHT.delete("John", "Doe");
        testHT.find("Jill", "Jones");
        testHT.find("John", "Doe");
        System.out.println();
        System.out.println("Hash test complete");
        System.out.println();
        System.out.println("Testing Tree:");
    }
   
    public static void testDataTree(){
        //MF Test Case Data Tree
        DataTree testtree = new DataTree();
        System.out.println(" Testing Data Tree ");
        testtree.insert("Bob", "Smith", "555-235-1111", 
                "bsmith@somewhere.com");
        testtree.insert("Jane", "Williams", "555-235-1112", 
                "jw@something.com");
        testtree.insert("Mohammed", "al-Salam", "555-235-1113", 
                "mas@someplace.com");
        testtree.insert("Pat", "Jones", "555-235-1114", 
                "pjones@homesweethome.com");
        testtree.insert("Billy", "Kidd", "555-235-1115", 
                "billy_the_kid@nowhere.com");
        testtree.insert("H.", "Houdini", "555-235-1116", 
                "houdini@noplace.com");
        testtree.insert("Jack", "Jones", "555-235-1117", "jjones@hill.com" );
        testtree.insert("Jill", "Jones", "555-235-1118", "jillj@hill.com");
        testtree.insert("John", "Doe", "555-235-1119", "jdoe@somedomain.com");
        testtree.insert("Jane", "Doe", "555-235-1120", "jdoe@somedomain.com");
        testtree.lookup("Pat", "Jones");
        testtree.lookup("Billy", "Kidd");
        testtree.delete("John", "Doe");
        testtree.insert("Test", "Case", "555-235-1121", 
                "Test_Case@testcase.com");
        testtree.insert("Nadezhda", "Kanachekhovskaya", "555-235-1122", 
                "dr.nadezhda.kanacheckovskaya@somehospital.moscow.ci.ru");
        testtree.insert("Jo", "Wu", "555-235-1123", "wu@h.com");
        testtree.insert("Millard", "Fillmore", "555-235-1124", 
                "millard@theactualwhitehouse.us");
        testtree.insert("Bob", "vanDyke", "555-235-1125", 
                "vandyke@nodomain.com");
        testtree.insert("Upside", "Down", "555-235-1126", 
                "upsidedown@rightsideup.com");
        testtree.lookup("Jack", "Jones");
        testtree.lookup("Nadezhda", "Kanachekhovskaya");
        testtree.delete("Jill", "Jones");
        testtree.delete("John", "Doe");
        testtree.lookup("Jill", "Jones");
        testtree.lookup("John", "Doe");
    }

}