

public class Student {
    String FN;
    String LN;
    int Sid;


    // How many parameters = 0
    Student(){
        this.FN = "No first name";
        this.LN = "No Last name";
        this.Sid = 0;
    }
    // How many parameters = 3
   Student(String FN, String LN, int Sid){
        this.FN=FN;
        this.LN=LN;
        this.Sid=Sid;
    }
    public static void main(String[] args){
        // Variable s1 is of Student type
Student s1;
s1 = new Student();
System.out.println(s1);
        System.out.println(s1.FN);
    }
}
