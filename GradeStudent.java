import java.util.Scanner;

class StudentRecord{
    String name;
    int marks;
    char grade;
    void setName(String name){
        this.name = name;
    }
    
    String getName(){
        return this.name;
    }

    void setMarks(int marks){
       this.marks = marks;
    }
    
    int getMarks(){
        return this.marks;
    }

    void setGrade(char grade){
        this.grade = grade;
    }

    char getGrade(){
        return this.grade;
    }

}

public class GradeStudent {

    public static char calculateGrade(int marks){
        switch(marks/10){
            case 10:
            case 9: return 'A';
            case 8: return 'B';
            case 7: return 'C';
            case 6: return 'D';
            case 5:
            case 4: return 'E';
        }
        return 'F';
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int noOfStudent = 10;
        StudentRecord[] arr = new StudentRecord[noOfStudent];
        for(int i = 0;i<noOfStudent;i++){
            System.out.print("Enter student name: ");
            String stdName = sc.nextLine();
            System.out.print("Enter student marks: ");
            int marks = sc.nextInt();
            arr[i].setMarks(marks);
            arr[i].setName(stdName);
            arr[i].setGrade(calculateGrade(marks));
            System.out.println();
        }

        for(int i = 0;i<noOfStudent;i++){
            String name = arr[i].getName();
            int marks = arr[i].getMarks();
            char grade = arr[i].getGrade();
            System.out.println("Name: "+name+" | Marks: "+marks+" | Grade: "+grade);
        }

        sc.close();
    }
}
