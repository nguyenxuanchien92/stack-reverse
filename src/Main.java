import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7};

        Stack<Integer> arr = new Stack();
        for (int i = 0; i < array.length; i++) {
            arr.push(array[i]);
        }
        for (int i : arr) {
            System.out.printf(" %d",i);
        }
    }

}
