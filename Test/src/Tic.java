
import java.util.Scanner;
public class Tic {
	
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int[] board;
		int[] st = {1,2};
		System.out.println(st.length);
		String[][] entry = new String[3][3];
		int p,count,z,win_count,game_count;
		boolean b =true;
		boolean c = true;
		game_count=0;
		double playerX_count = 0;
		double playerO_count=0;
		String ans;
		double x,o;
		do
		{
			board=new int[9];
			win_count=0;
			count=0;
			entry[0][0]="1";
			entry[0][1]="2";
			entry[0][2]="3";
			entry[1][0]="4";
			entry[1][1]="5";
			entry[1][2]="6";
			entry[2][0]="7";
			entry[2][1]="8";
			entry[2][2]="9";
			

			for(int i =0;i<entry.length;i++)
			{
				for(int j = 0;j<entry.length;j++)
			    System.out.print(entry[i][j]+" ");
				System.out.println();
			}
			do
			{
				 
				if(win_count==0) 
			{System.out.println("Player X - Enter the position number you wish to mark:");
			
			
			p = sc.nextInt();
			++count;
			
			if(p<1 || p>9)
			{
				
				
				do
				{
					--count;
					System.out.println("Please enter number between 1 and 9 inclusive");
					p = sc.nextInt();
					if(p==board[0] || p==board[1] || p==board[2] || p==board[3] || p==board[4] || p==board[5] ||p==board[6] || p==board[7] || p==board[8])
		            {
		            	
		            	
		            	do
		            	{
		            		System.out.println("That position is not available");
		            		System.out.println("Player X - Enter the position number you wish to mark:");
		                    p = sc.nextInt();
		                    }while(p==board[0] || p==board[1] || p==board[2] || p==board[3] || p==board[4] || p==board[5] ||p==board[6] || p==board[7] || p==board[8]);
		            }
					++count;
				}while(p<1 || p>9);
				
				
			}
			
			else if(p==board[0] || p==board[1] || p==board[2] || p==board[3] || p==board[4] || p==board[5] ||p==board[6] || p==board[7] || p==board[8])
            {
            	
            	do
            	{
            		--count;
            		System.out.println("That position is not available");
            		System.out.println("Player X - Enter the position number you wish to mark:");
            		
                    p = sc.nextInt();

        			if(p<1 || p>9)
        			{
        				
        				
        				do
        				{
        					System.out.println("Please enter number between 1 and 9 inclusive");
        					p = sc.nextInt();
        					if(p>=1 && p<=9)
                             b = false;
        				}while(b);
        				
        				
        			}
        			 ++count;
            	}while(p==board[0] || p==board[1] || p==board[2] || p==board[3] || p==board[4] || p==board[5] ||p==board[6] || p==board[7] || p==board[8]);
            }
            
			
			
			z=count;
			 board[--z]=p;
			 System.out.println("Printing count value "+ count);
			switch(p)
			{
			
			case 1:
				entry[0][0] = "X" ;
				  
					for(int i =0;i<entry.length;i++)
					{    
						
						for(int j = 0;j<entry.length;j++)
						   
							System.out.print(entry[i][j]+" ");
						    System.out.println();
					}
					if((entry[0][0]==entry[0][1] && entry [0][0]==entry[0][2]) || (entry[0][0]==entry[1][0] && entry[0][0]==entry[2][0]) || (entry[0][0]==entry[1][1] && entry[0][0]==entry[2][2]))
						{System.out.println("We have a winner! Congratulations Player X!");
						 ++win_count;
						 ++game_count;
						 ++playerX_count;
						 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
						}
					else
					{if(count!=9)
						System.out.println("There is no winner yet!");}
					break;
					 
			case 2:
				entry[0][1]="X";
				for(int i =0;i<entry.length;i++)
				{    
					
					for(int j = 0;j<entry.length;j++)
					   
						System.out.print(entry[i][j]+" ");
					    System.out.println();
				}
				if((entry[0][0]==entry[0][1] && entry [0][0]==entry[0][2]) || (entry[0][1]==entry[1][1] && entry[0][1]==entry[2][1]))
				{System.out.println("We have a winner! Congratulations Player X!");
				 ++win_count;
				 ++game_count;
				 ++playerX_count;
				 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
				}
			else
			{if(count!=9)
				System.out.println("There is no winner yet!");}		
				break;
				
			case 3:
				entry[0][2]="X";
				for(int i =0;i<entry.length;i++)
				{    
					
					for(int j = 0;j<entry.length;j++)
					   
						System.out.print(entry[i][j]+" ");
					    System.out.println();
				}
				if((entry[0][0]==entry[0][1] && entry [0][0]==entry[0][2]) || (entry[0][2]==entry[1][2] && entry[0][2]==entry[2][2]) || (entry[0][2]==entry[1][1] && entry[0][2]==entry[2][0]))
				{System.out.println("We have a winner! Congratulations Player X!");
				 ++win_count;
				 ++game_count;
				 ++playerX_count;
				 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
				}
			else
			{if(count!=9)
				System.out.println("There is no winner yet!");}
				break;
				
			case 4:
				entry[1][0]="X";
				for(int i =0;i<entry.length;i++)
				{    
					
					for(int j = 0;j<entry.length;j++)
					   
						System.out.print(entry[i][j]+" ");
					    System.out.println();
				}
				if((entry[1][0]==entry[1][1] && entry [1][0]==entry[1][2]) || (entry[0][0]==entry[1][0] && entry[0][0]==entry[2][0]))
				{System.out.println("We have a winner! Congratulations Player X!");
				 ++win_count;
				 ++game_count;
				 ++playerX_count;
				 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
				
				}
			else
			{if(count!=9)
				System.out.println("There is no winner yet!");}
				break;
				
			case 5:
				entry[1][1]="X";
				for(int i =0;i<entry.length;i++)
				{    
					
					for(int j = 0;j<entry.length;j++)
					   
						System.out.print(entry[i][j]+" ");
					    System.out.println();
				}
				if((entry[1][0]==entry[1][1] && entry [1][0]==entry[1][2]) || (entry[1][1]==entry[0][1] && entry[1][1]==entry[2][1]) || (entry[0][0]==entry[1][1] && entry[0][0]==entry[2][2]))
				{System.out.println("We have a winner! Congratulations Player X!");
				 ++win_count;
				 ++game_count;
				 ++playerX_count;
				 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
				}
			else
			{if(count!=9)
				System.out.println("There is no winner yet!");}
				break;
				
			case 6:
				entry[1][2]="X";
				for(int i =0;i<entry.length;i++)
				{    
					
					for(int j = 0;j<entry.length;j++)
					   
						System.out.print(entry[i][j]+" ");
					    System.out.println();
				}
				if((entry[1][0]==entry[1][1] && entry [1][0]==entry[1][2]) || (entry[1][2]==entry[0][2] && entry[1][2]==entry[2][2]))
				{System.out.println("We have a winner! Congratulations Player X!");
				 ++win_count;
				 ++game_count;
				 ++playerX_count;
				 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
				}
			else
			{if(count!=9)
				System.out.println("There is no winner yet!");}
				break;
				
			case 7:
				entry[2][0]="X";
				for(int i =0;i<entry.length;i++)
				{    
					
					for(int j = 0;j<entry.length;j++)
					   
						System.out.print(entry[i][j]+" ");
					    System.out.println();
				}
				if((entry[2][0]==entry[2][1] && entry [2][0]==entry[2][2]) || (entry[0][0]==entry[1][0] && entry[0][0]==entry[2][0]) || (entry[2][0]==entry[1][1] && entry[2][0]==entry[0][2]))
				{System.out.println("We have a winner! Congratulations Player X!");
				 ++win_count;
				 ++game_count;
				 ++playerX_count;
				 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
				}
			else
			{if(count!=9)
				System.out.println("There is no winner yet!");}
				break;
				
			case 8:
				entry[2][1]="X";
				for(int i =0;i<entry.length;i++)
				{    
					
					for(int j = 0;j<entry.length;j++)
					   
						System.out.print(entry[i][j]+" ");
					    System.out.println();
				}
				if((entry[2][0]==entry[2][1] && entry [2][0]==entry[2][2]) || (entry[2][1]==entry[1][1] && entry[2][1]==entry[0][1]))
				{System.out.println("We have a winner! Congratulations Player X!");
				 ++win_count;
				 ++game_count;
				 ++playerX_count;
				 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
				}
			else
			{if(count!=9)
				System.out.println("There is no winner yet!");}
				break;
				
			case 9:
				entry[2][2]="X";
				for(int i =0;i<entry.length;i++)
				{    
					
					for(int j = 0;j<entry.length;j++)
					   
						System.out.print(entry[i][j]+" ");
					    System.out.println();
				}
				if((entry[2][0]==entry[2][1] && entry [2][0]==entry[2][2]) || (entry[2][2]==entry[1][2] && entry[2][2]==entry[0][2]) || (entry[0][0]==entry[1][1] && entry[0][0]==entry[2][2]))
				{System.out.println("We have a winner! Congratulations Player X!");
				 ++win_count;
				 ++game_count;
				 ++playerX_count;
				 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
				}
			else
			{if(count!=9)
				System.out.println("There is no winner yet!");}
				break;
				
				
			}
			}
			if(count<9 && win_count==0)
			{System.out.println("Player O - Enter the position number you wish to mark:");
            p = sc.nextInt();
            ++count;
            if(p==board[0] || p==board[1] || p==board[2] || p==board[3] || p==board[4] || p==board[5] ||p==board[6] || p==board[7] || p==board[8])
            {
            	
            	do
            	{
            		--count;
            		System.out.println("That position is not available");
            		System.out.println("Player O - Enter the position number you wish to mark:");
                    p = sc.nextInt();

        			if(p<1 || p>9)
        			{
        				
        				
        				do
        				{
        					System.out.println("Please enter number between 1 and 9 inclusive");
        					p = sc.nextInt();
        					if(p>=1 && p<=9)
                             b = false;
        				}while(b);
        				
        				
        			}
        			 ++count;
            	}while(p==board[0] || p==board[1] || p==board[2] || p==board[3] || p==board[4] || p==board[5] ||p==board[6] || p==board[7] || p==board[8]);
            }
            
            else if(p<1 || p>9)
            {
				
				
				do
				{  
					--count;
					System.out.println("Please enter number between 1 and 9 inclusive");
					p = sc.nextInt();
		            if(p==board[0] || p==board[1] || p==board[2] || p==board[3] || p==board[4] || p==board[5] ||p==board[6] || p==board[7] || p==board[8])
		            {
		            	
		            	
		            	do
		            	{
		            		System.out.println("That position is not available");
		            		System.out.println("Player O - Enter the position number you wish to mark:");
		                    p = sc.nextInt();
		                    }while(p==board[0] || p==board[1] || p==board[2] || p==board[3] || p==board[4] || p==board[5] ||p==board[6] || p==board[7] || p==board[8]);
		            }
		            ++count;
				}while(p<1 || p>9);
            }
           
            
            z=count;
            board[--z]=p;
            System.out.println("Printing count value "+count);
            switch(p)
			{
			
			case 1:
				entry[0][0] = "O" ;
				  
					for(int i =0;i<entry.length;i++)
					{    
						
						for(int j = 0;j<entry.length;j++)
						   
							System.out.print(entry[i][j]+" ");
						    System.out.println();
					}
					if((entry[0][0]==entry[0][1] && entry [0][0]==entry[0][2]) || (entry[0][0]==entry[1][0] && entry[0][0]==entry[2][0]) || (entry[0][0]==entry[1][1] && entry[0][0]==entry[2][2]))
					{System.out.println("We have a winner! Congratulations Player O!");
					 ++win_count;
					 ++game_count;
					 ++playerO_count;
					 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
					}
				else
				{if(count!=9)
					System.out.println("There is no winner yet!");}
					break;
					 
			case 2:
				entry[0][1]="O";
				for(int i =0;i<entry.length;i++)
				{    
					
					for(int j = 0;j<entry.length;j++)
					   
						System.out.print(entry[i][j]+" ");
					    System.out.println();
				}
				if((entry[0][0]==entry[0][1] && entry [0][0]==entry[0][2]) || (entry[0][1]==entry[2][1] && entry[0][1]==entry[1][1]))
				{System.out.println("We have a winner! Congratulations Player O!");
				 ++win_count;
				 ++game_count;
				 ++playerO_count;
				 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
				}
			else
			{if(count!=9)
				System.out.println("There is no winner yet!");}
				break;
				
			case 3:
				entry[0][2]="O";
				for(int i =0;i<entry.length;i++)
				{    
					
					for(int j = 0;j<entry.length;j++)
					   
						System.out.print(entry[i][j]+" ");
					    System.out.println();
				}
				if((entry[0][0]==entry[0][1] && entry [0][0]==entry[0][2]) || (entry[0][2]==entry[1][2] && entry[0][2]==entry[2][2]) || (entry[0][2]==entry[1][1] && entry[0][2]==entry[2][0]))
				{System.out.println("We have a winner! Congratulations Player O!");
				 ++win_count;
				 ++game_count;
				 ++playerO_count;
				 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
				}
			else
			{if(count!=9)
				System.out.println("There is no winner yet!");}
				break;
				
			case 4:
				entry[1][0]="O";
				for(int i =0;i<entry.length;i++)
				{    
					
					for(int j = 0;j<entry.length;j++)
					   
						System.out.print(entry[i][j]+" ");
					    System.out.println();
				}
				if((entry[1][0]==entry[1][1] && entry [1][0]==entry[1][2]) || (entry[0][0]==entry[1][0] && entry[0][0]==entry[2][0]))
				{System.out.println("We have a winner! Congratulations Player O!");
				 ++win_count;
				 ++game_count;
				 ++playerO_count;
				 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
				}
			else
			{if(count!=9)
				System.out.println("There is no winner yet!");}		
				break;
				
			case 5:
				entry[1][1]="O";
				for(int i =0;i<entry.length;i++)
				{    
					
					for(int j = 0;j<entry.length;j++)
					   
						System.out.print(entry[i][j]+" ");
					    System.out.println();
				}
				if((entry[1][0]==entry[1][1] && entry [1][0]==entry[1][2]) || (entry[1][1]==entry[0][1] && entry[1][1]==entry[2][1]) || (entry[0][0]==entry[1][1] && entry[0][0]==entry[2][2]))
				{System.out.println("We have a winner! Congratulations Player O)!");
				 ++win_count;
				 ++game_count;
				 ++playerO_count;
				 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
				}
			else
			{if(count!=9)
				System.out.println("There is no winner yet!");}
				break;
				
			case 6:
				entry[1][2]="O";
				for(int i =0;i<entry.length;i++)
				{    
					
					for(int j = 0;j<entry.length;j++)
					   
						System.out.print(entry[i][j]+" ");
					    System.out.println();
				}
				if((entry[1][0]==entry[1][1] && entry [1][0]==entry[1][2]) || (entry[1][2]==entry[0][2] && entry[1][2]==entry[2][2]))
				{System.out.println("We have a winner! Congratulations Player O!");
				 ++win_count;
				 ++game_count;
				 ++playerO_count;
				 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
				}
			else
			{if(count!=9)
				System.out.println("There is no winner yet!");}			
				break;
				
			case 7:
				entry[2][0]="O";
				for(int i =0;i<entry.length;i++)
				{    
					
					for(int j = 0;j<entry.length;j++)
					   
						System.out.print(entry[i][j]+" ");
					    System.out.println();
				}
				if((entry[2][0]==entry[2][1] && entry [2][0]==entry[2][2]) || (entry[0][0]==entry[1][0] && entry[0][0]==entry[2][0]) || (entry[2][0]==entry[1][1] && entry[2][0]==entry[0][2]))
				{System.out.println("We have a winner! Congratulations Player O!");
				 ++win_count;
				 ++game_count;
				 ++playerO_count;
				 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
				}
			else
			{if(count!=9)
				System.out.println("There is no winner yet!");}
				break;
				
			case 8:
				entry[2][1]="O";
				for(int i =0;i<entry.length;i++)
				{    
					
					for(int j = 0;j<entry.length;j++)
					   
						System.out.print(entry[i][j]+" ");
					    System.out.println();
				}
				if((entry[2][0]==entry[2][1] && entry [2][0]==entry[2][2]) || (entry[2][1]==entry[1][1] && entry[2][1]==entry[0][1]))
				{System.out.println("We have a winner! Congratulations Player O!");
				 ++win_count;
				 ++game_count;
				 ++playerO_count;
				 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
				}
			else
			{if(count!=9)
				System.out.println("There is no winner yet!");}
				break;
				
			case 9:
				entry[2][2]="O";
				for(int i =0;i<entry.length;i++)
				{    
					
					for(int j = 0;j<entry.length;j++)
					   
						System.out.print(entry[i][j]+" ");
					    System.out.println();
				}
				if((entry[2][0]==entry[2][1] && entry [2][0]==entry[2][2]) || (entry[2][2]==entry[1][2] && entry[2][2]==entry[0][2]) || (entry[0][0]==entry[1][1] && entry[0][0]==entry[2][2]))
				{System.out.println("We have a winner! Congratulations Player O!");
				 ++win_count;
				 ++game_count;
				 ++playerO_count;
				 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
				}
			else
				{if(count!=9)
				System.out.println("There is no winner yet!");}
				break;
				
				
			}
			}
			
			if(count==9 && win_count==0)
		    {System.out.println("This game is a tie!");
		     win_count++;
		     ++game_count;
			 System.out.println("Total number of games played to date "+game_count+"\n Player X has won "+(int)playerX_count +" games; Player O has won " + (int)playerO_count+" games.");
		    }
            
			}while(win_count==0);
			System.out.println("Do you want to play another game?\n Enter yes to play again \n Enter no to quit");
			 ans = sc.next();
			 if(ans.equalsIgnoreCase("yes"))
			 b = true;
			 else if (ans.equalsIgnoreCase("no"))
			 {   x= (playerX_count/game_count)*100;
			     o= (playerO_count/game_count)*100; 
				 System.out.println("Total number of games played "+game_count+"\n Player X has won "+(int)playerX_count+"("+(int)x+")%"+"games"+"\n Player O has won "+(int)playerO_count+"("+(int)o+")%" +" games" );
				 if(x>0)
					 System.out.println("The Grand Champion is Player X");
				 else if(o>x)
					 System.out.println("The Grand Champion is Player O");
				 b = false;

			 }
			 
			 else
			 {
				 do
				 {System.out.println("Please enter yes or no");
				  ans = sc.next();
				  if(ans.equalsIgnoreCase("yes"))
				  { b = true;
				    c = false;
				  }
						 else if (ans.equalsIgnoreCase("no"))
						 {   x= (playerX_count/game_count)*100;
						     o= (playerO_count/game_count)*100; 
							 System.out.println("Total number of games played "+game_count+"\n Player X has won "+(int)playerX_count+"("+(int)x+")%"+"games"+"\n Player O has won "+(int)playerO_count+"("+(int)o+")%" +" games" );
							 if(x>o)
								 System.out.println("The Grand Champion is Player X");
							 else if(o>x)
								 System.out.println("The Grand Champion is Player O");
							 b = false;
                             c=false;
						 }
						 
						 else
							 c = true;
				  
				 }while(c);
			 }
		}while(b);
		sc.close();
	}


}

