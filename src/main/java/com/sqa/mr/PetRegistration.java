/**
 * File Name: PetRegistration.java<br>
 * Raley, Mike<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Jun 22, 2017
 */
package com.sqa.mr;

import java.util.*;

import com.sqa.mr.helpers.*;

/**
 * PetRegistration //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Raley, Mike
 * @version 1.0.0
 * @since 1.0
 */
public class PetRegistration {

	/**
	 * @param args
	 */
	private static String appName = "Pet Registration";

	public static void main(String[] args) {
		String name = AppBasics.greetUserAndGetName(appName);
		registerPets();
		AppBasics.farewellUser(name);
	}

	public static void registerPets() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Each pet costs $45 per year to register. ");
		System.out.println("How many pets would you like to register?  (You'll be asked for a term later)");
		System.out.print("Enter number of pets: ");
		String input = scanner.nextLine();
		int numPets = Integer.parseInt(input.trim());
		int totalPrice = 0;
		int years = 0;
		for (int i = 1; i <= numPets; i++) {
			System.out.println("For pet number " + i + ", how many years would you like to register?");
			input = scanner.nextLine();
			years = Integer.parseInt(input.trim());
			totalPrice = totalPrice + 45 * years;
		}
		System.out.println("Your total price is $" + totalPrice);
	}
}
