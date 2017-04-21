package challenge.util;

import java.util.List;

/**
 * @author Kevin Fries
 *  Simplify expressions of multiple numeric ranges of ZIP codes
 */
public class ZipCodeRangeSimplifier {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if (args.length == 0)
			System.err.println("Enter space-separated pairs of ZIP codes, surrounded by brackets.  E.g. [94133,94133] [94200,94299] [94600,94699]");
		simplifyRangeSet(ZipCodeParser.parse(args));
	}

	private static List<ZipCodeRange> simplifyRangeSet(List<ZipCodeRange> ranges) {
		return ranges;
	}
}