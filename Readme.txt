Spring_Boot_Kafka :

   This is the POC on kafka_batch_listener where I have sent messages in batch from producer to consumer using MAX_POLL_RECORDS_CONFIG as 4



Pre-Requisites(windows) :

Start Zookeeper -
from C:\kafka_2.12-2.1.0\kafka_2.12-2.1.0
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Start Kafka in windows -
from C:\kafka_2.12-2.1.0\kafka_2.12-2.1.0
.\bin\windows\kafka-server-start.bat .\config\server.properties

