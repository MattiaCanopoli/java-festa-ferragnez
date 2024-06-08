package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {

		// Strings Array initialization. contains all guests name
		String[] guestList = { "Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi",
				"Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic" };

		// canEnter condition initialized to false
		boolean canEnter = false;

		// new scanner variable to get user input
		Scanner userName = new Scanner(System.in);
		// print string
		System.out.println("Il suo nome, prego");
		// store user input
		String guestName = userName.nextLine();

		// close scanner
		userName.close();

		// WHILE LOOP

//		int i = 0;
//		while (i < guestList.length) {
//			// check if user input matches the current array element.
//			// if true, sets canEnter variable to true and break the loop
//			if (guestList[i].toLowerCase().equals(guestName.toLowerCase())) {
//				canEnter = true;
//				break;
//			}
//			i++;
//		}

		// FOR LOOP

		for (int i = 0; i < guestList.length; i++) {
			if (guestList[i].toLowerCase().equals(guestName.toLowerCase())) {
				canEnter = true;
				break;
			}

		}

		// print different string based on canEnter value
		if (canEnter == true) {
			System.out.println("Prego, la stanno aspettando");
		} else {
			System.out.println("Siamo spiacenti, ma il suo nome non è in lista");
		}
	}
}
