import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import javax.swing.JFileChooser;

public class Data {
	File[] f;
	ArrayList<String> s;
	ListIterator<String> sIt;
	Stack<String> imports;
	String defaultDir;
	Map<Integer, String> indeces;
	public Data(String[] s) {
		f = new File[s.length];
		imports = new Stack<String>();
		defaultDir = "C:\\Users\\Eric\\Desktop\\Eric Music\\Stems and Samples";
		indeces = new HashMap<Integer, String>();
		this.s = new ArrayList<String>();
		sIt = this.s.listIterator();
		for (int i = 0; i < s.length; i++) {
			imports.add(s[i]);
			sIt.add(s[i]);
			indeces.put(i,s[i]);
			f[i] = new File(s[i]);
		}
	}

	public void loadSamples(String[] paths) {
		int count = s.size()-1;
		if(paths.length==s.size())
		
		while(sIt.hasPrevious())
		{
			sIt.previous();
			sIt.remove();
			sIt.set(paths[count]);
			count++;
		}
	}
	public void fileSearch()
	{
		JFileChooser search = new JFileChooser(defaultDir);
		
		
	}
	public void sampleList(){
		for (String i: imports) {
			System.out.println(i);
			System.out.println();
		}
	}
}
