import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {
        мethod();
    }

    private static void мethod() {
        int x = 0;
        while (x != 1) {
            System.out.print("Введите число: ");
            Scanner scan = new Scanner(System.in);
            String num = scan.nextLine();

            try {
                float number = Float.parseFloat(num);
                System.out.println(number);
                System.out.println("Число введено!!!");
                x = 1;

            } catch (Exception NumberFormat) {
                System.out.println("Ошибка! Вы ввели строку, попробуйте снова!");
            }
        }
    }
}
