package br.com.msemail.consumers;

import br.com.msemail.dto.EmailDTO;
import br.com.msemail.model.EmailModel;
import br.com.msemail.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class EmailConsumer {

//    @Autowired
//    EmailService emailService;
//
//    @RabbitListener(queues = "${spring.rabbitmq.queue}")
//    public void listen(@Payload EmailDTO emailDto) {
//        EmailModel emailModel = new EmailModel();
//        BeanUtils.copyProperties(emailDto, emailModel);
//        emailService.sendEmail(emailModel);
//    }
}