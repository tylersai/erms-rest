package com.thesaihan.erms.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.thesaihan.erms.model.Subject;

@Component
public class SubjectDao {

	public boolean save(Subject sub){
		try {
			PreparedStatement stmt=Connector.CON.prepareStatement(
				"insert into subject values(?,?,?,?,?,?)");
			stmt.setString(1, sub.getSub_code());
			stmt.setString(2, sub.getSub_name());
			stmt.setString(3, sub.getDept_id());
			stmt.setInt(4, sub.getSub_pass());
			stmt.setInt(5, sub.getSub_distinction());
			stmt.setInt(6, sub.getSub_excellent());
			
			return stmt.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean delete(String sub_code){
		try {
			PreparedStatement stmt=Connector.CON.prepareStatement(
				"delete from subject where sub_code=?");
			stmt.setString(1, sub_code);
			
			return stmt.executeUpdate() > 0;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public List<Subject> getAllSubjects(){
		List<Subject> list = new ArrayList<Subject>();
		try {
			PreparedStatement stmt=Connector.CON.prepareStatement(
				"select * from subject");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				Subject sub = new Subject();
				
				sub.setDept_id(rs.getString("dept_id"));
				sub.setSub_code(rs.getString("sub_code"));
				sub.setSub_distinction(rs.getInt("sub_distinction"));
				sub.setSub_excellent(rs.getInt("sub_excellent"));
				sub.setSub_name(rs.getString("sub_name"));
				sub.setSub_pass(rs.getInt("sub_pass"));
				
				list.add(sub);
			}
			return list;
		} catch (SQLException e) {
			e.printStackTrace();
			return list;
		}
	}
	
	public Map<String, String> getSubjectCodeAndName(){
		Map<String, String> subCodeAndName = new HashMap<String, String>();
		try {
			PreparedStatement stmt=Connector.CON.prepareStatement(
				"select sub_code, sub_name from subject");
			ResultSet rs = stmt.executeQuery();
			while(rs.next()){
				subCodeAndName.put(rs.getString(1), rs.getString(2));
			}
			return subCodeAndName;
		} catch (SQLException e) {
			e.printStackTrace();
			return subCodeAndName;
		}
	}
	
	
}
