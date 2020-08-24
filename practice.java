import javax.crypto.spec.PSource;
import java.util.Scanner;

public class practice{
    public static void main(String[] args) {
        System.out.println("hello");
    }
}
// example 1 :
class example1{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter your Gender ");
        String gender = k.next();
        k.nextLine();
        System.out.println("Enter your Age ");
        int age = k.nextInt();
        if (gender.equals("Male")){
            if (age>=1 && age <=58){
                System.out.println("the percentage interest is 8.4%");
            }
            else{
                System.out.println("the percentage interest is 10.5%");
            }
        }
        if (gender.equals("Female")){
            if (age>=1 && age <=58){
                System.out.println("the percentage interest is 8.2%");
            }
            else{
                System.out.println("the percentage interest is 9.2%");
            }
        }
    }
}
//   example 2:
class example2{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the First String ");
        String k1 = k.next();
        k.nextLine();
        System.out.println("Enter the Second String ");
        String k2 = k.next();
        if (k1.equals("GLA")){
            System.out.println("GLA University, Mathura");
        }
        else {
            System.out.println("AAA technology Delhi");
        }
    }
}
//  product story
//  after all models development
//  example 3:
class example3{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter first no.");
        int k1 = k.nextInt();
        System.out.println("Enter second no. ");
        int k2 = k.nextInt();
        System.out.println("The sum of " + k1 + " and " + k2 + " is " + (k1+k2));
    }
}

//  example 4:
class example4 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter a value ");
        int n = k.nextInt();
        if (n == 0){
            System.out.println("Zero");
        }
        if (n > 0){
            System.out.println("Positive");
        }
        if (n < 0) {
            System.out.println("Negative");
        }
    }
}

//  example 5:
class example5{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        char ch = k.next().charAt(0);
        if (ch>=65 && ch<=90){
            System.out.println(ch + " -> " + Character.toLowerCase(ch));
        }
        else{
            System.out.println(ch + " -> " + Character.toUpperCase(ch));
            }
    }
}
//  reverse order printing numbers with cont. spaces
class reverse_no{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = k.nextInt();
        for (int i = n; i >= 0; i--){
            System.out.print(i + "  ");
            i -= 2;
        }
    }
}
//  printing pattern no 1
class pattern01{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = k.nextInt();
        System.out.println("________________________________________________");
        for (int i = 1; i <= n; i++ ){
            for (int j = 1; j <= i; j++){
                System.out.print(j+"");
            }
            System.out.println("");
        }
        System.out.println("________________________________________________");
    }
}
//  printing pattern no 2
class pattern02{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the range : ");
        int n = k.nextInt();
        k.nextLine();
        System.out.print("Enter the Printing value : ");
        char ch = k.next().charAt(0);
        System.out.println("____________________");
        for (int i = 0;i < n; i++){
            for (int j = n;(j-i) > 0; j--){
                System.out.print(" ");
            }
            for (int t = 0;t <= i; t++){
                System.out.print(ch);
            }
            System.out.println("");
        }
        System.out.println("___________________");
    }
}
//  two ways to concatenation
class concatenation{
    public static void main(String[] args) {
        String st1 = "Hi, ";
        String st2 = "Mom ";
        System.out.println("Concatenation type First ");
        System.out.println(st1 + st2);
        System.out.println("Concatenation type Second ");
        System.out.println(st1.concat(st2));
    }
}
//     concatenation of string and reverse string
class algo{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the First String : ");
        String st1 = k.next();
        System.out.print("Enter the Second String : ");
        String m = k.next();
        StringBuilder st2 = new StringBuilder();
        st2.append(m);
        st2.reverse();
        System.out.println("Resultant : " + st1 + st2);
    }
}
//  replacing vowels to 'Z'
class replace{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String st1 = k.next();
        String st2 = "";
        int c = 0;
        int l = st1.length();
        for (int i = 0;i <= l-1;i++) {
            if (st1.charAt(i) == 'a' || st1.charAt(i) == 'e' || st1.charAt(i) == 'i' || st1.charAt(i) == 'o' || st1.charAt(i) == 'u' ){
                st2 += 'Z';
                c++;
            }
            else{
                st2 += st1.charAt(i);
            }
        }
        System.out.println("Resultant String : " + st2);
        if (c > 0){
            System.out.println("Replacing n of character : "+ c);
        }
        else{
            System.out.println("Replacing no. of character : ZERO");
        }
    }
}
//  checking whether character is here or not
class check{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.print("Enter the String : ");
        String st1 = k.next();
        System.out.print("Checking Character : ");
        int c = 0;
        char ch = k.next().charAt(0);
        for (int i = 0; i < st1.length(); i++){
            if (st1.charAt(i) == ch){
                System.out.println("YES, available ");
                c++;
                break;
            }
        }
        if (c==0){
            System.out.println("NO, not available");
        }
    }
}
//  quiz
class test{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 3};
        if (arr1 == arr2){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
        }
    }
}
//  quiz
class check_{
    public static void main(String[] args) {
        int[ ]a[ ] = new int[4][4];
        //int a1[ ][ ] = new int[][4];
        int[ ]a2[ ] = new int[4][ ];
        int[ ][ ]a3 = new int[4][4];
    }
}
//  trim
class trim{
    public static void main(String[] args) {
        String str = new String("GLA University");
        int length = str.trim().length();
        System.out.println(length);
    }
}
//  lines
class lines{
    public static void main(java.lang.String[] args) {
        String[] days = new String[] {"sun", "mon", "tue", "wed", "thr", "fri", "sat", "sun"} ;
        for(int i =1;i<=days.length ;i++) System.out.println (days[i]);
    }
}
//  compare to()
class compare{
    public static void main(String[] args) {
        String st1 = "chetan";
        String st2 = "verma";
        System.out.println(st1.compareTo(st2));
    }
}
//  concatenation
class conc{
    public static void main(String[] args) {
        String st1 = new String("GLA");
        st1.concat(" University");
        st1 = st1.concat(", Mathura");
        System.out.println(st1);
    }
}
//  clear all
class clear_all{
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("chetan");
        sb.delete(0,sb.length());
        System.out.println(sb);
    }
}
//  check
class check__{
    public static void main(String[] args) {
        String john = "john";
        String jon = new String(john);
        System.out.println((john == jon) + " " + (john.equals(jon)));
    }
}
class dft{
    int[] ia = new int[1];
    boolean b;
    int l;
    Object o;

