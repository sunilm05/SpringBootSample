$("#add").click(function(){
	//alert('we r here');
	
	var n1 = $('#number1').val();
	if(isNaN(n1) || n1.indexOf('.')>0){
		alert('Please enter interger value for Number 1');
		return;
	}
	
	var n2 = $('#number2').val();
	if(isNaN(n2) || n2.indexOf('.')>0){	
		alert('Please enter interger value for Number 2');
		return;
	}
	
    $.post("http://localhost:8085/springboot/add",
    {
        number1: n1,
        number2: n2
    },
    function(data, status){
    		
    		$('#number1').val(n1);
    	    $('#number2').val(n2);
    		$('#result').text(data);
        //alert("Data: " + data + "\nStatus: " + status);
    });
    
	
	$('.result').text(result);
	
	document.getElementById("total").style.display="block";
});