<!DOCTYPE html>
<html>
<head>
    <title>Seznam příspěvků</title>
</head>
<body>
<h1>Seznam příspěvků</h1>
<table>
    <thead>
    <tr>
        <th>Autor</th>
        <th>Titulek</th>
        <th>Náhled</th>
        <th>Publikováno</th>
    </tr>
    </thead>
    <tbody>
    <#if posts?has_content>
        <#list posts.content as post>
            <tr>
                <td>${post.author}</td>
                <td>${post.title}</td>
                <td>${post.perex}</td>
                <td>${post.published?date?string('dd.MM.yyyy')}</td>
                <td><a class="btn btn--outline" href="/post/${post.slug}">Přečíst</a></td>
            </tr>
        </#list>
    <#else>
        <tr>
            <td colspan="4">Žádné příspěvky nebyly nalezeny.</td>
        </tr>
    </#if>
    </tbody>
</table>
</body>
</html>