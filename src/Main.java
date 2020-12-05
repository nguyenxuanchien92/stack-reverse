import java.util.*;

public class Main {

    public static void main(String[] args) {


        List<Student> students = new LinkedList<>();
        List<Student> reverseStudents = new ArrayList<>();
        students.add(new Student(0, "Chien"));
        students.add(new Student(1, "ly"));
        students.add(new Student(2, "Minh"));

        Stack<Student> arrStack = new Stack();

        for (Student e : students) {
            arrStack.push(e);
        }

        students.clear();
        System.out.println(students);
        for (int i = 0; i < 3; i++) {
            students.add(arrStack.pop());
        }
        System.out.println(students);
    }

}
