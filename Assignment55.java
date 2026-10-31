package javaclassassignments;
//WAP to create one interface with two abstract methods and implement the interface in a single class.
interface A
{
    void display();
    void show();
}

class Assignment55 implements A
{
    public void display()
    {
        System.out.println("Display method");
    }

    public void show() {
        System.out.println("Show method");
    }

    public static void main(String[] args)
    {
        Assignment55 obj = new Assignment55();
        obj.display();
        obj.show();
    }
    
}