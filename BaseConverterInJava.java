import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);

        String mahbub;
        int base, conv, tanmay;

        System.out.print("Enter a Number: ");
        mahbub = Input.nextLine();

        do {
            System.out.print(
                    "What was the base of the number u entered?(Enter 1-4): \n 1 for Decimal \n 2 for Binary \n 3 for Hex \n 4 for octal \n");
            base = Input.nextInt();
        }

        while (base > 4 || base < 1);

        do {

            System.out.print(
                    "Now which base u want to convert to?(Enter 1-4): \n 1 for Decimal \n 2 for Binary \n 3 for Hex \n 4 for octal \n");
            conv = Input.nextInt();
        }

        while (conv > 4 || conv < 1);

        Input.close();

        if (base == 1) {
            tanmay = Integer.parseInt(mahbub); // as Decimal

        }

        else if (base == 2) {
            tanmay = Integer.parseInt(mahbub, 2); // as Binary
        }

        else if (base == 3) {
            tanmay = Integer.parseInt(mahbub, 16); // as octal
        }

        else {
            tanmay = Integer.parseInt(mahbub, 8); // as hexadecimal
        }

        if (conv == 1) {

            mahbub = Integer.toString(tanmay); // "Default it will be decimal"
        }

        else if (conv == 2) {
            mahbub = Integer.toBinaryString(tanmay); //to convert into Binary
        }

        else if (conv == 3) {
            mahbub = Integer.toHexString(tanmay); //to convert into hex
        }

        else {

            mahbub = Integer.toOctalString(tanmay); //to convert into octal
        }

        System.out.println("The number after conversion: " + mahbub.toUpperCase());

    }

}


