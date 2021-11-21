## Exercício aula de Programação Orientada à Objetos

-- Conceitos básicos de padrões de projeto DAO e Factory

- DAO : Data Access Object

Padrão de projeto que separa a lógica de negócios da lógica de persistência de dados.

Permite mudar a forma de persistência sem influenciar a lógica de negócio.

Geralmente implementa uma Interface e sua classe possui final Dao. Ex.: ProdutoDao

- Factory

Padrão de projeto que encapsula a conexão com o Banco de Dados e posteriores interações.

** Connection Factory: Lida com as configurações específicas do SGBD utilizado. Realiza e retorna a conexão.

** Dao Factory: Utiliza interfaces para proteger e padronizar a implementação. Permite inejçãode dependência sem explicitar a implementação.

#### Exemplo prático

Como exemplo prático foi criado um novo projeto com Maven: agenda de contatos. Implementando um CRUD no padrão DAO e Connection Factory.



