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
public class DataTree {
 
    DataTreeListing root;
    
    //MF Add a listing 
   
    DataTreeListing insert(String firstName, String lastName, 
            String phoneNumber, String emailAddress) {
        
        DataTreeListing newDataTreeListing = new DataTreeListing(firstName, 
            lastName, phoneNumber, emailAddress);
                              
            //MF Add node to root
        
            if (root == null) {
                
                root = newDataTreeListing;
                System.out.println("ADD SUCCESSFUL: " 
                        + newDataTreeListing.name + " was added to "
                        + " as the root");
            }
            
           
            
            else {
                
                DataTreeListing pivotListing = root;
                DataTreeListing parent;
                
                while(true) {
                    parent = pivotListing;
                    
                    if(newDataTreeListing.key.compareTo(pivotListing.key) < 0) {
                        pivotListing = pivotListing.leftChild;
                        
                        if (pivotListing == null) {
                            parent.leftChild = newDataTreeListing;
                            System.out.println("ADD SUCCESSFUL: " 
                                    + newDataTreeListing.name + " was"
                                    + " added as the Left Child of " 
                                    + parent.name);
                            return null;
                        }
                    }
                
                    else {
                         pivotListing = pivotListing.rightChild;

                    if(pivotListing == null){
                        parent.rightChild = newDataTreeListing;
                        System.out.println("ADD SUCCESSFUL: " 
                                + newDataTreeListing.name + " was "
                                + " added as the Right Child of " 
                                + parent.name);
                        return null;
                    }
                        
                }
                
            }

        }
    return null; 
    }
    
    //MF Lookup function 
    
    DataTreeListing lookup(String firstName, String lastName) {
        
        String name = firstName + " " + lastName;
        String newKey = name.toUpperCase();
        DataTreeListing pivotListing = root;
                  
      
        while(!pivotListing.key.equals(newKey)){

            if(newKey.compareTo(pivotListing.key) < 0){
                pivotListing= pivotListing.leftChild;
            }
            else{
                pivotListing = pivotListing.rightChild;
            }

            //MF Returns error if null
            
            if(pivotListing == null){
                System.out.println("SEARCH FAILED: " + name + " was not found in "
                        + " the phone book");
                return null;
            }
        }
            
           
        
            System.out.println("SEARCH SUCCESSFUL: "+ name + " was found in "
            + "the phone book. \n   "
            + "Phone Number: " + pivotListing.phoneNumber + "\n   "
            + "Email Address: " + pivotListing.emailAddress);            
            return null;
        }
    
    //MF Delete function
    
    public boolean delete(String firstName, String lastName) {
    
        String name = firstName + " " + lastName;
        String newKey = name.toUpperCase();
        DataTreeListing pivotListing = root;
        DataTreeListing parent = root;
        boolean leftChildStatus = true;
        
        //MF comparing node values
        
        while (!pivotListing.key.equals(newKey)) {
            
            parent = pivotListing;
            
            if (newKey.compareTo(pivotListing.key) < 0) {
                
                leftChildStatus = true;
                pivotListing = pivotListing.leftChild;
                
            }
            else {
                
                leftChildStatus = false;
                pivotListing = pivotListing.rightChild;
            }
            
            if (pivotListing == null) {
                System.out.println("DELETE FAILED: " + name + " was not found in"
                + " the phone book.");
                return false;
            }
            
        }
        
     
        
        if (pivotListing.leftChild == null && pivotListing.rightChild == null) {
            
            if (leftChildStatus)
                parent.leftChild = null;
            
            else
                parent.rightChild = null;
            
        }
        
    
        
        else if (pivotListing.rightChild == null) {
            
          
            
            if (leftChildStatus)
                parent.leftChild = pivotListing.leftChild;
            
            else
                parent.rightChild = pivotListing.leftChild;
        }
        
       
        
        else if (pivotListing.leftChild == null) {
            
          
            
            if (leftChildStatus)
                parent.leftChild = pivotListing.rightChild;
            
            else
                parent.rightChild = pivotListing.rightChild;
            
        }
        

        
        else {
            
       
            
            DataTreeListing replacement = 
                    findSmallestNode(pivotListing.rightChild);
            
           
            pivotListing.name= replacement.name;
            pivotListing.phoneNumber = replacement.phoneNumber;
            pivotListing.emailAddress = replacement.emailAddress;
      
            
            removeSmallestNode (pivotListing.rightChild);            
        }
        
        System.out.println("DELETE SUCCESSFUL: " + name + " was deleted "
                        + " from the phone book.");
        return true;
    }
    
    //MF Recursive method to locate the smallest node under a specified node:
    
    private DataTreeListing findSmallestNode(DataTreeListing node) {
        
        if (node.leftChild != null) {
            
            node = this.findSmallestNode(node.leftChild);
            
        }
        
        return node;
             
    }    
    
   
    
    private DataTreeListing removeSmallestNode(DataTreeListing node) {
                
        DataTreeListing parent = node;
        
        while(node.leftChild != null) {
                   
            if (node.leftChild != null) {
            
                parent = node;
                node = node.leftChild;
                
            }
            
            else {
            
                parent.rightChild = node;
                node = node.rightChild;
                
            }
           
        }
        return node;
        
    }
}
