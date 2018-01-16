package first;

import java.util.Scanner;

public class Student {

    private int checkmark(int mark) {
        if(mark > 13){
            return 0;
        }
        return mark;
    }

    private int[] marks = new int[5];

    public void check() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Твой матан?");
        checkmark(scanner.nextInt());
        marks[0] = checkmark(scanner.nextInt());;
        System.out.println("Твой язык?");
        marks[1] = checkmark(scanner.nextInt());;
        System.out.println("Твой физан?");
        marks[2] = checkmark(scanner.nextInt());
        System.out.println("Твой музон?");
        marks[3] = checkmark(scanner.nextInt());
        System.out.println("Твоя бижка?");
        marks[4] = checkmark(scanner.nextInt());

    }

    public int[] getMarks() {
        return marks;
    }
}
