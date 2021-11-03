package hm1Q2JavaBasics;

public class MyInfo {
	public static String Myname = "Rahman Khan";
	public static int houseno = 35;
	public static char houseLocation = 'E';
	public static String StreetNo = " 106TH ST";
	public static String State = "New York  NY - ";
	public static int zipcode = 10029;
	public static boolean inUsa = true;
	
	public MyInfo() {
		
	}

	
		public static void myInfo() {
		System.out.println("\n My Name is " + Myname +"\n House No  "+  houseno + houseLocation + StreetNo + State + zipcode +"\n Yes I live in USA , Answer :"+ inUsa);
	
		}
		public static void main (String[] args) {
			myInfo();
		
		}
			
		//There is a will there is a way
}
