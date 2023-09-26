<h1 align="center">
  Place Service
</h1>

<p align="center">
 <img src="https://img.shields.io/static/v1?label=Tipo&message=Desafio&color=8257E5&labelColor=000000" alt="Desafio" />
</p>

API para gerenciar lugares (CRUD) que faz parte [desse desafio](https://github.com/RocketBus/quero-ser-clickbus/tree/master/testes/backend-developer) para pessoas desenvolvedoras backend que se candidatam para a ClickBus.

O projeto foi elaborado [nesse vídeo](https://youtu.be/SsWZ4O9iWuo).

## Tecnologias

- [Spring Boot](https://spring.io/projects/spring-boot)
- [Spring Webflux](https://docs.spring.io/spring-framework/reference/web/webflux.html)
- [Spring Data + R2DBC](https://docs.spring.io/spring-framework/reference/data-access/r2dbc.html)
- [SpringDoc OpenAPI 3](https://springdoc.org/v2/#spring-webflux-support)
- [Slugify](https://github.com/slugify/slugify)

## Práticas adotadas

- SOLID
- Testes automatizados
- Consultas com filtros dinâmicos usando o Query By Example
- API reativa na web e na camada de banco
- Uso de DTOs para a API
- Injeção de Dependências
- Geração automática do Swagger com a OpenAPI 3
- Geração de slugs automática com o Slugify
- Auditoria sobre criação e atualização da entidade

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta [Postman](https://www.postman.com/downloads/):

- POST /places
```
localhost:8080/places

HTTP/1.1 201 OK
Content-Type: application/json

{
    "name": "New Place",
    "slug": "new-place",
    "state": "New State",
    "createdAt": "2023-09-18T18:08:46.1006332",
    "updatedAt": "2023-09-18T18:08:46.1006332"
}
```

- GET /places/{id}
```
x

{
    x
} 
```

- GET /places?name=?
```
x

[
    {
        x
    }
]
```

- PATCH /places/{id}
```
x

{
    x
}
```