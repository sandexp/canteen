package com.github.canteen.controller;

import com.github.canteen.handler.*;
import com.github.canteen.internal.ConfigReader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * TODO 替换掉Spring系列对HTTP C/S模式的支持,这里支持HTTP请求即可,暂时不考虑HTTPS
 */
public class JDBCController {

	private static final ConfigReader configReader=ConfigReader.getReader();

	private static final Logger logging= LoggerFactory.getLogger(JDBCController.class);

	MySQLHandler mySQLHandler;

	OracleHandler oracleHandler;

	PostgreHandler postgreHandler;

	HQLHandler hqlHandler;

	SparkSQLHandler sparkSQLHandler;

	FlinkSQLHandler flinkSQLHandler;

	public Object requestMySQL(
			String username,
			String url,
			String sql){

		return null;
	}

	public Object requestOracle(
			String username,
			String url,
			String sql){
		return null;
	}

	public Object requestPostgre(
			String username,
			String url,
			String sql){
		return null;
	}

	public Object requestHiveSQL(
			String username,
			String url,
			String sql){
		return null;
	}

	public Object requestSparkSQL(
			String username,
			String url,
			String sql){
		return null;
	}

	public Object requestFlinkSQL(
			String username,
			String url,
			String sql){
		return null;
	}

}
