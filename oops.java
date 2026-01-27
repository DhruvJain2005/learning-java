class Pen{
    String color;
    String type; // ballpoint;

    public void write(){   //  this is method for upper class
        System.out.println("writing something");
    }
    public void printcolor(){
        System.out.println(this.color);// this keyword tell us that which object wants to access our method 
    }
}

class Student{ // class name always start with capital letters 
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    //Student(){  // here we build our 1 type of constructor which is non parameterized constructor
        //System.out.println  ("constructor called");
    //}

    Student(String name,int age){ // this is 2nd type parameterized constructor
        this.name=name;
        this.age=age;
    }
}

// constuctor name or class name  should always same 
// they do not return anything 
// for one object we can call constructor one time 




public class oops {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // pen1.color = "blue";
        // pen1.type="gel";

        // Pen pen2=new Pen();
        // pen2.color="black";
        // pen2.type="ballpoint";

        // pen1.printcolor();
        // pen2.printcolor();
        Student s1=new Student("dhruv",24);  // when we (new) keyword , their is allocation of memory in memory heap  where our complete object should store 
        

        s1.printInfo();
    }
    
}
