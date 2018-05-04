
//import java.util.Scanner;

public class Attracties {
		public static int name;
		
		void draait() {
		System.out.println("Attractie " + name + " draait");
		}
		
	public static void main(String[] args) {
	
		//Scanner s = new Scanner(System.in);
		//System.out.println("Welkom op de Kermis! Voer getal in:");
		
		//name = s.nextInt();
	}
}


class BotsAutos extends Attracties {
		BotsAutos ba = new BotsAutos(); {
		name = 1;
		ba.draait();
	}
}
	
class Spin extends Attracties {
		Spin sp = new Spin(); {
		name = 2;
		sp.draait();
	}
}

class SpiegelPaleis extends Attracties {
		SpiegelPaleis sp = new SpiegelPaleis(); {
		name = 3;
		sp.draait();
		}
}

class SpookHuis extends Attracties {
		SpookHuis sh = new SpookHuis(); {
		name = 4;
		sh.draait();
	}
}

class Hawaii extends Attracties {
		Hawaii hw = new Hawaii();{
		name = 5;
		hw.draait();
	}
}

class LadderKlimmen extends Attracties {
		LadderKlimmen lk = new LadderKlimmen(); {
		name = 6;
		lk.draait();
	}

}