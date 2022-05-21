## Para rodar a aplicação utilize o seguinte comando:
`mvn package && sudo docker-compose up`
A o docker iniciará um container para o banco de dados e um container para a aplicação.
O container para a aplicação irá reiniciar até conseguir uma conexão válida com o banco de dados.
Isso pode levar cerca de 5 minutos. Para builds posteriores, sugiro derrubar apenas a aplicação
e subir um novo container com o comando:
`docker run -p 8080:8080 --network=checkappacessibilidade_mysql-network <id do container>`