package com.kgisl.model;


public class Employee {

    private String email;
    private String id;    
    private String name;    
    private String salary;    
    private String designation;
    private String empRole;
    private String projectName;
    private String techLanguage;

    
    public Employee() {
    }
    public Employee(String email, String id, String name, String salary, String designation, String empRole,
            String projectName, String techLanguage) {
        this.email = email;
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.empRole = empRole;
        this.projectName = projectName;
        this.techLanguage = techLanguage;
    }
    public String getId() {
        return id;
    }
    public void setId(String i) {
        this.id = i;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getEmpRole() {
        return empRole;
    }
    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }
    public String getProjectName() {
        return projectName;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getTechLanguage() {
        return techLanguage;
    }
    public void setTechLanguage(String techLanguage) {
        this.techLanguage = techLanguage;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    @Override
    public String toString() {
        return "Employee [email=" + email + ", id=" + id + ", name=" + name + ", salary=" + salary + ", designation="
                + designation + ", empRole=" + empRole + ", projectName=" + projectName + ", techLanguage="
                + techLanguage + "]";
    }
    
}
