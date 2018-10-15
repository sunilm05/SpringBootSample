$("button").click(function(){
	//alert('we r here');
	
	var n1 = $('#number1').val();
//	if(!Number.isInteger(n1)){
//		alert('Please enter interger value for n1');
//		return;
//	}
	
	var n2 = $('#number2').val();
//	if(!Number.isInteger(n2)){	
//		alert('Please enter interger value for n2');
//		return;
//	}
	
	var result;
	//alert(n1);
	//alert(n2);
	
    $.post("http://localhost:8085/springboot/add",
    {
        number1: n1,
        number2: n2
    },
    function(data, status){
    		result = data;
    		$('#result').text(result);
        //alert("Data: " + data + "\nStatus: " + status);
    });
    $('#number1').val(n1);
    $('#number1').val(n2);
	
	$('.result').text(result);
});