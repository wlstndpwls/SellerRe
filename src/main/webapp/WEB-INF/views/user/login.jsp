<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

	<!-- CSS -->
	<link rel="stylesheet" href="${pageContext.request.contextPath }/assets/css/user/login(css).css">
</head>
<body>
	<div class="container">
        <div class="logo_container">
            <a href="${pageContext.request.contextPath }/index">
                <img src="${pageContext.request.contextPath }/assets/img/logo.png">
            </a>
        </div>

        <div class="login_container" >
            <form method="post" class="login_form" action="${pageContext.request.contextPath }/user/login">
                
                <div class="id_area">
                    <input type="text" class="user_id" id="user_id" name="user_id" placeholder="아이디를 입력하세요" />
                </div>

                <div class="pw_area">
                    <input type="password" class="user_pw" id="user_pw" name="user_pw" placeholder="비밀번호를 입력하세요" />
                </div>

                <div class="login">
                    <input type="submit" alt="로그인" value="로그인" class="login_btn" />
                </div>
			</form>
			
            <div class="register_area">
            	<span>
                	<a class="register" href="${pageContext.request.contextPath }/user/registerAgree">회원가입</a>
               	</span>
                <span>
                    <a class="find_pw" href="${pageContext.request.contextPath }/user/find_pw"> 비밀번호 찾기</a>
                </span>
            </div>
        </div>

        <!-- copyright -->
        <div id="copyright">
            <p class="copyright">&copy; 2021 Portfolio Web Site </p>
        </div>
    </div>
</body>
</html>