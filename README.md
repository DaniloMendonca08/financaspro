# Finan-asPro
API do projeto Finanças Pro - Controle de Despesas pessoais

# Requisitos

- [ ] CRUD de Categorias
- [ ] CRUD de Movimentações
- [ ] CRUD de Usuários
- [ ] Autenticação
- [ ] Dashboard

# Documentação

# Endpoints

- [Listar Categorias](#listar-categorias)
- [Cadastrar Categoria](#cadastrar-categoria)
- [Detalhes da Categoria](#detalhes-da_categoria)
- [Apagar Categoria](#apagar-categoria)
- [Atualizar Categoria](#atualizar-a-categoria)

# Listar Categorias

SOAP - GraphQL - REST

`GET` /categoria

Retorna um array com todas as categorias cadastradas

### Exemplo de Resposta

````js
[
    {
        "id":1,
        "nome": "Alimentação",
        "icone": "fast-food"
    },
    {
        "id":2,
        "nome": "Educação",
        "icone": "book"
    }
]
````

# Código de status

| código | descrição
|--------|-----------
200|Categorias retornadas com sucesso
401|Usuário não autenticado. Realize autenticação em /login

---

# Cadastrar Categoria

`POST` /categoria

Cadastrar uma nova categoria para o usuário logado com os dados enviados em corpo da requisição.

###  Corpo da Requisição

| campo | tipo | obrigatório | descrição
|-------|------|-------------|-----------
|nome|string|ss| Um nome curto para a categoria
|icone| string | nn | O nome do ícone conforme Material Icons

---

````js
{
    "nome": "Alimentação,
    "icone": "fast-food"
}
````

### Exemplo de Resposta

```js
{
    "id":1,
    "nome": "Alimentação",
    "icone": "fast-food"
}
```

# Código de status

| código | descrição
|--------|-----------
201|Categoria cadastrada com sucesso
400|Validação falhou. Verifique as regras para o corpo da requisição
401|Usuário não autenticado. Realize autenticação em /login

---

# Detalhes da Categoria

`GET` /categoria/`{id}`

Retorna os dados detalhados da categoria com o `id` informado no parâmetro de path

# Exemplo de Resposta
```js
//requisição para / categoria/ 1
{
    "id": 1,
    "nome": "Alimentação",
    "icone": "fast-food"
}
```

### Código de status
| código | descrição
|--------|-----------
|200|Dados da categoria retornados com sucesso
|401|Usuário não autenticado. Realize autenticação em /login
|404|Não existe categoria com o `id` informado. Consulte lista em / categoria

---

# Apagar Categoria

`DELETE` /categoria/`{id}`

Apaga a categoria indicada pelo `id` enviado ao parâmetro no path.

## Código de status

| código | descrição
|--------|-----------
|201|Categoria cadastrada com sucesso
|400|Validação falhou. Verifique as regras para o corpo da requisição
|404|Não existe categoria com o `id` informado. Consulte lista em / categoria

---

# Atualizar a Categoria

`PATH` /categoria/ `{id}`

Atualizar os dados da categoria com o `id` informado no path, utilizando os novos dados enviados no corpo da requisição.

### Corpo da Requisição
| campo | tipo | obrigatório | descrição
|-------|------|-------------|-----------
|nome|string|ss| Um nome curto para a categoria
|icone| string | ss | O nome do ícone conforme Material Icons

````js
{
    "nome": "Alimentação",
    "icone": "fast-food"
}
````

# Código de status
| código | descrição
|--------|-----------
|200|Categoria atualizada com sucesso
|201|Categoria cadastrada com sucesso
|400|Validação falhou. Verifique as regras para o corpo da requisição
|404|Não existe categoria com o `id` informado. Consulte lista em / categoria