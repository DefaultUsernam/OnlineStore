// Ulises Cantor
// 10/6/2025
// Menchukov
// Computer Programming 3
// Online Store Project
// This Store class creates a Store object with an ArrayList of ItemForSale objects that stores its prices and ItemForSale objects and can obtain those ItemForSale objects' creators based on their ItemForSale object
// It can also add, remove, and display the ItemForSale objects for the Store

/*Implement the following functionality into the store:

  instance variables: 
    profit: how much money the store has made
    items:  instance variable (could be an array or LinkedList or ArrayList of one of the other classes)

  methods:
    showItems: displays all items available for sale
    addItem: adds an item for sale
    sellItem(itemName): removes the item from the store and adds its price to profit
    creator(itemName): displays who created the item in question

    You will need to include the following information to be stored in the inheritance heiarchy using the other classes:
      name of thing being sold
      price for things that are on sale
      names of creators of movies and books
      date of birth of book authors
      date that things are placed on sale
      duration of movies
      publisher of books

    Where these variables are stored and how to name them is up to you!
*/

import java.util.ArrayList;

public class Store {
  private int profit;
  private ArrayList<ItemForSale> items;

  public Store(int p, ArrayList<ItemForSale> i) {
    profit = p;
    items = i;
  }

  public String showItems() {
    String returnString = "";
    for (int i = 0; i < items.size(); i++) {
      if (i != 0) {
        returnString += ", ";
      }
      returnString += items.get(i).getName();
    }
    return returnString;
  }

  public void addItem(ItemForSale i) {
    items.add(i);
  }

  public void sellItem(ItemForSale itemName) {
    for (int i = 0; i < items.size(); i++) {
      if (items.get(i) == itemName) {
        profit += itemName.getPrice();
        items.remove(i);
        break;
      }
    }
  }

  public String creator(ItemForSale itemName) {
    for (int i = 0; i < items.size(); i++) {
      if (items.get(i) == itemName) {
        return items.get(i).getCreator();
      }
    }
    return "";
  }

  public int getProfits() {
    return profit;
  }
}
