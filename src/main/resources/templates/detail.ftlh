<!DOCTYPE html>
<html lang="cs">
<head>
    <meta charset="UTF-8">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    <title>Detail příspěvku</title>
</head>
<body>
<div class="container-fluid">
    <div class="ms-5 me-5 ps-5 pe-5 pt-5 bg-light">
        <h3 class="pb-3">${post.title}</h3>
        <p><b>${post.perex?no_esc}</b></p>
        <p>${post.body?no_esc}</p>
        <nav class="d-flex justify-content-center">
            <a href="/" class="btn btn-outline-secondary">◂ zpět na seznam</a>
        </nav>
    </div>
</div>
</body>
</html>