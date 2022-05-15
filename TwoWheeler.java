package week1.day1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noofmirrors=2;
	long chasisNumber = 98770;
	boolean punctured;
	String bikename="ktm";
	double runningKM=999.00;
	
	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler();
		System.out.println("no. of wheels is "+obj.noOfWheels);
		System.out.println("no. of mirrors is "+obj.noofmirrors);
		System.out.println("Chasis number is "+obj.chasisNumber);
		System.out.println(" is punctured "+obj.punctured);
		System.out.println("Bike name  is "+obj.bikename);
		System.out.println("Running KM is "+obj.runningKM);
	}
	

}
