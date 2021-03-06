var E3MALL = {
	checkLogin : function(){
		var _ticket = $.cookie("USER_TOKEN");
		if(!_ticket){
			return ;
		}
		$.ajax({
			url : "http://passport.e3mall.cn:8088/user/query/" + _ticket,
			dataType : "jsonp",
			type : "GET",
			success : function(data){
				if(data.status == 200){
					var username="";
					if(typeof data.data == 'string')
						username = $.parseJSON(data.data).username;
					else
						username=data.data.username;
					var html = username + "，欢迎来到宜立方购物网！<a href=\"\" onclick=\"logout();\" class=\"link-logout\">[退出]</a>";
					$("#loginbar").html(html);
				}
			}
		});
	}
}

function logout(){
	$.ajax({
		url : "http://passport.e3mall.cn:8088/user/logout",
		dataType : "jsonp",
		type : "GET",
		success : function(data){
			if(data.status == 200){
				location.reload();
			}
		}
	});
}

$(function(){
	// 查看是否已经登录，如果已经登录查询登录信息
	E3MALL.checkLogin();
});