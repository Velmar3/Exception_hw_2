import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        int x = 0;
        while (x != 1) {

            System.out.print("Введите текст: ");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();

            try {
                if (str.equals("")) {
                    throw new Exception();
                }
                System.out.println(str);
                System.out.println("Текст введен успешно!");
                x = 1;
            } catch (Exception e) {
                {
                    System.out.println("Ошибка! Пустые строки вводить нельзя, попробуйте снова!");
                }

            }
        }
    }
}