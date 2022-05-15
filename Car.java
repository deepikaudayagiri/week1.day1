package week1.day1;

public class Car {
	public void applybrake()
	{
		System.out.println("apply brake");
	}
	public void applygear()
	{
		System.out.println("apply gear");
	}
	public void switchonAC()
	{
		System.out.println("switch on the AC");
	}

public static void main(String[] args) {
 System.out.println("Actions for car");
 Car myCar = new Car();
 myCar.applybrake();
 myCar.applygear();
 myCar.switchonAC();
}

}
