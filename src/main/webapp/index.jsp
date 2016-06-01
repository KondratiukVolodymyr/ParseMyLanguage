<%@ page contentType="text/html;charset=utf-8" %>
<%@ page import="java.util.*, parse.Parser" %>
<html>
  <head>

    <script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
    <script type="text/javascript">
      google.charts.load('current', {'packages':['corechart']});
      google.charts.setOnLoadCallback(drawChart);
      function drawChart() {

        var data = google.visualization.arrayToDataTable([
          ['Language', 'Quantity of vacancies'],
          <%Parser p = new Parser();%>

          <%for (Map.Entry<String, Integer> result : p.getCountLanguages().entrySet()){%>
          ['<%= result.getKey()%>' , <%= result.getValue()%> ], <%}%>

           ]);

        var options = {
          title: 'Рейтинг мов програмування складений на основі даних про кількість вакансій з сайтів Work.ua та Rabota.ua',
          legend: {position: 'labeled'}


        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));

        chart.draw(data, options);
      }
    </script>
  </head>
  <body style="background-color:#F5FFFA;">
    <div id="piechart" style="width: 1330px; height: 700px; backgroundColor: #F5FFFA; legend.position:'labeled'; display: block; margin: 0 auto;"></div>
  </body>
</html>



