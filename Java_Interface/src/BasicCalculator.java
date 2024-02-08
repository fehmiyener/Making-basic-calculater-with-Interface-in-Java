
public class BasicCalculator implements Calculator {
	
	    //Bir class sadece bir class'ı miras alabilir.
		//Bir class yüzlerce interface'i implement'e edebilir.
	    //override edebiliriz etmeyedebiliriz.
    @Override
    public int add(int a, int b) {
        return a + b;
    }

   
    public int subtract(int a, int b) {
        return a - b;
    }

    
    public int multiply(int a, int b) {
        return a * b;
    }

   
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero");
        }
        return a / b;
    }
    
}

