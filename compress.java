

public class Compress{
	public static void main(String[] args){
		String original=IO.readString();
		String x=compress(original);
		IO.outputStringAnswer(x);
		
	}
	public static String compress(String original){
		String result="";
		int currentposition=0;
		
		for(int i=0; i<=original.length()-1;i++){
			int num=1;
			
			for(int k=i+1;k<=original.length()-1;k++){
				if(original.charAt(i)==original.charAt(k)){
					num++;
					if(k==original.length()-1){
					i=k;
					
					currentposition=k;
					break;
					}
				}
				else{
					i=k-1;
					currentposition=k-1;
					break;
				}
				}IO.outputStringAnswer("currpos " + Integer.toString(currentposition));
				IO.outputStringAnswer("num " + Integer.toString(num));
				IO.outputStringAnswer("i " + Integer.toString(i));
				
				if(num>1){
					result=result+Integer.toString(num)+original.charAt(i);
					if(currentposition==original.length()-1){
						break;
					}
				}else{
					result=result+original.charAt(i);
					
					if(currentposition==original.length()-1){
						result=result+original.charAt(i);
						break;
					}
				}
		}
		return result;
	}
}
					
	
