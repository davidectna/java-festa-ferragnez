package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
	
	public static void main(String[] args) {
	
	Boolean flag = false;
	String guestName;
	String[] guestList = new String[11];
	
	guestList[0] = "Dua Lipa";
	guestList[1] = "Paris Hilton";
	guestList[2] = "Manuel Angelli";
	guestList[3] = "J-Ax";
	guestList[4] = "Francesco Totti";
	guestList[5] = "Ilary Blasi";
	guestList[6] = "Bebe Vio";
	guestList[7] = "Luis Sal";
	guestList[8] = "Pardis Zarai";
	guestList[9] = "Martina Maccherone";
	guestList[10] = "Rachel Zeilic";
	
	Scanner scan = new Scanner (System.in);
	System.out.println("Salve,come si chiama?");
	guestName = scan.nextLine();
	
	
	for (int index = 0 ; index < guestList.length ; index++) {
		if (guestName.equalsIgnoreCase(guestList[index])) {
			flag = true;
			}
	
	   } 
	if (flag == true) {
		System.out.println("Benvenuto dai Ferragnez");
	}
	else { 
			System.out.println("Non sei invitato a questa festa");
			
		}
    }
}