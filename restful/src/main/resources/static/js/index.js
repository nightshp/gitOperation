$(function () {

});
function get_restful() {
    $.ajax({
        method: 'get',
        url: "/user/selectAll",//请求路径
        dataType: "json",
        contentType: "application/json;charset=UTF-8",
        success: function (res) {
            //alert(JSON.stringify(res));
            //var con = "";
            // $.each(data, function (i, user) {
            //con += " 用户名:" + res.uName;
            //con += "密码:" + res.uPassword;
            //});
            //$("#con").html(con);
            alert(JSON.stringify(res));
        }
    })
}

function getById_restful() {
    $.ajax({
        method: 'get',
        url: "/user/1",//请求路径
        dataType: "json",
        contentType: "application/json;charset=UTF-8",
        success: function (res) {
            //alert(JSON.stringify(res));
            //var con = "";
            // $.each(data, function (i, user) {
            //con += " 用户名:" + res.uName;
            //con += "密码:" + res.uPassword;
            //});
            //$("#con").html(con);
            alert(JSON.stringify(res));
        }
    })
}

function deleteById_restful() {
    $.ajax({
        method: 'delete',
        url: "/user/1",//请求路径
        dataType: "json",
        contentType: "application/json;charset=UTF-8",
        success: function (res) {
            //alert(JSON.stringify(res));
            //var con = "";
            // $.each(data, function (i, user) {
            //con += " 用户名:" + res.uName;
            //con += "密码:" + res.uPassword;
            //});
            //$("#con").html(con);
            alert(JSON.stringify(res));
        }
    })
}

function insert_restful() {
    var param = {uName:"zhansan",uPassword:"1234"};
    $.ajax({
        method: 'post',
        url: "/user/register",//请求路径
        dataType: "json",
        contentType: "application/json;charset=UTF-8",
        data:JSON.stringify(param),
        success: function (res) {
            //alert(JSON.stringify(res));
            //var con = "";
            // $.each(data, function (i, user) {
            //con += " 用户名:" + res.uName;
            //con += "密码:" + res.uPassword;
            //});
            //$("#con").html(con);
            alert(JSON.stringify(res));
        }
    })
}


function update_restful() {
    var param = {uName:"zhansan",uPassword:"123"};
    $.ajax({
        method: 'put',
        url: "/user/2",//请求路径
        dataType: "json",
        contentType: "application/json;charset=UTF-8",
        data:JSON.stringify(param),
        success: function (res) {
            //alert(JSON.stringify(res));
            //var con = "";
            // $.each(data, function (i, user) {
            //con += " 用户名:" + res.uName;
            //con += "密码:" + res.uPassword;
            //});
            //$("#con").html(con);
            alert(JSON.stringify(res));
        }
    })
}