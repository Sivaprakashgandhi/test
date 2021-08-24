import java.util.HashMap;

public class Main {
	static	HashMap<Integer,String> trn=new HashMap<Integer,String>();
	
	public static int add(int a,int b) { return a+b; }
	public static int div(int a,int b) { return a/b; }
	
	public static int addEntry(int id ,String name){
		trn.put(id,name);
		return	trn.size();
	}
	
	public static String deleteEntry(int id) {
		String res=trn.remove(id);
		return res;
	}
	
	public static String  updateEntry(int id ,String name){ 
		return trn.put(id, name); 
	}
	
	public static String fetchEntry(int id) {
			return trn.get(id);
	}
	
	public static HashMap<Integer,String> fetchAllEntries(){
		return trn;
	}
}