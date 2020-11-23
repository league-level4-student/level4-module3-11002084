package _01_introduction;

@SuppressWarnings("serial")
public class CustomException extends Exception{
	void terminate() {
		System.exit(0);
	}
}
