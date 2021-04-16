package practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> strings = new ArrayList<>();
        System.out.println(" Print something to add in the array, \n if u want to stop print - end");

        for (;;){
            String str = scanner.nextLine();


            if (str.equalsIgnoreCase("end")){
             break;
            }
            strings.add(str);
        }

        System.out.println(strings);

//        for (String tmp:strings) {
//            System.out.println(tmp);
//        }

    }
}
