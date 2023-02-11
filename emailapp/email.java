package emailapp;

import java.util.Scanner;

public class email {
    private String firstName;
    private String lastName;
    private String password;
    private String faculty;
    private  String email;
    private int mailboxCapacity = 200;
    private String alterEmail;
    private String companySuffix = "ul.ac.za";

    //constructor for receiving the firstname and lastname
    public email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //System.out.println("Email Created: " + this.firstName + " " + this.lastName);

        // Call a method asking for the faculty
        this.faculty = setFaculty();
        System.out.println("Faculty: " + this.faculty);

        // Call a method returning a password
        this.password = randomPassword(10);
        System.out.println("Your password is: " + this.password);

        //Generate an email
        email = firstName + "." + lastName + "@" + faculty + "." + companySuffix;
        //System.out.println("Your email is: " + email);
    }

    //ask for faculty
    private String setFaculty(){
        System.out.print("Name of faculties:\n1 Health\n2 Humanities\n3 LawAccounting\n4 ScienceAgriculture\n0 for none \nEnter your department");
        Scanner input = new Scanner(System.in);
        int facultyChoice = input.nextInt();
        if (facultyChoice == 1){
            return "Health";
        } else if (facultyChoice == 2) {
            return "Humanities";
        } else if (facultyChoice ==3) {
             return "LawAccounting";
        }else if (facultyChoice == 4){
            return "ScienceAgriculture";
        }else {
            return "";
        }
    }

    //Generate a password
    private String randomPassword(int length){
        String setPassword = "ABCDEFGHIJKLMNOPQRSTUXYZ1234567890!@#$%&?_-+=:^<>();/";
        char[] password = new char[length];
        for (int index = 0; index<length; index++){
            int random = (int)(Math.random() * setPassword.length());
            password[index] = setPassword.charAt(random);
        }
        return new String(password);
    }

    //Set a mailbox capacity
    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    //Set the alternate email
    public void setAlterEmail(String altEmail){
        this.alterEmail = altEmail;
    }

    // Change password
    public void changePassword(String password){
        this.password = password;
    }

    //Set the mailbox capacity
    public int getMailboxCapacity(){
        return mailboxCapacity;
    }
    public String getAlterEmail(){
        return alterEmail;
    }
    public String getPassword(){
        return password;
    }

    //Show information
    public String showInfo(){
        return "DISPLAY NAME: " + firstName + " " + lastName +
                "\nSchool Email: " + email + "\nMailbox Capacity: "
                + mailboxCapacity + "mb";
    }


}
