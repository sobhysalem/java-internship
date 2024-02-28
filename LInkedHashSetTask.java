import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class LInkedHashSetTask {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter number of Test Cases you want : ");
            int numTest = input.nextInt();

            for (int i = 1; i <= numTest; i++) {
                LinkedHashSet<Integer> s = new LinkedHashSet<>();
                System.out.println("count number of queries you want for Test Case Number " + i + " : ");
                showMenu();
                int numQueries = input.nextInt();

                for (int j = 0; j < numQueries; j++) {
                    System.err.println("\nChoose from the list ");
                    char x = input.next().charAt(0);

                    if (x == 'a') {
                        System.out.println("Enter the element : ");
                        int num = input.nextInt();
                        s.add(num);
                    } else if (x == 'b') {
                        s.forEach(System.out::println);
                    } else if (x == 'c') {
                        System.out.println("Enter element to erase :");
                        int num = input.nextInt();
                        s.remove(num);
                    } else if (x == 'd') {
                        System.out.println("Enter the element to check if is found : ");
                        int num = input.nextInt();
                        System.out.println(s.contains(num) ? "found" : "not found");
                    } else if (x == 'e') {
                        System.out.println("number of elements : " + s.size());
                    } else if (x == 'f') {
                        Iterator<Integer> it = s.iterator();
                        while (it.hasNext()) {
                            System.out.println(it.next());
                        }
                    }
                }
            }
        }
    }

    public static void showMenu() {
        System.out.println(
                "a- insert an element x to the set s.\n" +
                "b- print the content of the set s.\n" +
                "c- erases an element x from the set s.\n" +
                "d- check if the element x is present in the set.\n" +
                "e- print the size of the set s.\n" +
                "f- print the content of the set s using iterator.\n");
    }
}
