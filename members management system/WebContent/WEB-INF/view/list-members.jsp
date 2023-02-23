<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE html>

<html>
    
    <head>
        
        <title>List Members</title> 
    </head>
    
    <body>
    <table>
        <tr>
           <th>First Name</th>
           <th>Last Name</th>
           <th>Email</th>
           <th>Committee</th>             
        </tr>
    <c:forEach var = "member" items ="${members}">
        <tr>
           
           <td>${member.firstName}</td>
           <td>${member.lastName}</td>
           <td>${member.email}</td>
            <td>${member.committee}</td>
           
        </tr>
    
    </c:forEach>
    
    
    </table>    
    
    </body>


</html>
