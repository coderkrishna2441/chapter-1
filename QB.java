// Q 24
// we made the interface has it is the only way to make the multiple inheritance concept in java
interface A{} 
interface B{}
interface C{}
// we made the interface has it is the only way to make the multiple inheritance concept in java
interface D extends A,B{}
// we made the interface has it is the only way to make the multiple inheritance concept in java
interface E extends D,C{
	 display();
}
// we made this class becausce interface  method are always default an abstraction method.
class Main implements E{
	void display(){
		System.out.println("A and B are parents of D. D and C are parents of E");
	}
}
	class run{
		public static void main(String args[]){
			Main mn = new Main();
			mn.display();
		}
	}


// Q 25
import java.util.*;
interface AreaCircle{
    Scanner sc = new Scanner(System.in);
        double pie = 3.14;
        int radius = sc.nextInt();
}
interface AreaSquare{
    Scanner sc1 = new Scanner(System.in);
        int side = sc1.nextInt();
}
interface Area extends AreaCircle,AreaSquare{
    void Area_of_square();
    void Area_of_circle();
}
class Main implements Area{
    public void Area_of_circle(){
        double areaC;
        areaC = (radius*radius)*pie;
        System.out.println("the area of the circle is: " + areaC);
    }
    public void Area_of_square(){
        int areaS;
        areaS = (AreaSquare.side*AreaSquare.side);
        System.out.println("the area of the circle is: " + areaS);
    }
}

class run{
    public static void main(String args[]){
        Main obj = new Main();
        obj.Area_of_circle();
        obj.Area_of_square();
    }
}


// Q 26
import java.util.*;
abstract class Person{
    Scanner sc = new Scanner(System.in);
    String name,address, email_id;
    String phone_no;
    Person(){
        name = sc.nextLine();
        address = sc.nextLine();
        email_id = sc.nextLine();
       phone_no = sc.nextLine();
    }
}
class Student extends Person{
    Scanner sc1 = new Scanner(System.in);
    String enrollment_no;
    Student(){
        super();
        enrollment_no = sc1.nextLine();
    }
    void display(){
        System.out.print("the name of the person is: " + name + " that u can contact him/her with his/her phone_no " + phone_no);
        System.out.print(" living at this location giving below\n");
        System.out.println(address);
        System.out.println("having email id that u can send bussiness or work related info " + email_id + " enrollment of the person is " + enrollment_no);
    }
}
class Employee extends Person{
    Scanner sc2 = new Scanner(System.in);
    String office,designation;
    double salary;
    Employee(){
        super();
        office = sc2.nextLine();
        designation = sc2.nextLine();
        sc2.next();
        salary = sc2.nextDouble();
    }
    void display1(){
        System.out.print("the name of the person is: " + name + " that u can contact him/her with his/her phone_no " + phone_no);
        System.out.print(" living at this location giving below\n");
        System.out.println(address);
        System.out.println("having email id that u can send bussiness or work related info " + email_id);
        System.out.println(" working in office " + office + "as the " + designation + "with a salary of " + salary);
    }
}

class test{
    public static void main(String args[]){
        Student std = new Student();
        std.display();
        Employee emp = new Employee();
        emp.display1();
    }
}


// Q 29
interface A1{
    double pie = 3.14;
}
interface A2{
    int age = 19;
}
interface A extends A1,A2{
    String name = "krishna";
}
interface P1{
    int salary = 12000;
}
interface P2{
    String office = "TCS";
}
interface A12 extends P1,P2,A{
    int emp_id = 1;
}
class B implements A12{
    void display(){
        System.out.println(pie + " " + name + " " + age);
    }
    void display1(){
        System.out.println(office + " " + emp_id + " " + salary);
    }
}

class test{
    public static void main(String args[]){
        B obj = new B();
        obj.display();
        obj.display1();
    }
}


// Q 30
class Book{
    private String author_name;
    public void getName(String author_name){
        this.author_name = author_name;
    }
    public void display(){
        System.out.print("the book author is: " + author_name);
    }
    public void getTitle(String title){
    }
}
class book_publication extends Book{
    private String title;
    public void getTitle(String title){
        this.title = title;
    }
    public void display(){
        super.display();
        System.out.println(" the title is " + this.title);
    }
}
class paper_publication extends Book{
    private String title;
    public void getTitle(String title){
        this.title = title;
    }
    public void display(){
        super.display();
        System.out.println(" the title is " + this.title);
    }
}
class Test{
    public static void main(String args[]){
        Book pointer1 = null;
        book_publication b1 = new book_publication();
        paper_publication p1 = new paper_publication();
        pointer1 = b1;
        pointer1.getName(args[0]);
        pointer1.getTitle(args[1]);
        pointer1.display();
        pointer1 = p1;
        pointer1.getName(args[2]);
        pointer1.getTitle(args[3]);
        pointer1.display();
    }
}
