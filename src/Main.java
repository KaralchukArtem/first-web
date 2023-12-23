import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        String userChoice;
        Scanner scanner = new Scanner(System.in);
        boolean exit = true;
        while (exit) {
            System.out.println("Выбирите задачу от 0 до 6, в ином случае выход:");
            userChoice = scanner.nextLine().trim();
            int switchChoice = Integer.parseInt(userChoice);

            switch (switchChoice) {
                case (0):
                    zero();
                    break;
                case (1):
                    first();
                    break;
                case (2):
                    second();
                    break;
                case (3):
                    third();
                    break;
                case (4):
                    fourth();
                    break;
                case (5):
                    fifth();
                    break;
                case (6):
                    sixth();
                    break;
                default:
                    System.out.println("Возможно веденно не верное значение, повторите попытку ");
                    exit = false;
            }
        }
    }

    public static void zero(){

        String userChoice;
        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        userChoice = scanner.nextLine().trim();
        System.out.println("Hello " + userChoice);

    }
    public static void first(){

        float a;
        float b = 10;
        float c = 3;

        a = 4*(b+c-1)/2;

        System.out.println("Выражение при b = 10 и c = 3: "+ a);

    }

    public static void second(){

        String n = "25";
        int a = Integer.parseInt(String.valueOf(n.charAt(0)));
        int b = Integer.parseInt(String.valueOf(n.charAt(1)));
        int sum = a+b;
        System.out.println(sum);

    }

    public static void third(){

        //.. как сжелать лучше пока то не понял

        String n ="32231";
        int [] massive = new int [n.length()];
        int sum = 0;
        for (int i =0; i < n.length(); i++){

            massive[i] = Integer.parseInt(String.valueOf(n.charAt(i)));
            sum += massive[i];
            System.out.println(sum);

        }

    }

    public static void fourth(){

        double n = 24.4;
        int result;
        result = (int) Math.round(n);
        System.out.println((result));

    }

    public static void fifth(){

        double q = 21;
        double w = 8;
        int result;
        result = (int) Math.floor(q/w);
        System.out.println(result + " остаток " + (int)(q-w*result));
    }

    public static void sixth(){

        int a = 1;
        int b = 2;
        int c;

        c=a;
        a=b;
        b=c;

        System.out.println("a: "+ a + " b:" + b);

    }

}