package it.sopra.testProxySpring;

public class SimpleProxy implements SimpleInterface {

	  private SimpleInterface delegate;

	  public SimpleProxy(SimpleInterface delegate) {
	    super();
	    this.delegate = delegate;
	  }

	  @Override
	  public void f1() {
	    System.out.println("DELEGATING F1()");
	    delegate.f1();
	  }

	  @Override
	  public void f2() {
	    System.out.println("DELEGATING F2()");
	    delegate.f2();
	  }
	}