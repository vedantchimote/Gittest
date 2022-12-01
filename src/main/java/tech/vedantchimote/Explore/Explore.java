package tech.vedantchimote.Explore;

import lombok.Getter;

@Getter
public class Explore {

  String name = "Explore";
  int number = 100;

  public Explore(String name, int number) {
    this.name = name;
    this.number = number;
  }

  public Explore() {

  }

  public void setName(String name) {
    this.name = name;
  }

  public void setNumber(int number) {
    this.number = number;
  }
}
