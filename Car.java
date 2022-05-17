package javasessions;

public class Car {
	
	String name;
	int price;
	String color;
	static int wheels = 4;
	

	public static void main(String[] args) {
		Car c1 = new Car();
		c1.name = "BMW";
		c1.price = 30;
		c1.color = "Red";
		//c1.wheels = 4;
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.price = 40;
		c2.color = "White";
		//c2.wheels = 4;
		
		Car c3 = new Car();
		c3.name = "Honda";
		c3.price = 20;
		c3.color = "Black";
		//c3.wheels = 4;
		
		
		//wheels=4 is common property value though property are same i.e. name, price, color, wheels
		//static values share only one copy for all the object. We can use it here.
		
		// static values store in CMA(Common Memory Allocation)/Permanent  Generation but after JDK it is known as Metaspace
		
		//other objects store in Heap memory and their reference in stack memory
		
		
		System.out.println(c1.name+ " " + c1.price+ " "+c1.color+ " "+ Car.wheels);
		
		//how to access statis vars:
		//1. by using class name--- only static property can be accessed and this is the best practice
		System.out.println(Car.wheels);
		//System.out.println(Car.name);// this is not allowed
		
		//2. use it directly
		System.out.println(wheels);
		//System.out.println(price);// this is not allowed
		
		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
		//Cannot make a static reference to the non-static field price
		
		//3. Can we access static variable with using object ref variable?
		System.out.println(c1.wheels);// this will give warning that this is not the right way of calling status variable with object ref.
		
		//Warning: The static field Car.wheels should be accessed in a static way
		
		//Before JDK1.8- there was static memory allocation for CMA which eventually results in static memory suffocation
		//after JDK1.8, metaspace was introduced which is dynamic  memory allocation which uses RAM for memory allocation
	}

}
