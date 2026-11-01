import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print(" შეიყვანეთ n: ");
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        double average = sum / n;
        System.out.println("საშუალო: " + average);


        System.out.print(" შეიყვანეთ რიცხვი: ");
        int m = sc.nextInt();
        int power = 1;
        while (power * 2 <= m) {
            power *= 2;
        }
        while (m > 0) {
            if (m >= power) {
                System.out.print(power + " ");
                m -= power;
            }
            power /= 2;
        }
        System.out.println();


        System.out.print("3) ");
        for (int i = 1; i <= 15; i += 2) {
            if (i == 5 || i == 7 || i == 11) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();


        System.out.print(" შეიყვანეთ ორობითი რიცხვი: ");
        long bin = sc.nextLong();
        long decimal = 0;
        long weight = 1;
        while (bin > 0) {
            long digit = bin % 10;
            decimal += digit * weight;
            weight *= 2;
            bin /= 10;
        }
        System.out.println("ათობითში: " + decimal);


        System.out.print(" შეიყვანეთ ათობითი რიცხვი: ");
        int num = sc.nextInt();
        int step = 1;
        while (step * 2 <= num) {
            step *= 2;
        }
        System.out.print("ორობითში: ");
        while (step > 0) {
            if (num >= step) {
                System.out.print(1);
                num -= step;
            } else {
                System.out.print(0);
            }
            step /= 2;
        }
        System.out.println();


        Random random = new Random();
        int secret = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;
        while (guess != secret) {
            System.out.print(" გამოიცანი რიცხვი (1-100): ");
            guess = sc.nextInt();
            attempts++;
            if (guess < secret) {
                System.out.println(guess + " ნაკლებია ჩაფიქრებულ რიცხვზე");
            } else if (guess > secret) {
                System.out.println(guess + " მეტია ჩაფიქრებულ რიცხვზე");
            } else {
                System.out.println("გამოიცანი!");
            }

            if (attempts % 5 == 0 && guess != secret) {
                System.out.print("დანებდები? (1 - დიახ, 0 - არა): ");
                int answer = sc.nextInt();
                if (answer == 1) {
                    System.out.println("შენ წააგე! ჩაფიქრებული რიცხვი იყო " + secret);
                    break;

                }

            }
        }
    }
}
