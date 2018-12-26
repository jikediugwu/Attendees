/**
 * Jeff Ikediugwu
 * CMSY 166-002
 * A program to count the numbers of attendees of the 50th Birthday Celebration and
 * compare Howard County residents attendees and non Howard County residents attendees
 */
package attendees;

import java.util.Scanner;

public class Attendees {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String response;
        int attendees = 0;
        int howardResidents = 0;
        int age = 0;
        int seniors = 0;
        int adults = 0;
        int children = 0;
        int nonHowardResidents = 0;

        System.out.println("Would you like to add an attendee: Y/N ");
        response = input.nextLine();

        while (response.equals("Y") || response.equals("y")) {
            System.out.println("Is the attendee a Howard County Resident ? (Y/N)");
            response = input.nextLine();

            if (response.equals("Y") || response.equals("y")) {
                System.out.println("How old is the attendee? ");
                age = input.nextInt();

                if (age < 18 && age >= 0) {
                    attendees++;
                    howardResidents++;
                    children++;
                } // end of children if statement for howard county residents
                else if (age >= 18 && age <= 65 && age > 0) {
                    attendees++;
                    howardResidents++;
                    adults++;
                } // end of adults if statement for howard county residents
                else if (age > 65 && age > 0) {
                    attendees++;
                    howardResidents++;
                    seniors++;
                } // end of seniors if statement for howard county residents
                else {
                    System.out.println("Not a valid age. Please enter a valid age ");
                } // end of else statement for an invalid input by the user
            } // end of else statement for howard county residents
            else {
                System.out.println("How old is the attendee? ");
                age = input.nextInt();

                if (age < 18 && age >= 0) {
                    attendees++;
                    nonHowardResidents++;
                    children++;
                } // end of children if statement for non howard county residents
                else if (age >= 18 && age <= 65 && age >= 0) {
                    attendees++;
                    nonHowardResidents++;
                    adults++;
                } // end of adult if statement for non howard county residents
                else if (age > 65 && age >= 0) {
                    attendees++;
                    nonHowardResidents++;
                    seniors++;
                } // end of seniors if statement for non howard county residents
                else {
                    System.out.println("Not a valid number. Please enter a valid age ");
                } // end of else statement for an invalid input by the user
            } // end of else statement for non howard county residents

            input.nextLine();
            System.out.println("Would you like to add another attendee: Y/N ");
            response = input.nextLine();
        } // end of while loop

        System.out.printf("%nThere are %d Attendees, %d non Howard County Residents, %d Howard County residents, %d Seniors, %d Adults, and %d Children%n%n", attendees, nonHowardResidents, howardResidents, seniors, adults, children);

        System.out.println(howardResidents >= nonHowardResidents ? "There are more Howard County residents"
                + " attending than non Howard County residents." : " There are more non Howard County residents attending"
                + " than Howard County residents.");

        input.close();

    } // end of main

} // end of attendee class
