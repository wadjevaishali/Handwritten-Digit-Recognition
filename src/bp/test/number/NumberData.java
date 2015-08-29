package bp.test.number;

import java.util.*;

public class NumberData {
	static final String[][] data = new String[][] {
		{"0","0000000000000000000000000000000000000000000000000011110000000000011001000000000001000010000000000100001000000000010000100000000001000010000000000100001000000000010000100000000001000110000000000010110000000000000110000000000000000000000000000000000000000000"},
		{"1","0000000000000000000000000000000000000000000000000000100000000000000110000000000001111000000000000101100000000000000110000000000000011000000000000001100000000000000110000000000000011000000000000001100000000000000110000000000000000000000000000000000000000000"},
		{"2","0000000000000000000000000000000000000000000000000011110000000000011001100000000001000010000000000000011000000000000001000000000000001100000000000000100000000000000100000000000000100000000000000111111000000000011111100000000000000000000000000000000000000000"},
		{"3","0000000000000000000000000000000000000000000000000011110000000000011001100000000001000010000000000000011000000000000011000000000000001100000000000000011000000000000000100000000001000010000000000110110000000000000110000000000000000000000000000000000000000000"},
		{"4","0000000000000000000000000000000000000000000000000000010000000000000011000000000000011100000000000001010000000000001001000000000001100100000000000100010000000000111111110000000000000100000000000000010000000000000001000000000000000000000000000000000000000000"},
		{"5","0000000000000000000000000000000000000000000000000011111000000000011000000000000001000000000000000101000000000000011111000000000001000110000000000000001000000000000000100000000011000110000000000110110000000000001110000000000000000000000000000000000000000000"},
		{"6","0000000000000000000000000000000000000000000000000000100000000000000110000000000000010000000000000011000000000000011111000000000001100010000000000100001100000000010000110000000001000010000000000110011000000000001111000000000000000000000000000000000000000000"},
		{"7","0000000000000000000000000000000000000000000000000111111000000000000000100000000000000110000000000000010000000000000011000000000000001000000000000001100000000000000100000000000000010000000000000011000000000000001100000000000000000000000000000000000000000000"},
		{"8","0000000000000000000000000000000000000000000000000011110000000000010001100000000001000010000000000100011000000000011111000000000001111100000000000100001000000000110000100000000001000010000000000110011000000000001111000000000000000000000000000000000000000000"},
		{"9","0000000000000000000000000000000000000000000000000011110000000000010001100000000011000010000000001100001000000000110001100000000001101100000000000011110000000000000010000000000000011000000000000001000000000000001100000000000000000000000000000000000000000000"},
	};
	
	public static final List<NumberSample> getSample(int num) {
		List<NumberSample> result = new ArrayList<NumberSample>();
		int size = data.length;
		for (int i=0; i<size; i++) {
			String[] entry = data[i];
			String k = entry[0];
			if (k.equals(String.valueOf(num))) {
				String s = entry[1];
				NumberSample ns = new NumberSample(num, s);
				result.add(ns);
			}
		}
		return result;
	}
}
