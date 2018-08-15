

//material, filler, brand, suitableSeason, isInfantSafe, isHeated
//adjustHeight(int level), pullForward(), pushBack() <functions

public class Seat {

	private String material;
	private String filler;
	private String brand;
	private String suitableSeason;
	private boolean isInfantSafe;
	private boolean isHeated;
	
	public Seat(String material, String filler, String brand, String suitableSeason, boolean isInfantSafe, boolean isHeated){
		this.material = material;
		this.filler = filler;
		this.brand = brand;
		this.suitableSeason = suitableSeason;
		this.isInfantSafe = isInfantSafe; 
		this.isHeated = isHeated;
		
	}
	
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		return "Seat [material=" + material + ", filler=" + filler + ", brand="
				+ brand + ", suitableSeason=" + suitableSeason
				+ ", isInfantSafe=" + isInfantSafe + ", isHeated=" + isHeated
				+ "]";
	}


	/**
	 * @return the material
	 */
	public String getMaterial() {
		return material;
	}
	/**
	 * @param material the material to set
	 */
	public void setMaterial(String material) {
		this.material = material;
	}
	/**
	 * @return the filler
	 */
	public String getFiller() {
		return filler;
	}
	/**
	 * @param filler the filler to set
	 */
	public void setFiller(String filler) {
		this.filler = filler;
	}
	/**
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	/**
	 * @return the suitableSeason
	 */
	public String getSuitableSeason() {
		return suitableSeason;
	}
	/**
	 * @param suitableSeason the suitableSeason to set
	 */
	public void setSuitableSeason(String suitableSeason) {
		this.suitableSeason = suitableSeason;
	}
	/**
	 * @return the isInfantSafe
	 */
	public boolean isInfantSafe() {
		return isInfantSafe;
	}
	/**
	 * @param isInfantSafe the isInfantSafe to set
	 */
	public void setInfantSafe(boolean isInfantSafe) {
		this.isInfantSafe = isInfantSafe;
	}
	/**
	 * @return the isHeated
	 */
	public boolean isHeated() {
		return isHeated;
	}
	/**
	 * @param isHeated the isHeated to set
	 */
	public void setHeated(boolean isHeated) {
		this.isHeated = isHeated;
	}
	
	
	
}
