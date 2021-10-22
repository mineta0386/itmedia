package itmedia;

public class task01 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String result = "";
		for (int i = args[0].length(); i > 0; i--) {
			char c = args[0].charAt(i-1);
			if (Character.isUpperCase(c)) {
				result += String.valueOf(c).toLowerCase();
			} else {
				result += String.valueOf(c).toUpperCase();
			}
		}
		System.out.println(result);
	}

}
