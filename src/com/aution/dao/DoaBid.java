package com.aution.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.aution.model.*;
import com.training.util.ConnectToSql;

public class DoaBid {

	// DaoProduct dao= new DaoProduct();

	public int bidCreated(ModelBid bidder) {
		/*
		 * String url="jdbc:sqlserver://127.0.0.1;databaseName=OnlineAuction;"; String
		 * user="sa"; String password="Pit.van-11";
		 */
		String Insert_Products_SQL = "insert into bid_details (user_name,amount,email,phone,address) values(?,?,?,?,?);";

		int result = 0;

		// DriverManager.registerDriver(new
		// com.microsoft.sqlserver.jdbc.SQLServerDriver());

		// try(Connection connection=DriverManager.getConnection(url, user, password);
		try {
			PreparedStatement preparedStatement = ConnectToSql.getConnection().prepareStatement(Insert_Products_SQL);

			preparedStatement.setString(1, bidder.getUserName());
			preparedStatement.setString(2, bidder.getAmount());
			preparedStatement.setString(3, bidder.getEmail());
			preparedStatement.setString(4, bidder.getPhoneNumber());
			preparedStatement.setString(5, bidder.getAddress());
			result = preparedStatement.executeUpdate();
		}

		catch (SQLException e) {
			e.printStackTrace();
		}

		return result;
	}

}
