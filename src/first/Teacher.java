package first;

public class Teacher {
    public int averagemark(int[] marks) {
        int average = marks[0];
        for (int i = 1; i < marks.length; i++){
            average = (average + marks[i])/2;
        }
        return average;
    }

    public void idivon(int average){
        if (average < 7){
            System.out.println("Пошел вон!");
        }
        else{
            System.out.println("Иди к нам на чай)");
        }
    }
}
