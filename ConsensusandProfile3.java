import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class ConsensusandProfile3 {
	public static void main(String[] args)throws IOException{
	FileReader e=new FileReader("/home/hheting/Downloads/cons_pofile.txt");
	BufferedReader be = new BufferedReader(e);
	FileWriter rr=new FileWriter("/home/hheting/Downloads/cons_pofile_results.txt");
	BufferedWriter brr = new BufferedWriter(rr);
	String Line=be.readLine();
	int cA=0,cG=0,cC=0,cT=0;
	int countA=0,countG=0,countC=0,countT=0;
	while (Line!=null){
		cA=Line.indexOf("A");
		cG=Line.indexOf("G");
		cC=Line.indexOf("C");
		cT=Line.indexOf("T");
		while(cA!=-1){
			cA=Line.indexOf("A",cA+1);
			countA=countA+1;
		}
		while(cG!=-1){
			cG=Line.indexOf("G",cG+1);
			countG=countG+1;
		}
		while(cC!=-1){
			cC=Line.indexOf("C",cC+1);
			countC=countC+1;
		}
		while(cT!=-1){
			cT=Line.indexOf("T",cT+1);
			countT=countT+1;
		}
		brr.write(countA+" "+countG+" "+countC+" "+countT+"\n");
		cA=0;cG=0;cC=0;cT=0;
		countA=0;countG=0;countC=0;countT=0;
		Line=be.readLine();
	}
	be.close();
	brr.close();
	}
}

