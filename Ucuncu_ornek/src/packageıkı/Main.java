package packageýký;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		String ornek3="Sed,ut;perspiciatis?undeomnis-iste!natus.error!sit.voluptatem ";
	             String ayrac =",;-!.";
	             StringTokenizer st3= new StringTokenizer(ornek3, ayrac);
	             System.out.println("\n Token sayýsý="+st3.countTokens());
	 
	            while (st3.hasMoreElements())
	                   System.out.println(st3.nextToken());
	            }}
