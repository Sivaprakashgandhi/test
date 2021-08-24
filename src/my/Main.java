package my;
import java.util.HashMap;
import java.util.Map;

public class Main {
	static	HashMap<Integer,String> trn=new HashMap<>();
	
	private Main() {
		throw new IllegalStateException("Utility class");
	}
	
	public static int add(int a,int b) { return a+b; }
	public static int div(int a,int b) { return a/b; }
	
	public static int addEntry(int id ,String name){
		trn.put(id,name);
		return	trn.size();
	}
	
	public static String deleteEntry(int id) {
		return trn.remove(id);
	}
	
	public static String  updateEntry(int id ,String name){ 
		return trn.put(id ,name); 
	}
	
	public static String fetchEntry(int id) {
			return trn.get(id);
	}
	
	public static Map<Integer,String> fetchAllEntries(){
		return trn;
	}
}