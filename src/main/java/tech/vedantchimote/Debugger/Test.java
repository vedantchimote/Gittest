package tech.vedantchimote.Debugger;

public class Test {

  int arr[] = new int[10];

  void add_to_arr() {
    this.arr[0] = 1;
    this.arr[1] = 2;
    this.arr[2] = 3;
    this.arr[3] = 4;
    this.arr[4] = 5;
    this.arr[5] = 6;
    this.arr[6] = 7;
    this.arr[7] = 8;
    this.arr[8] = 9;
    this.arr[9] = 10;
  }

  void random_Addition() {
    for (int i = 10; i >= 1; i--) {
      int random = (int) (Math.random() * 1000);
      System.out.println(random);
    }
  }


  public static void main(String[] args) {

    Test test = new Test();
    test.add_to_arr();
    test.random_Addition();

    for (int i : test.arr) {
      System.out.println(i);
    }

  }


}
