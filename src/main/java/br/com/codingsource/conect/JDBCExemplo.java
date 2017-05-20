package br.com.codingsource.conect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExemplo {

	public static void main(String[] args) throws SQLException {
		Connection conexaoMySql = DriverManager.getConnection("jdbc:mysql://localhost/fj21", "root", "root");
		System.out.println("Conectado no MySql!");
		conexaoMySql.close();
		
		Connection conexaoPostgre = DriverManager.getConnection("jdbc:postgresql://localhost/fj21", "postgres", "root");
		System.out.println("Conectado no Postgre");
		conexaoPostgre.close();
	}

}
