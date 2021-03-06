package fr.xebia.mowitnow.enumeration;

import fr.xebia.mowitnow.model.Position;

/**
 * Enum�ration des contr�les appliqu�es � une tondeuse
 * 
 * @author Elhadi CHERIFI
 */

public enum Control {
	
	//les diff�rents controles appliqu�es � une tondeuse impl�mentant la m�thode abstraite
	D("D"){
		@Override
		public Position apply(Position position) { return new Position(position.getCoordinates(), position.getOrientation().next());}
	},
	G("G"){
		@Override
		public Position apply(Position position) {return new Position(position.getCoordinates(), position.getOrientation().back());}
	},
	A("A"){
		@Override
		public Position apply(Position position) {return new Position(position.getOrientation().forward(position.getCoordinates()), position.getOrientation());}
	};
	
	private final String control;	

	/**
	 * Constructeur de l'enumeration des contr�les appliqu�es � une tondeuse
	 * @param control
	 */
	private Control(String control) {
		this.control = control;
	}

	/**
	 * M�thode qui r�cup�re le controle � partir d'un string
	 * @return l'orientation
	 */
	public static Control getControl(String dir) {
		if (dir == null) {
            return null;
        }

        switch (dir) {
        case "D":
            return D;
        case "G":
            return G;
        case "A":
            return A;
        default:
            return null;
        }
		
	}

	/**
	 * Getter de l'enumeration controle 
	 * @return the control
	 */
	public String getControl() {
		return control;
	}
	
	
	/**
	 * M�thode abstraite, � impl�menter pour chaque �lement de l'�num qui permet d'appliquer un controle sur la position d'une tondeuse
	 * @param la position initiale de la tondeuse
	 * @return la position actualis�e de la tondeuse apr�s aplication de la commande
	 */
	public abstract Position apply(Position position);	
	
	
}
