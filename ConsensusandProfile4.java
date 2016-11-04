import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ConsensusandProfile4 {
public static void main(String[] args)throws IOException{
	FileReader f=new FileReader("/home/hheting/Downloads/cons_pofile_results.txt");
	BufferedReader br=new BufferedReader(f);
	String str=br.readLine();
	while(str!=null){
		String[] a=str.split(" ");
		int max;
		char c;
		int[] ia=new int[a.length];
		for(int i=0;i<a.length;i++){
			ia[i]=Integer.parseInt(a[i]);//converting String a[i] to int ia[i]
		}
		if(ia[0]>ia[1]){max=ia[0]; c='A'; }
		else {max=ia[1]; c='G';}
		if(max>ia[2]){;}
		else {max=ia[2]; c='C';}
		if(max>ia[3]){;}
		else {max=ia[3]; c='T';}
		System.out.print(c);
		max=0;
		c=' ';
		str=br.readLine();
	}
} 
}
