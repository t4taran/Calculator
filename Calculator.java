import java.util.*;
class Addition{
	float add(float v1,float v2){
	return v1+v2;
	} 
}

class Subtraction{
	float sub(float v1,float v2){
	return v1-v2;
	}
} 
class Multiplication{
	float mul(float v1,float v2){
	return v1*v2;
	}
}

class Division{
	float div(float v1,float v2){

	return (float)v1/v2;
	}

}

class Modulo {
	float mod(float v1,float v2){
	return (float)v1%v2;

	}
}


class Calculator{
	public static void main(String args[]){
	
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to TB's Caluculator");
		System.out.println("Enter the 1st number");
		float v1=s.nextFloat();
		System.out.println("Enter the 2nd number");
		float v2=s.nextFloat();
		System.out.println("===OPERATIONS AVAILABLE===== ");
		System.out.println("1)add\n2)sub\n3)multiply\n4)div\n5)moddiv");
		System.out.println("ENTER YOUR CHOICE ");
		int choice =s.nextInt();
		switch(choice)
		{
		case 1:
				Addition ad=new Addition();
				float addition =ad.add(v1,v2);
				System.out.println("Sum ="+addition);
				
		break;

		case 2:
				Subtraction sb=new Subtraction();
				float subtraction =sb.sub(v1,v2);
				System.out.println("Subtraction ="+subtraction);
		break;

		case 3:
				Multiplication ml=new Multiplication();
				float multiplication =ml.mul(v1,v2);
				System.out.println("Multiplication ="+multiplication);
		break;

		case 4:
				Division dn=new Division();
				float division =dn.div(v1,v2);
				System.out.println("Div ="+division);
		break;

		case 5:
				Modulo md=new Modulo();
				float modulo =md.mod(v1,v2);
				System.out.println("Mod ="+modulo);
		break;
		
		default:
		System.out.println("Invalid choice ");



		}


	}






}