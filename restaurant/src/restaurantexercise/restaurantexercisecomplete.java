package restaurantexercise;
import java.util.ArrayList;
import java.util.stream.*;
import java.util.*;

public class restaurantexercisecomplete {

		public static void main(String[] args)
		{
			// First part: for the chef
			int banknote;
			int totalprice;
			
			String Menu[] = new String[5];
		    Scanner scan = new Scanner(System.in);
		    System.out.println("Hello Chef, please enter today's plates one by one:");
		        for(int i = 0; i < 5; i++)
		        {
		            Menu[i] = scan.nextLine();
		            //si se necesita hacer una lista: List<String> MenuList = Arrays.asList(Menu);//
		        }
		    
		     // Second part: for the accountant
		    int [] priceEachPlate= new int [5];
		    Scanner scan3 = new Scanner(System.in);
		    System.out.println("Hello Accountant, please enter today's plate' prices one by one:");
		        for(int h = 0; h < 5; h++)
		        {
		            priceEachPlate[h] = scan3.nextInt();
		            
		        }
	     
			
			//Third part: for the client:
		    String chosenPlate[]= new String [5];
			Scanner scan2 = new Scanner(System.in);
			System.out.println("Hello Customer, please write the plates you want");
			for(int j = 0; j < 5; j++)
			    {
			         chosenPlate[j] = scan2.nextLine();     
			         //List<String> chosenPlateList = Arrays.asList(chosenPlate);//
			    }
					scan2.close();
					
			/* Esta parte sería para preguntar al cliente si quiere seguir pidiendo, no he entendido porqué no me funciona.
			
			Scanner scan4 = new Scanner(System.in);
			String Choice= "";
			System.out.println("Do you want something else? (yes or no)");
			Choice = scan4.nextLine();

			if (Choice== "yes")
			    {
				System.out.println("Hello Customer, please select your plates (from 1 to 5)");
			    }
			else if (Choice!= "yes" || Choice!= "no") 
			    {
				System.out.println("This number is not valid");
			    }
			else 
			    {
				System.out.println("Thanks for your order");
				scan4.close();*/		
					
			/*Phase 4 : Eso sería en el caso que el cliente no elija todo el  menu
			List<String> MenuList = Arrays.asList("ensalada", "bocadillo", "queso", "pastel", "helado");
	         
	        List<String> chosenPlateList = Arrays.asList("ensalada", "bocadillo", "helado");
	         
	        chosenPlateList.retainAll(MenuList);
	         
	        System.out.println(chosenPlateList);*/
					
					
			//Phase 4bis: Caso en el cual el cliente ha pedido todo lo que propone el menu//
					String Menu2[] = {"ensalada", "bocadillo", "queso", "pastel", "helado"}; 
			        String chosenPlate2[] = {"ensalada", "bocadillo", "queso", "pastel", "helado"}; 
			        if (Menu2 == chosenPlate2)
							{
								int[] chosenPlatePrice2 = {10,10,20,5,5};
								int sum = IntStream.of(chosenPlatePrice2).sum();
								
								System.out.println("The sum is " + sum);
							}
								 
							else
							{
								System.out.println("Sorry, what you ordered is currently unavailable"); 
							}
		}
}

// En esta Phase4bis tengo un problema: no entiendo porqué me sale que Menu2 != chosenPlate2//
// Si hago un test para dar el precio final, funciona, me sale 50 euros//

			
		
		
	
 

		
		 
			
			





					
		






	    




