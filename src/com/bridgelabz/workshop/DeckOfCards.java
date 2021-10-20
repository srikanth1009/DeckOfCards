package com.bridgelabz.workshop;

import java.util.ArrayList;
public class DeckOfCards {

	public ArrayList<String> cardsDeck = new ArrayList<>();
	
	String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
	String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "King", "Queen", "Ace"};
	/**
	 *  Simply created a method to print Welcome Message  
	 */

	public void welcome() {
		System.out.println("Welcome to the gaming world of Deck of Cards");
	}

	/**
	 *  In this method we have initialized the size of cards.
	 *  In this we are finding  the size of card.
	 */

	public void creatingDeckOfCards() {
		int numOfCards = suits.length * ranks.length;
		for (int i = 0; i < ranks.length; i++) {       // First we have to itterate for loop for ranks starting from index 0.
			for (int j = 0; j < suits.length; j++) {   // Now we have to ittreate the suits for all the indexes of ranks
				cardsDeck.add(ranks[i] + "----->" + suits[j]);
			}
		}

	}
}
