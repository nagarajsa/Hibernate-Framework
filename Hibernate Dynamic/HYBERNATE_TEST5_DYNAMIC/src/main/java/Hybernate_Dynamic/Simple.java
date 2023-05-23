package Hybernate_Dynamic;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Simple 
{
	@Id
	private int ID;
	private String NAME;
	private long PHONE_NO;
	private String GENDER;

	public int getID() 
	{
		return ID;
	}

	public void setID(int iD) 
	{
		ID = iD;
	}

	public String getNAME() 
	{
		return NAME;
	}

	public void setNAME(String nAME) 
	{
		NAME = nAME;
	}

	public long getPHONE_NO() 
	{
		return PHONE_NO;
	}

	public void setPHONE_NO(long pHONE_NO) 
	{
		PHONE_NO = pHONE_NO;
	}

	public String getGENDER() 
	{
		return GENDER;
	}

	public void setGENDER(String gENDER) {
		GENDER = gENDER;
	}

	@Override
	public String toString() {
		return "Simple [ID=" + ID + ", NAME=" + NAME + ", PHONE_NO=" + PHONE_NO + ", GENDER=" + GENDER + "]";
	}

	
	
}
