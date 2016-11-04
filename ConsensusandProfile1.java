import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConsensusandProfile1 {
public static void main(String[] args)throws IOException{
	FileReader f=new FileReader("/home/hheting/Downloads/rosalind_cons.txt");
	BufferedReader br=new BufferedReader(f);
	FileWriter w=new FileWriter("/home/hheting/Downloads/rosalind_cons_out.txt");
	BufferedWriter bw=new BufferedWriter(w);
	String str=br.readLine();
	if(str.contains("Rosalind")){
		str=br.readLine();
	}
	while(str!=null){
		if(str.contains("Rosalind")){
			bw.write("\n");
		}
		else{
			bw.write(str);
		}
		str=br.readLine();
	}
	br.close();
	bw.close();
}
}
