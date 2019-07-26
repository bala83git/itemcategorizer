package com.ikea.cataloguemanagement.itemcategorizer.producer;
import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.avro.Schema;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.errors.SerializationException;
public class ItemProducer {

	public static void main(String[] args) throws IOException {
		
		Properties props = new Properties();
		props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
		props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
		          io.confluent.kafka.serializers.KafkaAvroSerializer.class);
		props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
		          io.confluent.kafka.serializers.KafkaAvroSerializer.class);
		props.put("schema.registry.url", "http://localhost:8081");
		KafkaProducer producer = new KafkaProducer(props);

		String key = "key4";
		final String schemaLoc = "src/main/avro/item.avsc";
		final File schemaFile = new File(schemaLoc);
		Schema.Parser parser = new Schema.Parser();
		Schema schema = parser.parse(schemaFile);
		GenericRecord avroRecord = new GenericData.Record(schema);
		avroRecord.put("itemNo", "avro4");

		ProducerRecord<Object, Object> record = new ProducerRecord<>("retailRange-item", key, avroRecord);
		try {
		  producer.send(record);
		} catch(SerializationException e) {
		  // may need to do something with it
		}
		// When you're finished producing records, you can flush the producer to ensure it has all been written to Kafka and
		// then close the producer to free its resources.
		finally {
		  producer.flush();
		  producer.close();
		}
	}

}
