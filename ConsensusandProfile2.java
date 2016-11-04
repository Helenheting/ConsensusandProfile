import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ConsensusandProfile2 {
public static void main(String[] args)throws IOException{
	FileReader f=new FileReader("/home/hheting/Downloads/rosalind_cons_out.txt");
	BufferedReader br=new BufferedReader(f);
	FileWriter w=new FileWriter("/home/hheting/Downloads/cons_pofile.txt");
	BufferedWriter bw=new BufferedWriter(w);
	String str=br.readLine();
	str=br.readLine();
	ArrayList<String[]>arrayList =new ArrayList();//using ArrayList<String[]> to save two-dimensional array data
	while(str!=null){
		String[] a=str.split("");
			arrayList.add(a);
			str=br.readLine();
	}
	String[][] test =(String [][])arrayList.toArray(new String[0][0]);
	String[][] newarray=new String[test[0].length][test.length];
	for(int i=0;i<test.length;i++){
		for(int j=0;j<test[i].length;j++){
			newarray[j][i]=test[i][j];
			}
	}
	for(int i=0;i<newarray.length;i++){
		for(int j=0;j<newarray[i].length;j++){
			bw.write(newarray[i][j]);	
		}bw.write("\n");
	}
	br.close();bw.close();
}
}


