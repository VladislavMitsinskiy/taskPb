import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число:");
        double number1 = scanner.nextDouble();

        System.out.println("Введите второе число:");
        double number2 = scanner.nextDouble();

        System.out.println("Введите операцию (+, -, *, /, %, p):");
        String action = scanner.next();

        Operation operation = null;

        switch (action){
            case "+":
                operation = new Addition();
                break;
            case "-":
                operation = new Subtraction();
                break;
            case "*":
                operation = new Multiplication();
                break;
            case "/":
                operation = new Division();
                break;
            case "%":
                operation = new Modulo();
                break;
            case "p":
                operation = new Percentage();
                break;
        }
        if (operation != null){
            double result = operation.calculate(number1, number2);
            System.out.println("Результат: " + result);
        } else {
            System.out.println("Ошибка: неверная операция.");
        }
        scanner.close();
    }
}

