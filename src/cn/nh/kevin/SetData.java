/**
 * @Title: SetData.java
 * @Description:
 * @Copyright: Copyright (c) 2018 
 * @Company:nuaa
 * @author xck&kevin
 * @date 2019年6月17日
 * @version 1.0
 */
package cn.nh.kevin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 * @author Kevin
 *
 */
public class SetData {
    // JDBC
    public static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    public static final String JDBC_URL = "jdbc:mysql://localhost:3306/school";
    public static final String JDBC_USERNAME = "kevin";
    public static final String JDBC_PASSWORD = "19980910";
    
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
    	Class.forName(JDBC_DRIVER);
		Connection connection = DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
		
				
	}
}
