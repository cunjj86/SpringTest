<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" pageEncoding="utf-8" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
	<head>
		<title>JRF Korea</title>
		<meta charset="utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=no" />
		<link rel="stylesheet" href="resources/assets/css/main.css" />
        <link rel="stylesheet" type="text/css" href="resources/assets/slick/slick.css"/>
        <link rel="stylesheet" type="text/css" href="resources/assets/slick/slick-theme.css"/>
		<link rel="stylesheet" href="resources/assets/css/noscript.css" />
	</head>
	<body class="no-sidebar is-preload">
        <div id="page-wrapper">

            <!-- Header -->
            <div id="header" style="height: 107.3333px;">

                <%@ include file="include/header.jsp" %>

            </div>

            <!-- Main -->
            <div class="wrapper style2">

                <div class="container">
                    <article id="main" class="special">
                        <header>
                            <h2>Today Rate</h2>
                        </header>
                        <section>
                            <p>Last Update : </p>
                            <div>
                            <table class="default">
	                            <thead>
	                            	<th>Country</th>
	                            	<th>Currency</th>
	                            	<th>￦1(1원)</th>
	                            </thead>
	                            <tbody>
	                            	<c:forEach items="${list}" var="list">
		                            	<tr>
		                            		<td><img src="resources/images/${list.countryname}_flag.png">${list.countryname}</td>
		                            		<td>${list.countrycurrencyshortname}</td>
		                            		<td><fmt:formatNumber value="${list.todayrate}" pattern="###,###,###.#######"/></td>
		                            	</tr>
	                            	</c:forEach>
	                            </tbody>
                            </table>
                            </div>
                        </section>
                    </article>
                    <hr />
                </div>

            </div>

            <%@ include file="include/footer.jsp" %>

        </div>

		<!-- Scripts -->
			<script src="resources/assets/js/jquery.min.js"></script>
			<script src="resources/assets/js/jquery.dropotron.min.js"></script>
			<script src="resources/assets/js/jquery.scrolly.min.js"></script>
			<script src="resources/assets/js/jquery.scrollex.min.js"></script>
			<script src="resources/assets/js/browser.min.js"></script>
			<script src="resources/assets/js/breakpoints.min.js"></script>
			<script src="resources/assets/js/util.js"></script>
			<script src="resources/assets/js/main.js"></script>
            <script type="text/javascript" src="resources/assets/slick/slick.min.js"></script>

	</body>
</html>