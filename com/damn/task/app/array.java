

import java.util.*;

class Student {
    int rollno;
    String name;
    public Student(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", name=" + name + "]";
    }
    

}
public class array {
    public static void main(String[] args) {
        
       // StringBuffer s = new StringBuffer("hello");
       // s.append("girls");
       // System.out.println(s);

      // int nums []={1,2,3,4};

      // for(int i=0;i<nums.length;i++){
       // System.out.println(nums[i]);
       //}

       Student students[]=new Student[3];

       students [0] = new Student(4, "omg");
       students[1] = new Student(5, "riya");
       students [2] = new Student(6, "ira");
       
       for(Student s : students ){
        System.out.println(s);
       }


    }
    
}
