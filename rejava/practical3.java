import java.util.Scanner;

class Sorting {
    void sortStrings() {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = s.nextInt();

        String[] str = new String[n];

        System.out.println("Enter strings:");
        for (int i = 0; i < n; i++) {
            str[i] = s.next();
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (str[i].compareTo(str[j]) > 0) {
                    String temp = str[i];
                    str[i] = str[j];
                    str[j] = temp;
                }
            }
        }

        System.out.print("Sorted List of strings: ");
        for (int i = 0; i < n; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Sorting obj = new Sorting();
        obj.sortStrings();
    }
}
