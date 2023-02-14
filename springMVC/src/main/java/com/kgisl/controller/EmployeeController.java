package com.kgisl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.kgisl.Dao.EmployeeDao;
import com.kgisl.model.Employee;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;

    @RequestMapping(value="/save",method = RequestMethod.POST)
    public String save(@ModelAttribute ("emp")Employee emp, @RequestParam ("email")String email){
        boolean enter = employeeDao.validateUser(email);
        if(enter == true){
            employeeDao.save(emp);
            return "redirect:/viewEmp";
        }
        else {
            return "redirect:/empForm";
        }
    }
 
    @RequestMapping("/empForm")    
    public String showform(Model m){    
        m.addAttribute("command", new Employee());  
        return "empForm";   
    }    

    @RequestMapping("/viewEmp")    
    public String viewEmp(Model m){
        List<Employee> list = employeeDao.getEmployees();
        m.addAttribute("list",list);  
        return "viewEmp";    
    }   

    @RequestMapping(value="/editemp/{id}")    
    public String edit(@PathVariable String id, Model m){    
        Employee emp=employeeDao.getEmpById(id);   
        m.addAttribute("command",emp);  
        return "empEditForm";    
    }    

    @RequestMapping(value="/editsave",method = RequestMethod.POST)    
    public String editsave(@ModelAttribute("emp") Employee emp){    
        employeeDao.update(emp);    
        return "redirect:/viewEmp";    
    }    

    @RequestMapping(value="/deleteemp/{id}",method = RequestMethod.GET)    
    public String delete(@PathVariable String id){    
        employeeDao.deleted(id);    
        return "redirect:/viewEmp";    
    }   
    
}
