[#ftl]
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>One dice</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Dancing+Script&display=swap" rel="stylesheet">
    <link rel="stylesheet" href="/css/twoDices.css">
</head>
<body>

    <div class="container">

        <div class="dice">
          <img src="/css/dice-${dice1}.svg"/>
        </div>

        <div class="dice">
            <img src="/css/dice-${dice2}.svg"/>
        </div>

    </div>

    <div class="buttonContainer">
         <div class="button">
              <a href="http://localhost:8080/twoDices">Roll again</a>
         </div>

         <div class="button">
               <a href="http://localhost:8080">Back</a>
         </div>
    </div>

</body>
</html>