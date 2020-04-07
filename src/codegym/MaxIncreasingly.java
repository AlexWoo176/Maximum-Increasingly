package codegym;

import java.util.LinkedList;
import java.util.Scanner;

public class MaxIncreasingly {
    public static void main(String[] args) {
        System.out.print("Enter a string: ");
        solution();
    }

    public static void solution() {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        LinkedList<Character> max = new LinkedList<>();
        for (int i = 0; i < string.length(); i++) {
            LinkedList<Character> list = new LinkedList<>();
            list.add(string.charAt(i));
            for (int j = 0; j < string.length(); j++) {
                if (string.charAt(j) > list.getLast()) {
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > max.size()) {
                max.clear();
                max.addAll(list);
            }
            list.clear();
        }
        for (Character ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}
