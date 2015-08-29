package convolutional;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadTest {

	public static void main(String[] args) {
		Convolutional cn = new Convolutional();
		try {
			cn.getNN().load("5000.nn");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		ConvolutionalTester.test(cn, 1);
	}
}