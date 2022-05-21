FROM openjdk:13-alpine

COPY ./target/CheckAppAcessibilidade_banco_dados_inspecao_3-1.0-SNAPSHOT.jar /opt
WORKDIR /opt

EXPOSE 8080

CMD java -jar CheckAppAcessibilidade_banco_dados_inspecao_3-1.0-SNAPSHOT.jar