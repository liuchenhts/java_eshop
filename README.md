# java
Docker composer for java and maven container used as java dev env

1. docker-compose run --rm --service-ports maven bash
2. the above command will start a container for this one-off java development env in a bash shell
3. mvn -DskipTests -Dapp.env=local tomcat7:run, run this command in the bash to deploy app in tomcat server
4. environment variables is defined in .env file or the local env
