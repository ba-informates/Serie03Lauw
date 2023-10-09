class AffichageBoucles {

    public static void main(String[] args){
	{
	    // Exemple 1

	    System.out.println("Exemple 1:");
	    int n = 5;
	    int a = 2;
	    for(a = 3; a < n + 1; a = a++) {
		System.out.println(a-1);
		a = a + 1;
	    }
	}

	{
	    // Exemple 2
	    System.out.println("Exemple 2:");
	    
	    int n = 3;
	    int b = 5;
	    while (b <= 4 * n) {
		System.out.println(b);
		b = b * 2;
	    }
	    System.out.println(b);
	}

	{
	    // Exemple 3
	    System.out.println("Exemple 3:");
	    
	    int n = 3;
	    int c = 6 * n;
	    do {
		c = c - n * 2;
		System.out.println(c);
	    } while (c >= 0);
	    System.out.println(c);
	}

	{
	    // Exemple 4
	     System.out.println("Exemple 4:");

	    int n = 3;
	    int d = 3;
	    while (d < n) {
		d = d + 1;
	    }
	    System.out.println(d);
	}

	{
	    // Exemple 5
	     System.out.println("Exemple 5:");
	    int n = 3;
	    int e = 3;
	    do {
		e = e + 1;
	    } while (e < n);
	    System.out.println(e);
	}

	{
	    // Exemple 6
	     System.out.println("Exemple 6:");
	    int n = 3;
	    int f = 3;
	    for (f = 0; f < n; f = f + 1);
	    System.out.println(f);

	}
    }
}
