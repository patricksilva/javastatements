class Statements02 {
	
	public static void main(String[] args){
		
		int minParticipants = 8;
		int room = 5;
		int i = 0;
		int j = 0;
		// Understanding Advanced Flow Control
		// Nested Loops
		// Adding Optional Labels
		// The break Statement
		// The continue Statement
		int array[][] = { { 1, 6, 7 }, { 2, 5, 1, 0 }, { 2, 4, 1, 2, 1 } };
		
		optionalLabel: for ( i = 0 ; i < array.length ; i++ ) {
			for ( j = 0 ; j < array[i].length ; j++ ) {
				System.out.print(array[i][j] + " ");
				
				if ( j > 2)
					continue optionalLabel;
			}
			System.out.println();
		}
		
		for ( int linha[] : array ) {
			for (int valor : linha) {
				System.out.print(valor + " ");
			}
			System.out.println();
		}
		
		j = 0; // Resets j
		for( i = 0 ; i < minParticipants ; i++) do {
			System.out.printf(String.format("Cliente %s email: cliente%s@cliente.com.br\n", i, i));			
			
			if(j == 1){
				break; // No problem when it is inside a switch or loop
			}
		} while( j++ < room );
		
		int y = 10;
		final int x;
		if(y > 5) {
			x = 2 * y;
		} else {
			x = 3 * y;
		}
	}
	
}