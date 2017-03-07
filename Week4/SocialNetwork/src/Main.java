import java.util.Scanner;

public class Main {
	static void Identifier(int id){
		if(id==1){
			new Twitter();
		}
		else if(id==2){
			new Facebook();
		}
		else if(id == 3){
			new Gmail();
		}
		else{
			new Linkedin();
		}
	}
	public static void main(String args[]){
		Scanner st = new Scanner(System.in);
		System.out.println("Enter existing social network :\n"
				+ "1 for Twitter \n 2 for Facebook \n 3 for"
				+ "Gmail \n 4 for Linkedin : ");
		int social_network_name = st.nextInt();
		Identifier(social_network_name);
		System.out.println("Thanks, You are registered.");
		
	}
}
