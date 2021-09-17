<%@page import="com.controller.run"%>
<%@page import="com.controller.insertDataInDb"%>
<%@ page language="java"  contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>peace is the boss</title>
</head>
<body>
<form action = "index.jsp" method = "GET">
         First Name: <input type = "text" name = "first_name" value="1">
         <br />
         Last Name: <input type = "text" name = "last_name" value="1" />
         <input type = "submit" value = "Submit" formaction="l.jsp" />
      </form>
 <h1>Using GET Method to Read Form Data</h1>
      <ul>
         <li><p><b>First Name:</b>
            <%= request.getParameter("first_name")%>
         </p></li>
         <li><p><b>Last  Name:</b>
            <%= request.getParameter("last_name")%>
         </p> <p>my number is 
         <% 
         out.println(run.run2(request.getParameter("first_name"), request.getParameter("last_name"))); %>
         
         <% insertDataInDb.insert(); %>
         </p>
         </li>
      </ul>
      <p></p>
      <div id="map"></div>

    <!-- Async script executes immediately and must be after any DOM elements used in callback. -->
    <script
      src="https://maps.googleapis.com/maps/api/js?key=YOUR_API_KEY&callback=initMap&libraries=&v=weekly"
      async
    ></script>
</body>
</html>
</html> 