package io.vpv.kafkalearn.api;

import io.vpv.kafkalearn.service.Producer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RESTProducer {

    private Producer producer;

    public RESTProducer(Producer producer) {
        this.producer = producer;
    }

    @GetMapping("/producer")
    public void getMessageFromClient(@RequestParam("message") String message) {
        producer.sendMessage(message);
    }
}
