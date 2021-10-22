package itmedia;

public class task02 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int result = 0;
		int i = 1;
		int param = Integer.parseInt(args[0]);
		int cnt = 0;
		while (true) {
		    if (i < 2) {
		    	i++;
		    	continue;
		    }
		    if (i % 2 == 0 && i != 2) {
		    	i++;
		    	continue;
		    }

		    for (int j = 3; j <= Math.sqrt(i); j+=2) {
		    	if (i % j == 0) {
			    	i++;
			    	continue;
		        }
		    }
	    	cnt++;
		    if (cnt >= param) {
		    	result = i;
		    	break;
		    }
	    	i++;
		}
		System.out.println(result);
	}

}
