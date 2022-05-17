package javasessions;

public class ConditionalOperators {

	public static void main(String[] args) {
		
		int i = 10;
		int j = 10;
		
		System.out.println(i==j);// Not the right method 
		
		if(i==j) 
		{
			System.out.println("Both are equal");
		}
			
		else 
		{
			System.out.println("Both are not equal");
		}
		
		if(j>=i) {
			System.out.println("hi");
		}
		
		if(i<=j) {
			System.out.println("hello");
		}
		
		if(true) {
			System.out.println("Hello Naveen");
		}
		
		//Example of Dead Code/unreachable code
		else {
			System.out.println("Bye");
		}
		
		//Above code is not good way of writing a code.
		
		//Correct way: where below code will not be treated as Dead Code because this flag variable can change in future.
		
		boolean flag = true;
		if(flag)
		{
			System.out.println("hi");
		}
		else
		{
		System.out.println("bye");
		}
		
		//nested if condition
		int marks = 90;
		if (marks <=100)
		{
			if(marks >=90)
			{
				System.out.println("A Grade");
			}
			
			if(marks <= 80)
			{
				System.out.println("B Grade");
				if(marks<= 50)
				{
					System.out.println("C Grade");
				}
				else {
					System.out.println("Good Bye!!!");
				}
			}
			else {
				System.out.println("Good Bye!!!");
			}
		}
		else
		{
			System.out.println("Wrong Marks!!!");
		}
		
		
		//Below code is not optimized as it is going to check all the if conditions
//		String browser = "chrome";
//		if(browser.equals("chrome"))
//		{
//			System.out.println("Launch Chrome");
//		}
//		if (browser.equals("firefox")) {
//			System.out.println("Launch Firefox");
//		}
//		if (browser.equals("safari")) {
//			System.out.println("Launch Safari");
//		}
//		else {
//			System.out.println("Please pass the right browser");
//		}
		
		//Always use .equals for string
		//Slightly Better way of writing same code:
		String browser = "chrome";
		if(browser.equals("chrome"))
		{
			System.out.println("Launch Chrome");
		}
		else if(browser.equals("firefox"))
		{
			System.out.println("Launch Firefox");
		}
		else if (browser.equals("safari")) {
			System.out.println("Launch Safari");
		}
		else {
			System.out.println("Please pass the right browser");
		}
		
		//given three numbers different numbers are there. Find highest number.
		int x = 100;
		int y = 200;
		int z = 300;
		
		
		//&& operator (short circuit operator)- if first condition is not satisfied then it will not check second condition.
		//& operator - it checks all the conditions
		
		if (x > y && x > z) {
			System.out.println("x is the greatest number");
		}
		
		else if (y > z) {
			System.out.println("y is the greatest");
		}
		
		else {
			System.out.println("z is the greatest number");
		}
	}

}
