import java.util.Scanner;
public class Restaurantses {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        while (true) {

            Thread.sleep(1000);
            System.out.println("\n\t\t\t-------------------------------------");
            System.out.println("\t\t\t    Welcome to Swiggy Restaurant     ");
            System.out.println("\t\t\t-------------------------------------");

            System.out.println("\n\t\t\tPlease Select Given Below Restaurants");
            System.out.println("\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t\t   1. A2B");
            System.out.println("\t\t\t   2. SS Hyderabad");
            System.out.println("\t\t\t   3. Saravana Bhavan");
            System.out.println("\t\t\t   0. Exit ");

            System.out.print("\n\t\t\t*Select a Restaurant (0-3) : ");
            int option = sc.nextInt();

            if (option == 0) {
                System.out.println("\n\t\t\tThank you for using Swiggy....");
                System.out.println("\t\t\tVisit Again....");
                break;
            }

            switch (option) {

                // ================= A2B =================
                case 1:
                    System.out.println("\n\t\t\tWelcome to A2B");
                    System.out.println("\t\t\t1. Dosa - 120 Rs");
                    System.out.println("\t\t\t2. Idli - 75 Rs");
                    System.out.println("\t\t\t3. Poori - 90 Rs");
                    System.out.print("\t\t\tSelect Food : ");
                    int food1 = sc.nextInt();

                    switch (food1) {
                        case 1:
                            payment("Dosa", 120);
                            break;
                        case 2:
                            payment("Idli", 75);
                            break;
                        case 3:
                            payment("Poori", 90);
                            break;
                        default:
                            System.out.println("\t\t\tInvalid Food Selection!");
                    }
                    break;

                // ================= SS HYDERABAD =================
                case 2:
                    System.out.println("\n\t\t\tSS Hyderabad Biriyani");
                    System.out.println("\t\t\t1. Chicken - 150 Rs");
                    System.out.println("\t\t\t2. Mutton - 200 Rs");
                    System.out.println("\t\t\t3. Beef - 180 Rs");
                    System.out.print("\t\t\tSelect Food : ");
                    int food2 = sc.nextInt();

                    switch (food2) {
                        case 1:
                            payment("Chicken Biriyani", 150);
                            break;
                        case 2:
                            payment("Mutton Biriyani", 200);
                            break;
                        case 3:
                            payment("Beef Biriyani", 180);
                            break;
                        default:
                            System.out.println("\t\t\tInvalid Food Selection!");
                    }
                    break;

                // ================= SARAVANA BHAVAN =================
                case 3:
                    System.out.println("\n\t\t\tSaravana Bhavan Sweets");
                    System.out.println("\t\t\t1. Laddoo - 100 Rs");
                    System.out.println("\t\t\t2. Halwa (per gram) - 2 Rs");
                    System.out.println("\t\t\t3. Mixture (per gram) - 1.5 Rs");
                    System.out.print("\t\t\tSelect Sweet : ");
                    int food3 = sc.nextInt();

                    switch (food3) {
                        case 1:
                            payment("Laddoo Box", 100);
                            break;
                        case 2:
                            payment("Halwa", 2);
                            break;
                        case 3:
                            paymentFloat("Mixture", 1.5f);
                            break;
                        default:
                            System.out.println("\t\t\tInvalid Sweet Selection!");
                    }
                    break;

                default:
                    System.out.println("\t\t\tInvalid Restaurant Selection!");
            }

            System.out.println("\n\t\t\tPress Enter to continue...");
            sc.nextLine();
            sc.nextLine();
        }
    }

    // ================= PAYMENT METHODS =================

    static void payment(String item, int price) {
        System.out.print("\t\t\tEnter Quantity : ");
        int qty = sc.nextInt();
        int total = qty * price;

        System.out.println("\t\t\tTotal Amount : " + total + " Rs");
        System.out.print("\t\t\tEnter Paid Amount : ");
        int pay = sc.nextInt();

        if (pay == total) {
            System.out.println("\t\t\tPayment Successful ...");
        } else if (pay > total) {
            System.out.println("\t\t\tPayment Successful ...");
            System.out.println("\t\t\tChange : " + (pay - total) + " Rs");
        } else {
            System.out.println("\t\t\tInsufficient Amount ...");
            System.out.println("\t\t\tPay Remaining : " + (total - pay) + " Rs");
        }
    }

    static void paymentFloat(String item, float price) {
        System.out.print("\t\t\tEnter Quantity : ");
        int qty = sc.nextInt();
        float total = qty * price;

        System.out.println("\t\t\tTotal Amount : " + total + " Rs");
        System.out.print("\t\t\tEnter Paid Amount : ");
        float pay = sc.nextFloat();

        if (pay == total) {
            System.out.println("\t\t\tPayment Successful ...");
        } else if (pay > total) {
            System.out.println("\t\t\tPayment Successful ...");
            System.out.println("\t\t\tChange : " + (pay - total) + " Rs");
        } else {
            System.out.println("\t\t\tInsufficient Amount ...");
            System.out.println("\t\t\tPay Remaining : " + (total - pay) + " Rs");
        }
    }
}
