$(document).ready(function() {
	
	var activeTab = $("#loginHiddenId").val();
	
	if(activeTab=="Login") {
		$("#loginIdDiv").show();
		$("#registerIdDiv").hide();
	}else{
		$("#loginIdDiv").hide();
		$("#registerIdDiv").show();
	}
    
	$("#loginId").click(function(){
		alert("hi");
	});
	
	$("#registerId").click(function(){
		alert("hi");
	});
    
});





