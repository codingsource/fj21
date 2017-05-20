package br.com.codingsource.main;

import java.sql.Connection;
import java.sql.SQLException;

import br.com.codingsource.conect.ConnectionFactory;

public class JDBCExemplo {

	public static void main(String[] args) throws SQLException {

		// Connection conexaoPostgre =
		// DriverManager.getConnection("jdbc:postgresql://localhost/fj21",
		// "postgres", "root");
		// conexaoPostgre.close();

		Connection conexaoMySql = new ConnectionFactory().getConnection();
		System.out.println("Conectado no MySql");
		conexaoMySql.close();
	}

}