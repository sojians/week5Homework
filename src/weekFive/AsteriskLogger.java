package weekFive;

//Create two classes that implement the Logger interface
public class AsteriskLogger implements Logger {

	@Override
	public void Log(String log) {
//	The log method on the AsteriskLogger should print out the String it 
//	receives between 3 asterisks on either side of the String (e.g. if the 
//	String passed in is “Hello”, then it should print ***Hello*** 
//	to the console.
		String message = starIt(log);
		System.out.println(message);
	}

//	Creating a method to be used for Log and Error
	private String starIt(String log) {
		return "*** " + log + " ***";
	}

	@Override
	public void Error(String error) {

//	The error method on the AsteriskLogger should print the String it receives 
//	inside a box of asterisks, with the String preceded by the word “ERROR:”. 
//	For example, if “Hello” is the argument, the following should be printed:
//
//	****************
//	***Error: Hello***
//	****************
		String message = starIt("ERROR: " + error);
		String stars = "*".repeat(message.length());
		
		System.out.println(stars);
		System.out.println(message);
		System.out.println(stars);

	}

}
