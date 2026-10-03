import java.util.Scanner;

class Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int familyMembers;
        double water;
        int houseNo;
        char status;

        System.out.print("Enter family members: ");
        familyMembers = sc.nextInt();

        System.out.print("Enter water consumed: ");
        water = sc.nextDouble();

        System.out.print("Enter house number: ");
        houseNo = sc.nextInt();

        System.out.print("Enter water status: ");
        status = sc.next().charAt(0);

        System.out.println("Family Members: " + familyMembers);
        System.out.println("Water Consumed: " + water);
        System.out.println("House Number: " + houseNo);
        System.out.println("Water Status: " + status);
    }
}