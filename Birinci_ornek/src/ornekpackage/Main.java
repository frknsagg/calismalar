package ornekpackage;

import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		String ornek1="Lorem ipsum dolor sit amet consectetur adipiscing elit";
        StringTokenizer st1 = new StringTokenizer(ornek1);

         while(st1.hasMoreTokens())
              System.out.println(st1.nextToken());

	}

}
