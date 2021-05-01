package weekFive;

//Create two classes that implement the Logger interface
public class SpacedLogger implements Logger {

	@Override
	public void Log(String log) {
//	The SpacedLogger should add spaces between each character of the String 
//	argument passed into its methods.
//	If the log method received “Hello” as an argument, it should print H e l l o
	String spacing = spaceIt(log);
		System.out.println(spacing);

	}
	
// 	once again making a method that can be used for both Log and Error
	private String spaceIt(String log) {
		StringBuilder spacer = new StringBuilder();
		
		for(int i = 0; i < log.length(); i++) {
			char spacey = log.charAt(i);
			spacer.append(spacey).append(' ');
		}

//	A nifty bit of code to chop off the last character of a string
		spacer.setLength(spacer.length() - 1);
		return spacer.toString();
	}

	@Override
	public void Error(String error) {
//	The error method should do the same, but with “ERROR:” preceding the 
//	spaced out input (i.e. ERROR: H e l l o)
		System.out.println("ERROR: " + spaceIt(error));
	}

}
