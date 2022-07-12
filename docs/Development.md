# [Amigoscode, Nelson] Microservices and Distributed Systems [ENG, 2022] Kafka Part


<br/>

### IntellJ Idea (Ultimate)


<br/>

![Application](/img/pic01.png?raw=true)


<br/>

![Application](/img/pic02.png?raw=true)


<br/>

```
// Receive a Message
$ kafka-console-consumer.sh \
    --bootstrap-server localhost:9092 \
    --topic amigoscode \
    --from-beginning

^C
```

<br/>

```
// POST
$ curl \
    --data '{
      "message":"Hooray Amigoscode"
      }' \
    --header "Content-Type: application/json" \
    --request POST \
    --url http://localhost:8080/api/v1/messages \
    | jq
```

<br/>

**UPD! Should be fixed!**

**Looks with Data Format on Reading from Kafka**

<br/>

```
$ kafka-console-consumer.sh \
>     --bootstrap-server localhost:9092 \
>     --topic amigoscode \
>     --from-beginning
{"message":"Hooray Amigoscode","created":[2022,4,9,21,20,9,460259917]}
{"message":"Hooray Amigoscode","created":[2022,4,9,21,22,22,43521562]}
{"message":"Hooray Amigoscode","created":[2022,4,9,21,22,33,600139003]}
{"message":"Hooray Amigoscode","created":[2022,4,9,21,22,41,357558500]}
```

<br/><br/>

---

<br/>

**Marley**

Any questions in english: <a href="https://javadev.org/chat/">Telegram Chat</a>  
Любые вопросы на русском: <a href="https://javadev.ru/chat/">Телеграм чат</a>
