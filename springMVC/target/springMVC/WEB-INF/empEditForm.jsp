<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  
        <h1>Edit Employee details</h1>  
       <form:form method="POST" action="/editsave">    
        <table >    
        <!-- <tr>  
        <td></td>    
         <td><form:hidden  path="id" /></td>  
         </tr>    -->
         <tr>
            <td>Email : </td>
            <td><form:input path="email" /></td>
         </tr>
         <tr>
            <td>ID : </td>
            <td><form:input path="id" /></td>
         </tr>
         <tr>    
          <td>Name : </td>   
          <td><form:input path="name"  /></td>  
         </tr>    
         <tr>    
          <td>Salary :</td>    
          <td><form:input path="salary" /></td>  
         </tr>   
         <tr>    
          <td>Designation :</td>    
          <td><form:input path="designation" /></td>  
         </tr>   
         <tr>
            <td>Employee Role : </td>
            <td><form:input path="empRole" /></td>
         </tr>
         <tr>
            <td>Project Name : </td>
            <td><form:input path="projectName" /></td>
         </tr>
         <tr>
            <td>Technical Language : </td>
            <td><form:input path="techLanguage" /></td>
         </tr>
         <tr>    
          <td> </td>    
          <td><input type="submit" value="Edit Save" /></td>    
         </tr>    
        </table>    
       </form:form>    