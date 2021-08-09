<%@page import="banque.web.CreditModel"%>
<%
	CreditModel creditModel = (CreditModel) request.getAttribute("creditModel");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Crédit Banquaire</title>
<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
</head>
<body>
	<div class="container">
		<div class="col-md-6 col-sm-6 col-xm-12 col-md-offset-3">
			<div class="panel panel-primary">
				<div class="panel-heading">Simulateur de crédit</div>
				<div class="panel-body">
					<form action="calcul.do" method="post">
						<div class="form-group">
							<label class="control-label">Montant</label> <input
								class="form-control" type="text" name="montant"
								value="<%=creditModel.getMontant()%>" />
						</div>
						<div class="form-group">
							<label class="control-label">Taux</label> <input
								class="form-control" type="text" name="taux"
								value="<%=creditModel.getTaux()%>" />
						</div>
						<div class="form-group">
							<label class="control-label">Duree</label> <input
								class="form-control" type="text" name="duree"
								value="<%=creditModel.getDuree()%>" />
						</div>
						<div>
							<button type="submit" class="btn btn-danger">Envoyer</button>
						</div>
					</form>
					<div>
						Mensualite =
						<%=creditModel.getMensualite()%>
					</div>
				</div>

			</div>
		</div>
	</div>
</body>
</html>