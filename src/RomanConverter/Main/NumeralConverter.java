package romanNumberConverter.Main;
import java.util.Scanner;

public class NumeralConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers");
        int numberIn = in.nextInt();
        String romanNumber = "";
        while(numberIn >= 1000){
            romanNumber += " M ";
            numberIn -= 1000;
        }
        while(numberIn >= 900){
            romanNumber += " CM ";
            numberIn -= 900;
        }
        while(numberIn >= 500){
            romanNumber += " D ";
            numberIn -= 500;
        }
        while(numberIn >= 400){
            romanNumber += " CD ";
            numberIn -= 400;
        }
        while(numberIn >= 100){
            romanNumber += " C ";
            numberIn -= 100;
        }
        while(numberIn >= 90){
            romanNumber += " XC ";
            numberIn -= 90;
        }
        while(numberIn >= 50){
            romanNumber += " L ";
            numberIn -= 50;
        }
        while(numberIn >= 40){
             romanNumber += " XL ";
             numberIn -= 40;
        }
        while(numberIn >= 10){
            romanNumber += " X ";
            numberIn -= 10;
        }
        while(numberIn >= 9){
            romanNumber += " IX ";
            numberIn -= 9;
        }
        while(numberIn >= 5){
            romanNumber += " V ";
            numberIn -= 5;
        }
        while(numberIn >= 4){
            romanNumber += " IV ";
            numberIn -=4;
        }
        while(numberIn >= 1){
            romanNumber += " I ";
            numberIn -= 1;
        }
        System.out.println(romanNumber);
    }
}
