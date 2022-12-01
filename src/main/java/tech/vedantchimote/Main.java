package tech.vedantchimote;

import tech.vedantchimote.Explore.Explore;

public class Main {

  public static void main(String[] args) {
    System.out.println("Hello world!");

    Explore explore = new Explore();
    System.out.println(explore.getName());
    System.out.println(explore.getNumber());

    Thread t = new Thread(new Runnable() {

      @Override
      public void run() {
        System.out.println("Yes it is running all good");
      }
    });
    t.start();

    System.out.println("For just the testing purpose");

    System.out.println("Just making some another changes");

    System.out.println("Just making one more change to view");

    int a = (int) Math.random();

    Integer b = new Integer(12);
    System.out.println(b);

    System.out.println("First humne kuch change kiya hai");

    System.out.println("Lo ek aur change kar diya");
    
    System.out.println("Right from the github desktop, it is edited");
  }
}
