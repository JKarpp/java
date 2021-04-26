public class FizzBuzz {

	public static void main(String[] args) {
		
		for(int x = 0 ; x <= 100; x++){
			if(x % 2 == 0) {
				System.out.println( x + ":" + "Fizz!");
			}
			if (x % 5 == 0) {
				System.out.println(x + ":" + "Buzz!");
			}
			if(x % 10 == 0) {
				System.out.println(x + ":" + "FizzBuzz!");
			}
			else {
				System.out.println(x + ":Not Divisable by 2 ,5, or 10");
			}
		}
		
	}

}