package TennisScore;

public class ScoreBoard{
		int gameA,gameB;
		int setA,setB;
		int matchA,matchB;
		void initBoard(String);
		void incrementGame(boolean);
		void incrementSet(boolean);
		void incrementMatch(boolean);
		void printBoard();
		//boolean conflictCheck();
		
}

public static String getScore(String score) {
    String[] arr = {"0","15","30","40","A"};
    char[] c = score.toUpperCase().toCharArray();
    int pointA=0,pointB=0;
    System.out.println("Length of Score String is:"+score.length());
    for(int i=0;i<score.length();i++){
           if(c[i]=='A'){
                  pointA++;
           }
           else if( c[i]=='B'){
                  pointB++;
           }
           
           if(pointA == 4 && Math.abs(pointA - pointB) >= 2){
                  System.out.println("A won a game");
                  incrementGame(1);
                  pointA=0;
                  pointB=0;
           }
           
           else if(pointB == 4 && Math.abs(pointA - pointB) >= 2){
                  System.out.println("B won a game");
                  incrementGame(0);
                  pointA=0;
                  pointB=0;
           }
           else if (pointA == pointB) {
           System.out.println("deuce"); 
           }
           else{
                  String leader;
                  if(pointA>pointB){
                        leader = "A";
                        
                  }
                  else{
                        leader = "B";
                        
                  }
                  
                  System.out.println("Advantage to:"+ leader);
           }
           System.out.println("player A is:"+arr[pointA%5]);
           System.out.println("player B is:"+arr[pointB%5]);
           System.out.println("--------------------");
    }
    return "ABC";
    
 }  


void initBoard(String game){
	getScore(game);
}

void incrementMatch(boolean player){
	if(player)
		matchA++;
	else
		matchB++;
	if(matchA>matchB)
		System.out.printLn("A wins");
	else
		System.out.printLn("B wins");
}

public void IncrementGame(boolean playerA)
{
 if(playerA)
  gameA++;
 else
  gameB++;
  
 if((gameA>=6)||(gameB>=6))
 {
  if((gameA>gameB)&&(gameA-gameB==2))
    IncrementMatch(true);
  if((gameB>gameA)&&(gameB-gameA==2))
    IncrementMatch(false);
  if(gameA==gameB)
    {gameA = 6; gameB = 6;}
    
 }
  
}