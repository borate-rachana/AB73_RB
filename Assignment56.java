//WAP to create two interfaces with one method each and implement both interfaces in a single class
package javaclassassignments;

interface Interface1
{
    void display();
}

interface Interface2
{
    void show();
}
public class Assignment56 implements Interface1, Interface2
{
    public void display() {
        System.out.println("This is Interface1 method.");
    }

    public void show() {
        System.out.println("This is Interface2 method.");
    }
}


