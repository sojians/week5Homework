package weekFive;

	//Create a class named App that has a main method.


public class App {

	public static void main(String[] args) {

//		In this class instantiate an instance of each of your logger classes 
//		that implement the Logger interface.

		Logger star = new AsteriskLogger();
		Logger space = new SpacedLogger();
		
//		Test both methods on both instances, passing in Strings of your choice.
		
		star.Log("camel");
		star.Error("badgers");

		space.Log("dolphin");
		space.Error("hippo");
		
		
	}

}
