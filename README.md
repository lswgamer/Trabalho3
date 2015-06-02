# Trabalho3
Sistema de Biblioteca

O usuário do sistema deve informar a data, utilizando uma string no formato "dd MM AAAA", sem aspas, em números.

O documento CSV, caso vá ser utilizado, deve ser nomeado "registro.csv", sem as aspas.

Dentro dele, cada campo deve começar com um de três números:

1 para um usuário.
2 para um livro.
3 para um empréstimo.

Um usuário deve estar no modelo:
Identificador de Usuario (1), Tipo de Usuário (1-3), nome (string), complemento (string que varia dependendo do tipo de usuário), idade (int) e sexo (caracter)
exemplo
1, 3 (comunidade), José da Silva, Rua Carlos, 34, M

Um livro deve estar no modelo:
Identificador de Livro (2), tipo de Livro (0-1), título (string), autor (string), Editora (string), e ano de lançamento (int)
exemplo
2, 1(livro texto), Geografia Avançada, Jair, Danone, 2001

Um empréstimo deve estar no modelo:
Identificador de Empréstimo (3), nome do locatário (string), nome do livro(string), data do empréstimo (string no formato "dd MM AAAA", sem aspas, em números). 
3, José da Silva, Geografia Avançada, 07 06 2014
