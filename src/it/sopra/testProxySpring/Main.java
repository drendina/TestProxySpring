package it.sopra.testProxySpring;

public class Main {

	  public static void main(String[] args) {
	    //creo un instanza del bean 
	    SimpleInterface realBean = new SimplePojo();

	    System.out.println("##### bean #####");
	    realBean.f1();
	    System.out.println();
	    realBean.f2();
	    System.out.println();

	    //creo un instanza del proxy
	    SimpleInterface proxy = new SimpleProxy(new SimplePojo());

	    System.out.println("##### proxy #####");
	    proxy.f1();
	    System.out.println();
	    proxy.f2();
	  }
	}