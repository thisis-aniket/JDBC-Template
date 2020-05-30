package com.jdbc.jdbcFirst;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/test");
        dataSource.setUsername("root");
        dataSource.setPassword("Aniket@1811#");
        
        JdbcTemplate jdbc = new JdbcTemplate(dataSource);
        
        //String sql = "delete from student where userID = ?";
        //String sql = "update student set userID = ? where userName = ?";
        //String sql = "delete from student where userID = ?";
        String sql = "Insert into student (userName, userID) values (?, ?)";
        
        int result = jdbc.update(sql, "Rahul",3451);
        
        if(result>0) {
        	System.out.println("The ID has been inserted...");
        }
    }
}
