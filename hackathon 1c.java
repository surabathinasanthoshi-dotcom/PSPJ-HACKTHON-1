import java.util.Scanner;

class Water {
    static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Morning usage: ");
        int morning = sc.nextInt();

        System.out.print("Evening usage: ");
        int evening = sc.nextInt();

        int total = calculateTotal(morning, evening);

        System.out.println("Total consumption = " + total + " litres");
    }
}