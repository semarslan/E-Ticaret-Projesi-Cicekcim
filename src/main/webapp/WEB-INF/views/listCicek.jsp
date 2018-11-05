<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
<title>List Of cicek</title>

<link rel="stylesheet"
	href='<c:url value="/web-resources/lib/bootstrap-3.3.6/css/bootstrap.min.css"/>'>
	
<link rel="stylesheet"
	href='<c:url value="/web-resources/lib/jquery/jquery-ui-1.10.4.custom.css"/>'>

<style type="text/css">
th {
	text-align: left
}
</style>


</head>

<body>
	<div style="width: 95%; margin: 0 auto;">

		<div id="cicekDialog" style="display: none;">
			<%@ include file="cicekForm.jsp"%>
		</div>

		<h1>List Of Cicek</h1>

		<button class="btn btn-primary" onclick="addCicek()">
			<span class="glyphicon glyphicon-plus" aria-hidden="true"></span> Add Cicek
		</button>
		<br>
		<table class="table table-striped table-bordered">
			<thead>
				<tr>
					<th width="4%">S.N</th>
					<th width="12%">Name</th>
					<th width="12%">Code</th>
					<th width="12%">Price</th>
					<th width="12%">Authors</th>
					<th width="12%">ISBN</th>
					<th width="12%">Publisher</th>
					<th width="12%">Published On</th>
					<th width="12%"></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${cicekList}" var="cicek" varStatus="loopCounter">
					<tr>
						<td><c:out value="${loopCounter.count}" /></td>
						<td><c:out value="${cicek.name}" /></td>
						<td><c:out value="${cicek.code}" /></td>
						<td><c:out value="${cicek.price}" /></td>
						<td><c:out value="${cicek.authors}" /></td>
						<td><c:out value="${cicek.isbn}" /></td>
						<td><c:out value="${cicek.publisher}" /></td>
						<td><c:out value="${cicek.publishedOn}" /></td>

						<td><nobr>
								<button class="btn btn-primary"
									onclick="editCicek(${cicek.id});">

									<span class="glyphicon glyphicon-pencil" aria-hidden="true"></span> Edit
								</button>

								<a class="btn btn-primary"
									onclick="return confirm('Are you sure you want to delete this cicek?');"
									href="delete/${cicek.id}"> 
									<span class="glyphicon glyphicon-trash" aria-hidden="true"></span> Delete
								</a>

							</nobr></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>

	<!--  It is advised to put the <script> tags at the end of the document body so they don't block rendering of the page -->
	<script type="text/javascript"
		src='<c:url value="/web-resources/lib/jquery/jquery-1.10.2.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/lib/jquery/jquery-ui-1.10.4.custom.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/lib/jquery/jquery.ui.datepicker.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/lib/bootstrap-3.3.6/js/bootstrap.min.js"/>'></script>
	<script type="text/javascript"
		src='<c:url value="/web-resources/js/js-for-listCicek.js"/>'></script>
</body>
</html>