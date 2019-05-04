package edu.cnm.deepdive;

interface Root {
  void doSomething();
}

interface Branch1 extends Root {

  default void doSomething() {
    System.out.println("Branch1::doSomething()");
  }

}

interface Branch2 extends Root {

  default void doSomething() {
    System.out.println("Branch2::doSomething()");
  }

}

public class Diamond implements Branch1, Branch2 {

  @Override
  public void doSomething() {
    // HOW CAN WE DO THE FOLLOWING??
    // Branch2.doSomething();
  }

}
