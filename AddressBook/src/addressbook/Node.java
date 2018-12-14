package addressbook;




/**
 *
 * @author Mohammedf
 */

public class Node{
    
    //MF Create a constructor that takes the three String fields as parameters and sets to the corresponding fields
    private String firstName;
    private String lastName;
    private String fullName;
    private String phoneNumber;
    private String emailAddress;
    //MA declare variable for the node to allow circular reference
    private Node nextNode;

    //MF Data Type Constructor
    public Node(String firstName, String lastName, String fullName, String phoneNumber, String emailAddress){
        this(firstName, lastName, fullName, phoneNumber, emailAddress,null);
    }
    //MF Create the next nodes
    public Node(String firstName, String lastName, String fullName, String phoneNunber, String emailAddress, Node nextNode){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.phoneNumber = phoneNumber;
        this.nextNode = nextNode;
    }
    
    
    //MF Getters and Setters
    public String getfirstName(){
        return this.firstName;
    }

    public String getlastName(){
        return this.lastName;
    }

    public String getfullName(){
        return this.fullName;
    }
    
    public String getphoneNumber(){
        return this.phoneNumber;
    }
    
    public String getemailAddress(){
        return this.emailAddress;
    }

    public  Node getNextNode(){
        return this.nextNode;
    }

    public void setNextNode(Node nextNode){
        this.nextNode = nextNode;
    }

}