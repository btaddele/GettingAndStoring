import java.util.Scanner;

public class userinput {
    public static void main(String [] args){
        int houseNumber;
        String firstInitial;
        String lastName;
        String streetName;
        String streetType;
        String city;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        firstInitial = input.next();
        System.out.print("Enter your last name: ");
        lastName = input.next();
        System.out.print("Enter the street name: ");
        streetName = input.next();
        System.out.print("Enter the street type: ");
        streetType = input.next();
        System.out.print("Enter your city: ");
        city = input.next();
        input.nextLine();
        System.out.print("Enter your house number: ");
        houseNumber = input.nextInt();
        System.out.println();

        System.out.print(firstInitial + " " + lastName + " " + houseNumber + " ");
        System.out.println(streetName + " " + streetType + " " + city);
    }
}
