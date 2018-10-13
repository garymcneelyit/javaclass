class Constants

{  public static void main ( String[] args )

{ 	
	// constant hockey.
	final int HATTRICK = 3 ;
	final int GOAL = 1 ;
	final int  ASSIST = 1 ;
	//any word can go here
	int ht , gl , as , total ;
	ht = 2 * HATTRICK ;
	gl = 2 * GOAL ;
	as = 3 * ASSIST ;
	total = ( ht + gl + as ) ;
	
	System.out.println( " Points " + total ) ;



}


}