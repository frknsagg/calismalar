package packagebir;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		
		String ornek2="Lorem,ipsum,dolor,sit,,,amet,consectetur";
        StringTokenizer st2= new StringTokenizer(ornek2,",");
        while(st2.hasMoreTokens())
               System.out.println(st2.nextToken());

	}

}
