package com.rabbitmq.consumer;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
public class ListenerCompra {

    @RabbitListener(queues = {"com.rabbitmq.compra"})
    public void listenCompra(String compra) {
        System.out.println(compra);
    }
}
