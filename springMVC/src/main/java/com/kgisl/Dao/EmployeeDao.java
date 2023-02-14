package com.kgisl.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.kgisl.model.Employee;

public class EmployeeDao {
    JdbcTemplate jdbcTemplate;

    public void setTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }

    public int save(Employee emp){
        String sql = "insert into employees(email,id,name,salary,designation,empRole,projectName,techLanguage) values('"+emp.getEmail()+"','"+emp.getId()+"','"+emp.getName()+"','"+emp.getSalary()+"','"+emp.getDesignation()+"','"+emp.getEmpRole()+"','"+emp.getProjectName()+"','"+emp.getTechLanguage()+"')";
        return jdbcTemplate.update(sql);
    }

    public int update(Employee emp){    
        String sql="update employees set id= '"+emp.getId()+"',name='"+emp.getName()+"', salary="+emp.getSalary()+",designation='"+emp.getDesignation()+"',empRole='"+emp.getEmpRole()+"',projectName='"+emp.getProjectName()+"',techLanguage='"+emp.getTechLanguage()+"' where email='"+emp.getEmail()+"'";  
        return jdbcTemplate.update(sql);    
    }    

    public Employee getEmpById(String id){
        String sql = "select * from employees where id="+id+"";
        return jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<Employee>(Employee.class)); 
    }
        
    public int deleted(String id){    
        String sql="delete from employees where id="+id+"";    
        return jdbcTemplate.update(sql);    
    }  

    public List<Employee> getEmployees(){    
        return jdbcTemplate.query("select * from employees",new RowMapper<Employee>(){    
            public Employee mapRow(ResultSet rs, int row) throws SQLException {    
                Employee e=new Employee();  
                e.setEmail(rs.getString(1));
                e.setId(rs.getString(2));    
                e.setName(rs.getString(3));    
                e.setSalary(rs.getString(4));    
                e.setDesignation(rs.getString(5));    
                e.setEmpRole(rs.getString(6));
                e.setProjectName(rs.getString(7));
                e.setTechLanguage(rs.getString(8));
                return e;    
            }    
        });    
    }    
    
    public boolean validateUser (String email){
        int count = jdbcTemplate.queryForObject("select count(*) from employees where email=?",Integer.class,email);
        if(count == 0){
            return true;
        }
        else{
            return false;
        }
    }

    
    
}
