function addCicek() {
	$('#cicekDialog').dialog("option", "title", 'Add cicek');
	$('#cicekDialog').dialog('open');
}

function editCicek(id) {

	$.get("get/" + id, function(result) {

		$("#cicekDialog").html(result);

		$('#cicekDialog').dialog("option", "title", 'Edit cicek');

		$("#cicekDialog").dialog('open');

		initializeDatePicker();
	});
}

function initializeDatePicker() {
	$(".datepicker").datepicker({
		dateFormat : "yy-mm-dd",
		changeMonth : true,
		changeYear : true,
		showButtonPanel : true
	});
}

function resetDialog(form) {

	form.find("input").val("");
}

$(document).ready(function() {

	$('#cicekDialog').dialog({

		autoOpen : false,
		position : 'center',
		modal : true,
		resizable : false,
		width : 440,
		buttons : {
			"Save" : function() {
				$('#cicekForm').submit();
			},
			"Cancel" : function() {
				$(this).dialog('close');
			}
		},
		close : function() {

			resetDialog($('#cicekForm'));

			$(this).dialog('close');
		}
	});

	initializeDatePicker();
});
