import java.net.UnknownHostException;
import java.sql.SQLException;

import org.hyperic.sigar.SigarException;

import I2L.computerInfo.Computer;
import I2L.databaseActions.DatabaseActions;


public class GpiCore {
	
	public static void launch() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException, UnknownHostException, SigarException
	{
		Computer c = new Computer();
		c.getInfos();
		String q;
		if(!DatabaseActions.isThereAlreadyALine(c.getHostName()))
		{
			System.out.println("Pas de données présentes pour " + c.getHostName());
			q = c.insertQuery();
			DatabaseActions.insertQuery(q);
			
		}
		else
		{
			System.out.println("Données déja existantes pour " + c.getHostName());
			q = c.updateQuery();
			DatabaseActions.insertQuery(q);
		}
		
		
	}

}
