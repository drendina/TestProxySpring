package it.sopra.testProxySpring;

public class SimplePojo implements SimpleInterface {

	  @Override
	  public void f1() {
	    System.out.println("F1");
	    f2();
	  }

	  @Override
	  public void f2() {
	    System.out.println("F2");
	  }
	}