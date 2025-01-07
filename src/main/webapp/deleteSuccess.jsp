<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Delete success page</title>
<style type="text/css">
	 @import url('https://fonts.googleapis.com/css2?family=Lato:wght@400;700&display=swap');
	
	*{
	    margin: 0;
	    padding: 0;
	    box-sizing: border-box;
	}
	body{
	    font-family: 'Lato', sans-serif;
	}
	.outer-box{
	    
	    width: 100vw;
	    height: 100vh;
	    background: linear-gradient(to top left,#3ed8ff,#a8f5ff);
	}
	.inner-box{
	    width: 400px;
	    margin: 0 auto;
	    position: relative;
	    top: 40%;
	    transform: translateY(-50%);
	    padding: 20px 40px;
	    background: linear-gradient(to top left,#ffffffff,#ffffff33);
	    backdrop-filter: blur(8px);
	    border-radius: 8px;
	    box-shadow: 2px 2px 5px #2773a5;
	    z-index: 2;
	}
	.signup-header h1{
	    font-size: 2.5rem;
	    color: #212121;
	}
	.signup-header p{
	    font-size: 0.8rem;
	    color: #555;
	}
	.signup-body {
	    margin: 20px;
	}
	.signup-body p{
	    margin: 10px 0;
	}
	.signup-body p label{
	    display: block;
	    font-weight: bold;
	}
	.signup-body p input{
	    width: 100%;
	    padding: 10px;
	    border: 2px solid #cccc;
	    border-radius:  4px;
	    font-size: 1rem;
	    margin-top: 4px;
	}
	
	.signup-footer p{
	    color: #555;
	    text-align: center;
	}
	.signup-footer p a{
	    color: #07446d;
	}
	.circle{
	    width: 200px;
	    height: 200px;
	    border-radius: 100px;
	    background: linear-gradient(to right,#ffffff33,#ffffffff);
	    position: absolute;
	}
	.c1{
	    top: 100px;
	    left: 40px;
	}
	.c2{
	    bottom: 200px;
	    right: 50px;
	}
</style>
</head>
<body>
	<div class="outer-box">
        <div class="inner-box">
            <header class="signup-header">
                <h1>Successfully  deleted!</h1>
            </header>
            <main class="signup-body">
                <p>Create an account? <a href="register.jsp">Register</a></p>
            </main>
        </div>
        <div class="circle c1"></div>
        <div class="circle c2"></div>
    </div>
</body>
</html>