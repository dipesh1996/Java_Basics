import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
import java.io.*;

class Solution {
	public int num(String[] emails) {
		int count = 0, i;
		final String regx = "^[a-z|A-Z]+[a-z|A-Z|.]+@([a-z|A-Z]+.)+[a-z|A-Z]{2,4}$";
		final Pattern pattern = Pattern.compile(regx);
		String email;
		for (i = 0; i < emails.length; i++) {
			email = emails[i];
			for (int j = 0; j < email.length(); j++) {
				Matcher validator = pattern.matcher(email);
				Matcher dot = email.matcher(".");
				if (dot.find()) {
					dot.replaceAll("");
					count++;
				}
				break;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		Solution S = new Solution();
		System.out.println(S.num(args));
	}
}
