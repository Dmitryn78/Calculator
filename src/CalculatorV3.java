import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CalculatorV3 {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите операцию");
        String input = reader.readLine();
        System.out.println(calc(input));


    }
    public static String calc(String input) throws Exception {
        String[] arrayN = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        String[] arrayS = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        String[] elements = input.split(" ");
        int premiere = 0;
        int second = 0;
        int premiere1 = 0;
        int second1 = 0;
        String znak = elements[1];
        char z = znak.charAt(0);


        if (elements.length == 3) {

            for (int i = 0; i < arrayN.length; i++) {

                if (arrayN[i].equals(elements[0])) {
                    premiere = Integer.parseInt(elements[0]);
                }
                if (arrayN[i].equals(elements[2])) {
                    second = Integer.parseInt(elements[2]);
                }
            }
            if (premiere != 0 && second != 0) {
             return  resalt(premiere, second, z) + "";

            } else if (premiere == 0 && second == 0) {
                for (int i = 0; i < arrayS.length; i++) {
                    if (arrayS[i].equals(elements[0])) {
                        premiere1 = Integer.parseInt(arrayN[i]);

                    }
                    if (arrayS[i].equals(elements[2])) {
                        second1 = Integer.parseInt(arrayN[i]);
                    }
                }

                if (premiere1 != 0 && second1 != 0) {
                    return resalt1(premiere1, second1, z) + "";
                }
            }
        }



        if ((premiere == 0 || second == 0) && (premiere1 == 0 || second1 == 0)) {
            System.out.println("Ошибка ввода");
            throw new Exception();

        }
        return "ошибка ввода";

    }



    public static int resalt(int premiere, int second, char z) throws Exception {
        if(z =='+'){
          return premiere+second;
        }
        else if(z == '-'){
            return premiere-second;
        }
        else if(z == '*'){
            return premiere*second;
        }
        else if(z == '/'){
            return premiere/second;
        }
        else{
            System.out.println("Ошибка ввода 3");
            throw new Exception();
        }

    }
    public static String resalt1(int premiere1, int second1, char z) throws Exception {
        int r = 0;
        if(z == '+'){
            r = premiere1+second1;
            return convertation(r);
        }
        else if(z == '-'){
            r = premiere1-second1;
            return convertation(r);
        }
        else if(z == '*'){
            r = premiere1*second1;
            return convertation(r);
        }
        else if(z == '/'){
            r = premiere1/second1;
            return convertation(r);
        }
        else{
            System.out.println("Ошибка ввода 3");
            throw new Exception();
        }

    }
    public static String convertation(int r) throws Exception {

        if(r<=0){
            throw new Exception();
        }
        int[] arrayA = {1, 4, 5, 9, 10, 40, 50, 90, 100};
        String[] arrayB = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C"};
        String romN = "";
        while (r>0){
            for(int i =0; i<arrayA.length; i++){
                if(r < arrayA[i]){
                    romN += arrayB[i-1];
                    r -= arrayA[i-1];
                    break;
                }
            }
        }
        return romN;



    }
}