    public static void main(String[] args) {
        dft obj = new dft();
        obj.print();
    }
    public void print(){
        System.out.println(ia[0] + " " + b + " " + l + " "+ o);
    }
}
//     practice 3
//     example 2
class student{
    public int roll_no;
    public String name;
    student(int roll_no, String name){
        this.roll_no = roll_no;
        this.name = name;
    }
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Write down your Roll no and Name respectively : ");
        student obj1 = new student(k.nextInt(), k.next());
        System.out.println("Roll no : " + obj1.roll_no);
        System.out.println("Name : " + obj1.name);
    }
}
//  example 3
class rectangle{
    public int length;
    public int breadth;
    public int a;
    public void area(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
        this.a = length * breadth;
    }
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the length and the breadth respectively : ");
        rectangle obj = new rectangle();
        obj.area(k.nextInt(),k.nextInt());
        System.out.println("Area of rectangle : " + (obj.a));
    }
}
//  example 4
class area{
    public int length;
    public int breadth;
    public int a;
    public area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
        this.a = length*breadth;
    }
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Enter the length and the breadth respectively : ");
        area obj = new area(k.nextInt(),k.nextInt());
        System.out.println("Area of the rectangle : " + obj.a);
    }
}

//  example 5
class Employee{
    public int salary;
    public int hours;
    public void getInfo(int salary, int hours){
        this.salary = salary;
        this.hours = hours;
    }
    public void addSal(int salary){
        if (salary < 500) {
            this.salary = salary + 10;
        }
        else {
            this.salary = salary;
        }
    }
    public void addWork(int hours){
        if (hours > 6) {
            this.salary = salary + 5;
        }
        else{
            this.salary = salary;
        }
    }
    public static void main(String[] args) {
        Employee obj = new Employee();
        obj.addSal(400);
        obj.addWork(8);
        System.out.println(obj.salary);
    }
}

//    example 6
class students{
    public String name;
    students(String name){
        this.name = name;
    }

    public static void main(String[] args) {
        String name = new String("");
        students obj = new students(name);
        if (name.isEmpty()){
            System.out.print("Name : " + "Unknown ");
        }
        else{
            System.out.print("Name : " + name);
        }
    }
}
//   example 7
class Programming{
    public String name;
    Programming(String name){
        this.name = name;
    }
    public static void main(String[] args) {
        String name = new String("Java");
        students obj = new students(name);
        if (name.isEmpty()){
            System.out.print("I Love " + "Programming Language ");
        }
        else{
            System.out.print("I Love " + name);
        }
    }
}
//  example 8
class rect{
    public int length;
    public int breadth;
    rect(){
        this.length = 0;
        this.breadth = 0;
    }
    rect(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    rect(int length){
        this.length = length;
        this.breadth = length;
    }
    public void area(){
        int area = length*breadth;
    }
    public static void main(String[] args) {
        rect obj = new rect();
        rect obj1 = new rect(11);
        rect obj2 = new rect(11,12);
        System.out.println("Area : " + (obj.length * obj.breadth));
        System.out.println("Area : " + (obj1.length * obj1.breadth));
        System.out.println("Area : " + (obj2.length*obj2.breadth));
    }
}
