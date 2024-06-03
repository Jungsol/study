package service;

public class Cat {
  // 전역변수, 인스턴스마다 개별적으로 메모리 공간을 할당받는다.
  String name;
  int age;

  // 클래스변수, 클래스 내 모든 인스턴스가 공유하는 메모리 공간을 사용한다.
  static int numberOfCats = 0;

  public Cat(String name, int age) {
    // 지역변수, 해당 메소드 내에서만 사용 가능하며, 메소드가 종료되면 메모리에서 해제된다.
    String nickname = "Kitty";
    this.name = name;
    this.age = age;
    numberOfCats++; // 클래스 변수는 인스턴스 생성 시마다 증가된다.
  }

  public void meow() {
    System.out.println(name + " is meowing!");
  }

  public static void main(String[] args) {
    Cat cat1 = new Cat("Luna", 3);
    Cat cat2 = new Cat("Tiger", 5);

    System.out.println("Number of cats: " + numberOfCats); // 클래스변수는 모든 인스턴스에서 공유되므로 2 출력

    cat1.meow(); // Luna is meowing!
    cat2.meow(); // Tiger is meowing!
  }
}