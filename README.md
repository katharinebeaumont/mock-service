# Mock Service

Requirements:
- Java8
- Maven

To package:

- In the mock-service folder, run
`mvn install`

This mocks a service run by a monitoring agent. It is started up by the monitoring agent. 
Currently, it simply responds to a heartbeat request.

- To run the service from the command line:

- Choose a port (e.g. 9000), a logging file name (e.g. twitterClient-log.txt), and ensure you have the location of the monitoring agent (e.g. 9010). Also ensure you have named the jar correctly (e.g. for the monitoring agent, it might be called 'twitterClient.jar'.

`java -jar -Dserver.port=9000 -Dlogging.file=twitterClient-log.txt -Dmonitoring.port=9010 -Dname=twitterClient twitterClient.jar`