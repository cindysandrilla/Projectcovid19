<!doctype html>
<html lang="en">
<head>
<meta charset="utf-8">
<meta name="apple-mobile-web-app-capable" content="yes">
<meta name="mobile-web-app-capable" content="yes">
<title>No Connection</title>

<!-- Stylesheets-->
<style type="text/css">
        body{
        background: #E1e1e1;
        }

        #cloud{
        width: 300px;
        height: 120px;
        background: #676767;

        background: -webkit-linear-gradient(-90deg,#676767 5%, #676767 100%);

        -webkit-border-radius: 100px;
        -moz-border-radius: 100px;
        border-radius: 100px;

        position: relative;

        margin: 150px auto 0;
        opacity: .5;
        }

        #cloud:before, #cloud:after{
        content: '';
        position:absolute;
        background: #676767;
        z-index: -1;
        }

        #cloud:after{
        width: 100px;
        height: 100px;
        top: -50px;
        left:50px;

        -webkit-border-radius: 100px;
        -moz-border-radius: 100px;
        border-radius: 100px;
        }

        #cloud:before{
        width: 120px;
        height: 120px;
        top: -70px;
        right: 50px;

        -webkit-border-radius: 200px;
        -moz-border-radius: 200px;
        border-radius: 200px;
        }

        .shadow {
        width: 300px;
        position: absolute;
        bottom: -10px;
        background: black;
        z-index: -1;

        -webkit-box-shadow: 0 0 25px 8px rgba(0,0,0,0.4);
        -moz-box-shadow: 0 0 25px 8px rgba(0,0,0,0.4);
        box-shadow: 0 0 25px 8px rgba(0,0,0,0.4);

        -webkit-border-radius: 50%;
        -moz-border-radius: 50%;
        border-radius: 50%;

        }

        h2 {
        color: #fff;
        font-size: 20px;
        padding-top: 15px;
        text-align: center;
        margin: 5px auto;
        }

        h4 {
        color: #fff;
        font-size: 12px;
        margin: 0 auto;
        padding: 0;
        text-align: center;
        }

</style>

<body>
<div id="cloud"> <h2>No Connection :(</h2>
<h4>Check your WiFi or Mobile Internet!</h4>
<span class="shadow"></span></div>

</body>
</html>