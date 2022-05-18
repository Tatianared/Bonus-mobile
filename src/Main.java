public class Main {
    public static void main(String[] args) {
        int score = 100;
        int payment = 999;

        int bonus;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
        int total = score + payment + bonus;
        System.out.println(total);
        System.out.println(bonus);


    }
}

