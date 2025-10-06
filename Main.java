// Ulises Cantor
// 10/6/2025
// Menchukov
// Computer Programming 3
// Online Store Project
// This class tests various aspects of the methods that I created

import java.util.ArrayList;

public class Main {
   // Your tests go here! I expect you to make sure various parts of your program
   // work.

   public static void main(String[] args) {
      Store s = new Store(0, new ArrayList<ItemForSale>());
      Book girlDragon = new Book("The Girl with the Dragon Tattoo", 20, "August 2005", "MacLehose",
            new Author("August 15, 1954", "Stieg Larsson"));
      s.addItem(girlDragon);
      Movie godfather = new Movie("The Godfather", 10, "March 24, 1972", 175, "Francis Ford Coppola");
      s.addItem(godfather);
      Book konTiki = new Book("The Kon-Tiki Expedition", 25, "1948", "Norway",
            new Author("October 6, 1914", "Thor Heyerdahl"));
      s.addItem(konTiki);
      System.out.println(s.showItems());
      System.out.println(girlDragon.getCreator() + " published by " + girlDragon.getPublisher());
      System.out.println(godfather.getDuration() + " minutes");
      System.out.println(konTiki.getAuthorDOB());
      System.out.println(konTiki.getDate());
      s.sellItem(konTiki);
      Movie cidadeDeus = new Movie("City of God", 15, "August 30, 2002", 130, "Fernando Meirelles, Kátia Lund");
      s.addItem(cidadeDeus);
      System.out.println(cidadeDeus.getCreator());
      System.out.println("$" + s.getProfits());
      System.out.println(s.creator(godfather));
      System.out.println(s.showItems());
   }
}
