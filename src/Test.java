import java.net.UnknownHostException;
import java.sql.SQLException;

import org.hyperic.sigar.SigarException;

import I2L.computerInfo.Computer;
import I2L.databaseActions.DatabaseActions;


public class Test {

	public static void main(String[] args) throws UnknownHostException, SigarException {
		// TODO Auto-generated method stub
		
		try {
			GpiCore.launch();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
