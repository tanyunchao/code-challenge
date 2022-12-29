import java.util.*;

class sumToN{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("n: ");
        int x = sc.nextInt();

        System.out.println("Answer from methodOne = " + methodOne(x));
        System.out.println("Answer from methodOne = " + methodTwo(x));
        System.out.println("Answer from methodOne = " + methodThree(x));

    }

    public static int methodOne(int input) {
        int counter = 0;
        int index = 1;
        while(index <= input){
            counter += index;
            index++;
        }
        return counter;
    }

    public static int methodTwo(int input) {
        if(input > 0){
            return input + methodTwo(input - 1);
        } else {
            return 0;
        }
    }

    public static int methodThree(int input) {
        double x = input;
        return (int) (x/2 * (1 + x));
    }

}