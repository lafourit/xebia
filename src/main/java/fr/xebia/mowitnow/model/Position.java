package fr.xebia.mowitnow.model;

import fr.xebia.mowitnow.enumeration.Orientation;


/**
 * Classe de mapping de la position d'une tondeuse
 * 
 * @author Elhadi CHERIFI
 * 
 */
public class Position {
	
	/**
	 * Constructeur de la classe
	 * @param coordinates
	 * @param orientation
	 */
	public Position(Coordinates coordinates, Orientation orientation) {
		this.coordinates = coordinates;
		this.orientation = orientation;
	}

	//coordonn�es d'une tondeuse
	private Coordinates coordinates;
	
	//orientation d'une tondeuse
	private Orientation orientation;

	/**
	 * Getter des coordonn�es d'une tondeuse
	 * @return the coordinates
	 */
	public Coordinates getCoordinates() {
		return coordinates;
	}

	/**
	 * Setter des coordonn�es d'une tondeuse
	 * @param coordinates the coordinates to set
	 */
	public void setCoordinates(Coordinates coordinates) {
		this.coordinates = coordinates;
	}

	/**
	 * Getter de l'orientation d'une tondeuse
	 * @return the orientation
	 */
	public Orientation getOrientation() {
		return orientation;
	}

	/**
	 * Setter de l'orientation d'une tondeuse
	 * @param orientation the orientation to set
	 */
	public void setOrientation(Orientation orientation) {
		this.orientation = orientation;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return coordinates + " " + orientation + "\n";
	}
	
	
	
	

}