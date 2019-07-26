package com.ikea.cataloguemanagement.itemcategorizer.consumer;

import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import com.ikea.cataloguemanagement.itemcategorizer.avro.ItemVO;

import io.confluent.kafka.serializers.KafkaAvroDeserializer;
import io.confluent.kafka.serializers.KafkaAvroDeserializerConfig;
//import kafka.utils.ShutdownableThread;

public class ItemConsumer
{

	public static void main(String[] args) {
		
		ItemConsumer itemConsumer = new ItemConsumer("retailRange-item");
		//itemConsumer.start();
		itemConsumer.doWork();
	}

	 
    private final KafkaConsumer<String, ItemVO> consumer; 
    private final String topic; 
    
    public static final String KAFKA_SERVER_URL = "localhost"; 
    public static final int KAFKA_SERVER_PORT = 9092; 
    public static final String CLIENT_ID = "ItemDataConsumer";
    private static final Duration duration= Duration.ofMillis(1000);
 
    public ItemConsumer(String topic) { 
        //super("ItemDataConsumer", false); 
        Properties props = new Properties(); 
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, KAFKA_SERVER_URL + ":" + KAFKA_SERVER_PORT); 
        props.put(ConsumerConfig.GROUP_ID_CONFIG, CLIENT_ID); 
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true"); 
        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000"); 
        props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "30000"); 
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer"); 
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,KafkaAvroDeserializer.class.getName());
        //Use Specific Record or else you get Avro GenericRecord.
        props.put(KafkaAvroDeserializerConfig.SPECIFIC_AVRO_READER_CONFIG, "true");
        //Schema registry location.
        props.put(KafkaAvroDeserializerConfig.SCHEMA_REGISTRY_URL_CONFIG,"http://localhost:8081");
 
        consumer = new KafkaConsumer<String, ItemVO>(props); 
        this.topic = topic; 
    } 
 
    //@Override
    public void doWork() {
    	System.out.println("doWork");
        consumer.subscribe(Collections.singletonList(this.topic)); 
        ConsumerRecords<String, ItemVO> records = consumer.poll(duration);
        for (ConsumerRecord<String, ItemVO> record : records) { 
            System.out.println("Received message: (" + record.key() + ", " + record.value() + ") at offset " + record.offset());
    } 
    }
    //@Override
    public String name() { 
        return null; 
    } 
 
    //@Override
    public boolean isInterruptible() { 
        return false; 
    } 

}
