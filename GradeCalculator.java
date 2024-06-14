import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

class Student{
    int[] marks;

    int total =0;
    int avg =0;
    char grade;

    Student(int subjects){
        marks = new int[subjects];
    }
    public void getMarks(){

        Scanner in = new Scanner(System.in);
        for (int i = 0; i < marks.length; i++) {
            System.out.println(" mark ->"+ (i+1)+ " >>");
            marks[i]= in.nextInt();
            total+=marks[i];
        }
        avg = total/ marks.length;
        calcGrade();
    }
    private void calcGrade(){
       if (avg>= 90) {
        grade='A';
       } else if (avg >=80) {
        grade='B';
       } else if(avg>= 60){
        grade='C';
       }else{
        grade='D';
       }
    }
    @Override
    public String toString() {
        return " Marks :"+ Arrays.toString(marks) +" total :"+ total+" average :"+ avg+" Grade:"+ grade;
    }

}

public class GradeCalculator {
    
   public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter how many subjects >>");
    int count = in.nextInt();

    System.out.println("Enter number of Students >>");
    int stu = in.nextInt();

  //  List<Student> classList = new ArrayList<>();
  HashMap<String,Student> classList= new HashMap<>();   
  for (int i = 0; i < stu; i++) {
        System.out.print("Enter Student "+(i+1)+" ");
        Student s1 = new Student(count);
        s1.getMarks();
        classList.put("Student"+(i+1), s1);

    }
   
    System.out.println("Student mark list: ");
    
    classList.forEach((key,Value) ->System.out.println(key +" "+ Value));

    }

}
