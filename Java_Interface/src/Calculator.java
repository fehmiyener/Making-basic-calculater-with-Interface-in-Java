

public interface Calculator {
	
	//Interface’de metotların ancak imzaları bulunabilir.
	// metodların body'si olmaz yani süslü parantez yok ; vardır. 
	//Interface; kurucu (constructor) veya yıkıcı (destructor) içeremez. Ancak imzalarını içerebilir.
    // sınıfın yapabileceği kabiliyeti gösterir, can-do ilişkisi

	    int add(int a, int b);
	    int subtract(int a, int b);
	    int multiply(int a, int b);
	    int divide(int a, int b);
	
	    //interface'e değişken de tanımlanabilir.	    
}

